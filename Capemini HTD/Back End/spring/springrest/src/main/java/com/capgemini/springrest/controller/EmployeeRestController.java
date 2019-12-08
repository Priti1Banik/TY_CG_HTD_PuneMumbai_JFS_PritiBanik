package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.beans.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/getEmployee",
			produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}) //this will allow producer to produce output both at xml and json
	//@ResponseBody
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if(employeeInfoBean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Delete");
			response.setEmployeeInfoBean(employeeInfoBean);
			}else {
				response.setStatusCode(401);
				response.setMessage("Failed");
				response.setDescription("Employee Id" + empId + "Not Found");
		}
		return response;
	}

	@PutMapping(path = "/addEmployee",
			consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
			produces = MediaType.APPLICATION_JSON_VALUE)
	//produces = MediaType.APPLICATION_XML_VALUE)
	//@ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded =  service.addEmployee(employeeInfoBean);
		
		EmployeeResponse response = new EmployeeResponse();
		if(isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Added");
			}else {
				response.setStatusCode(401);
				response.setMessage("Failed");
				response.setDescription("Employee is not Added");
		}
		return response;
	}

	@DeleteMapping(path = "/deleteEmployee",
			produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public EmployeeResponse deleteEmployee(int empId) {
boolean isDeleted =  service.deleteEmployee (empId);
		
		EmployeeResponse response = new EmployeeResponse();
		if(isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Delete");
			}else {
				response.setStatusCode(401);
				response.setMessage("Failed");
				response.setDescription("Employee is not Deleted");
		}
		return response;
	}

	@PostMapping(path = "/updateEmployee",
			consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	//@ResponseBody
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
boolean isUpdated =  service.updateEmployee(employeeInfoBean);
		
		EmployeeResponse response = new EmployeeResponse();
		if(isUpdated) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Updated");
			}else {
				response.setStatusCode(401);
				response.setMessage("Failed");
				response.setDescription("Employee is not updated");
		}
		return response;
	}

	@GetMapping("/getAll")
	public EmployeeResponse getAllEmployees() {
		List<EmployeeInfoBean> employeeList = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		if(employeeList != null && !employeeList.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Found");
			response.setEmployeeList(employeeList);
			}else {
				response.setStatusCode(401);
				response.setMessage("Failed");
				response.setDescription("Unable to ftech employee record");
		}
		return response;
	
	}
}