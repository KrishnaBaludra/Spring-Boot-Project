package com.ex.boot3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ex.boot3.beans.EmpTo;
import com.ex.boot3.beans.Response;
import com.ex.boot3.services.EmpService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/emp")
public class EmpController {

	@Autowired
	EmpService service;

	@PostMapping(value = "/authenticate")
	public Response authenticate(@RequestParam Integer empId, @RequestParam String password) {
		System.out.println("UserName:" + empId);
		EmpTo empTo = service.authenticateAndFetch(empId, password);
		Response response = new Response();
		response.setMessage("SUCCESS");
		response.setData(empTo);
		response.setStatus(200);

		return response;
	}

}
