package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 08:09
 */

public class BookDao implements AutoCloseable {
	private Connection con;
	private PreparedStatement stmtFindAll;
	private PreparedStatement stmtFindBySubject;
	private PreparedStatement stmtFindById;
	private PreparedStatement stmtUpdate;
	
	public BookDao() throws Exception {
		con = DbUtil.getConnection();
		String sql = "SELECT * FROM books";
		stmtFindAll = con.prepareStatement(sql);
		sql = "SELECT * FROM books WHERE subject=?";
		stmtFindBySubject = con.prepareStatement(sql);
		sql = "SELECT * FROM books WHERE id=?";
		stmtFindById = con.prepareStatement(sql);
		sql = "UPDATE books SET name=?, author=?, subject=?, price=? WHERE id=?";
		stmtUpdate = con.prepareStatement(sql);
	}
	@Override
	public void close() {
		try {
			if(stmtUpdate != null)
				stmtUpdate.close();
			if(stmtFindById != null)
				stmtFindById.close();
			if(stmtFindBySubject != null)
				stmtFindBySubject.close();
			if(stmtFindAll != null)
				stmtFindAll.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Book> findAll() throws Exception {
		List<Book> list = new ArrayList<Book>();
		try(ResultSet rs = stmtFindAll.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String author = rs.getString("author");
				String subject = rs.getString("subject");
				double price = rs.getDouble("price");
				Book b = new Book(id, name, author, subject, price);
				list.add(b);
			}
		} // rs.close();
		return list;
	}

	public List<Book> findBySubject(String subject) throws Exception {
		List<Book> list = new ArrayList<Book>();
		stmtFindBySubject.setString(1, subject);
		try(ResultSet rs = stmtFindBySubject.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String author = rs.getString("author");
				subject = rs.getString("subject");
				double price = rs.getDouble("price");
				Book b = new Book(id, name, author, subject, price);
				list.add(b);
			}
		} // rs.close();
		return list;
	}

	public Book findById(int id) throws Exception {
		stmtFindById.setInt(1, id);
		try(ResultSet rs = stmtFindById.executeQuery()) {
			if(rs.next()) {
				id = rs.getInt("id");
				String name = rs.getString("name");
				String author = rs.getString("author");
				String subject = rs.getString("subject");
				double price = rs.getDouble("price");
				Book b = new Book(id, name, author, subject, price);
				return b;
			}
		} // rs.close();
		return null;
	}
	
	public int update(Book b) throws Exception {
		stmtUpdate.setString(1, b.getName());
		stmtUpdate.setString(2, b.getAuthor());
		stmtUpdate.setString(3, b.getSubject());
		stmtUpdate.setDouble(4, b.getPrice());
		stmtUpdate.setInt(5, b.getId());
		int count = stmtUpdate.executeUpdate();
		return count;
	}
}











