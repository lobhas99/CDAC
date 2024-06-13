package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Address;
import com.app.pojos.Employee;
import com.app.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService adrService;

	// show add adr form
	// http://host:port/ctx/address/assign , method=GET
	@GetMapping("/assign")
	public String showAddAddressForm(Address adr) {
		System.out.println("in show adr form "+adr);
		return "/address/add";
	}

	// process add adr form
	// http://host:port/ctx/address/assign , method=POST
	@PostMapping("/assign")
	public String processAddAddressForm(Address adr, HttpSession session) {
		Long empId = ((Employee) session.getAttribute("emp_details")).getId();
		System.out.println("in process adr form " + adr+" "+empId);
		session.setAttribute("message",adrService.assignEmpAddress(empId,adr));
		return "redirect:/employees/details";
	}
}
