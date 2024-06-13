package com.fashionsuperior.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fashionsuperior.exception.ProductException;
import com.fashionsuperior.model.Category;
import com.fashionsuperior.model.Product;
import com.fashionsuperior.repository.CategoryRepository;
import com.fashionsuperior.repository.ProductRepository;
import com.fashionsuperior.request.CreateProductRequest;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;

	public ProductServiceImpl(ProductRepository productRepository,
			CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Product createProduct(CreateProductRequest req) {
		Category masterCategory = categoryRepository.findByName(req.getMasterCategory());
		if (masterCategory == null) {
			Category newMasterCategory = new Category();
			newMasterCategory.setName(req.getMasterCategory());
			newMasterCategory.setLevel(1);
			masterCategory = categoryRepository.save(newMasterCategory);
		}
		Category parentCategory = categoryRepository.findByNameAndParent(req.getParentCategory(),
				masterCategory.getName());
		if (parentCategory == null) {
			Category newParentCategory = new Category();
			newParentCategory.setName(req.getParentCategory());
			newParentCategory.setParentCategory(masterCategory);
			newParentCategory.setLevel(2);
			parentCategory = categoryRepository.save(newParentCategory);
		}
		Category mainCategory = categoryRepository.findByNameAndParent(req.getMainCategory(), parentCategory.getName());
		if (mainCategory == null) {
			Category newMainCategory = new Category();
			newMainCategory.setName(req.getMainCategory());
			newMainCategory.setParentCategory(parentCategory);
			newMainCategory.setLevel(3);
			mainCategory = categoryRepository.save(newMainCategory);
		}
		Product product = new Product();
		product.setTitle(req.getTitle());
		product.setColour(req.getColour());
		product.setDescription(req.getDescription());
		product.setDiscountedPrice(req.getDiscountedPrice());
		product.setDiscountPercent(req.getDiscountPercent());
		product.setImageUrl(req.getImageUrl());
		product.setBrand(req.getBrand());
		product.setPrice(req.getPrice());
		product.setSizes(req.getSize());
		product.setQuantity(req.getQuantity());
		product.setCategory(mainCategory);
		product.setCreatedAt(LocalDateTime.now());
		Product newProduct = productRepository.save(product);
		System.out.println("products - "+product);

		return newProduct;
	}

	@Override
	public String deleteProduct(Long productId) throws ProductException {
		Product product = findProductById(productId);
		product.getSizes().clear();
		productRepository.delete(product);
		return "Product Deleted Successfully";
	}

	@Override
	public Product updateProduct(Long productId, Product req) throws ProductException {
		Product product = findProductById(productId);
		if (req.getQuantity() != 0)
			product.setQuantity(req.getQuantity());
		return productRepository.save(product);
	}

	@Override
	public Product findProductById(Long productId) throws ProductException {
		Optional<Product> opt = productRepository.findById(productId);
		if (opt.isPresent())
			return opt.get();
		throw new ProductException("Product Not Found with Id: " + productId);
	}

	@Override
	public List<Product> findProductByCategory(String cat) {
	List<Product> products = productRepository.findByCategory(cat);
		return products;
		
	}

	@Override
	public Page<Product> getAllProduct(String category, List<String> colours, List<String> sizes, Integer minPrice,
			Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		List<Product> products = productRepository.filterProducts(category, minPrice, maxPrice, minDiscount, sort);
		if (!colours.isEmpty()) 
			products = products.stream().filter(p -> colours.stream().anyMatch(c -> c.equalsIgnoreCase(p.getColour())))
					.collect(Collectors.toList());
		if (stock != null) {
			if (stock.equals("in_stock")) {
				products = products.stream().filter(p -> p.getQuantity() > 0).collect(Collectors.toList());
			} else if (stock.equals("out_of_stock")) {
				products = products.stream().filter(p -> p.getQuantity() < 1).collect(Collectors.toList());
			}
		}
		int startIndex=(int)pageable.getOffset();
		int endIndex=Math.min(startIndex+ pageable.getPageSize(),products.size());
		List<Product> pageContent=products.subList(startIndex, endIndex);
		Page<Product>filteredProducts=new PageImpl<>(pageContent,pageable,products.size());
		return filteredProducts;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> recentlyAddedProduct() {
		return productRepository.findTop10ByOrderByCreatedAtDesc();
	}

	@Override
	public List<Product> searchProduct(String q) {
		// TODO Auto-generated method stub
		return null;
	}
}
