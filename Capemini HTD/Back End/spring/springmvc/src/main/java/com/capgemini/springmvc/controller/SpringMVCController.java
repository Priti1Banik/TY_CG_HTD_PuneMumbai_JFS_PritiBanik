package com.capgemini.springmvc.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.springmvc.beans.UserBean;

@Controller
public class SpringMVCController {
	
	@InitBinder
	public void initbinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}  // end of init binder
	
	//this method is also called handled method
	@RequestMapping(path="/hello",method = RequestMethod.GET)
	public ModelAndView displayHelloUser() {
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("/WEB-INF/views/helloUser.jsp");
		modelAndView.setViewName("helloUser");
		return modelAndView;
	}// end of first method
	
	@RequestMapping(path="/loginForm",method = RequestMethod.GET)
	public ModelAndView displayLogin() {
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("/WEB-INF/views/loginForm.jsp");
		modelAndView.setViewName("loginForm");
		return modelAndView;
	}// end of second method
	
	@RequestMapping(path="/login",method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, ModelAndView modelAndView) {
		String empIdVal = req.getParameter("empId");
		String password = req.getParameter("password");
		req.setAttribute("empId",empIdVal);
		req.setAttribute("password",password);
		//modelAndView.setViewName("/WEB-INF/views/userDetails.jsp");
		modelAndView.setViewName("userDetails");
		return modelAndView;
	}// end of third method
	
	@RequestMapping(path="/login2",method = RequestMethod.POST)
	public String login2(@RequestParam("empId") int empId,
			@RequestParam("password") String password, ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("password", password);
		//return "/WEB-INF/views/userDetails.jsp";
		return "userDetails";
	}//end of fourth method
	
	//@RequestMapping(path="/login3",method = RequestMethod.POST)
	@PostMapping("/login3")
	public String login3(int empId, String password, ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("password", password);
		return "userDetails";
	}//end of fifth method
	
	@PostMapping("/login4")
	public String login4(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("UserBean", userBean);
		return "userDetails";
	}
}// end of controller
	