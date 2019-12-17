package com.capgemini.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.springmvc.beans.AdminInfoBean;
import com.capgemini.springmvc.beans.AdminResponseBean;
import com.capgemini.springmvc.beans.CartBean;
import com.capgemini.springmvc.beans.MedicineInfoBean;
import com.capgemini.springmvc.beans.UserInfoBean;
import com.capgemini.springmvc.beans.UserRequestBean;
import com.capgemini.springmvc.service.MedicalService;

@Controller
public class SpringMvcController {

	@Autowired
	private MedicalService service;

	@RequestMapping(path = "/homepage", method = RequestMethod.GET)
	public ModelAndView displayWelcomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("homepage");
		return modelAndView;
	}

	@RequestMapping(path = "/about")
	public ModelAndView aboutUs() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("aboutUs");
		return modelAndView;
	}

	@RequestMapping(path = "/userRegistration")
	public ModelAndView displayUserRegistration(UserInfoBean userInfoBean) {
		ModelAndView modelAndView = new ModelAndView();
		service.addUser(userInfoBean);
		modelAndView.setViewName("userRegistration");
		return modelAndView;
	}

	@PostMapping("/addUser")
	public String addUser(UserInfoBean userInfoBean, HttpSession session, ModelMap modelMap) {

		if (service.addUser(userInfoBean)) {
			modelMap.addAttribute("msg", "User added successfully");
		} else {
			modelMap.addAttribute("msg", "Unable to add User");
		}
		return "addUser";
	}

	@RequestMapping(path = "/loginForm", method = RequestMethod.GET)
	public ModelAndView displayLogin() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginForm");
		return modelAndView;
	}

	@PostMapping("/adminLogin")
	public String adminLogin(String username, String password, ModelMap modelMap, HttpServletRequest req) {
		AdminInfoBean adminInfoBean = service.authenticate(username, password);
		if (adminInfoBean != null) {
			// valid credentials
			HttpSession session = req.getSession(true);
			session.setAttribute("AdminInfoBean", adminInfoBean);
			return "adminHomePage";
		} else {
			// invalid credentials
			modelMap.addAttribute("msg", "Invalid Credentials..");
			return "loginForm";
		}
	}

	@RequestMapping(path = "/addProductForm", method = RequestMethod.GET)
	public ModelAndView displayAddProduct(MedicineInfoBean medicineInfoBean) {
		ModelAndView modelAndView = new ModelAndView();
		service.addProduct(medicineInfoBean);
		modelAndView.setViewName("addProductForm");
		return modelAndView;
	}

	@PostMapping("/addProduct")
	public String addProduct(MedicineInfoBean medicineInfoBean, HttpSession session, ModelMap modelMap) {

		if (service.addProduct(medicineInfoBean)) {
			modelMap.addAttribute("msg", "Product added successfully");
		} else {
			modelMap.addAttribute("msg", "Product not added");
		}
		return "addProductForm";
	}

	@RequestMapping(path = "/updateProduct", method = RequestMethod.GET)
	public ModelAndView displayUpdateProduct(MedicineInfoBean medicineInfoBean) {
		ModelAndView modelAndView = new ModelAndView();
		service.updateProduct(medicineInfoBean);
		modelAndView.setViewName("updateProduct");
		return modelAndView;
	}

	@PostMapping("/updateProduct")
	public String updateProduct(MedicineInfoBean medicineInfoBean, HttpSession session, ModelMap modelMap) {

		if (service.updateProduct(medicineInfoBean)) {
			modelMap.addAttribute("msg", "Product update successfully");
		} else {
			modelMap.addAttribute("msg", "Unable to update product");
		}
		return "updateProduct";
	}

	@RequestMapping(path = "/deleteProduct", method = RequestMethod.GET)
	public ModelAndView displayDeleteProduct() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("deleteProduct");
		return modelAndView;
	}

	@GetMapping("/deleteProduct1")
	public String deleteProduct(int code, HttpSession session, ModelMap modelMap) {

		if (service.deleteProduct(code)) {
			modelMap.addAttribute("msg", "Product Deleted Successfully!");
		} else {
			modelMap.addAttribute("msg", "Product Code " + code + " Not Found!");
		}

		return "deleteProduct";
	}

	@RequestMapping(path = "/deleteUser", method = RequestMethod.GET)
	public ModelAndView displayDeleteUser() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("deleteUser");
		return modelAndView;
	}

	@GetMapping("/deleteUser1")
	public String deleteUser(int userid, HttpSession session, ModelMap modelMap) {

		if (service.deleteUser(userid)) {
			modelMap.addAttribute("msg", "User Deleted Successfully!");
		} else {
			modelMap.addAttribute("msg", "User Code " + userid + " Not Found!");
		}

		return "deleteUser";
	}

	@RequestMapping(path = "/getProductForm", method = RequestMethod.GET)
	public ModelAndView displayGetProduct() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("getProduct");
		return modelAndView;
	}

	@GetMapping("/getProduct")
	public String getProduct(int code, HttpSession session, ModelMap modelMap) {

		MedicineInfoBean medicineInfoBean = service.getProduct(code);
		if (medicineInfoBean != null) {
			modelMap.addAttribute("medicineInfoBean", medicineInfoBean);
		} else {
			modelMap.addAttribute("msg", "Product ID " + code + " Not Found!!!");
		}

		return "getProduct";
	}

	@GetMapping("/seeAllProduct")
	public String getAllProdouct(HttpSession session, ModelMap modelMap) {

		List<MedicineInfoBean> productList = service.getAllProduct();
		modelMap.addAttribute("productList", productList);

		return "getAllProduct";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg", "Logged out successfully");
		return "loginForm";
	}

	@RequestMapping(path = "/loginForm1", method = RequestMethod.GET)
	public ModelAndView displayLogin1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginForm1");
		return modelAndView;
	}

	@PostMapping("/userLogin")
	public String userLogin(String username, String password, ModelMap modelMap, HttpServletRequest req) {
		UserInfoBean userInfoBean = service.authenticate1(username, password);
		if (userInfoBean != null) {
			// valid credentials
			HttpSession session = req.getSession(true);
			session.setAttribute("AdminInfoBean", userInfoBean);
			return "userHomePage";
		} else {
			// invalid credentials
			modelMap.addAttribute("msg", "Invalid Credentials..");
			return "loginForm1";
		}
	}

	@GetMapping("/seeAllProduct1")
	public String getAllProdouct1(HttpSession session, ModelMap modelMap) {

		List<MedicineInfoBean> productList = service.getAllProduct1();
		modelMap.addAttribute("productList", productList);

		return "getAllProduct1";
	}

	@RequestMapping(path = "/getProductUser", method = RequestMethod.GET)
	public ModelAndView displayGetProduct1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("getProduct1");
		return modelAndView;
	}

	@GetMapping("/getProduct1")
	public String getProduct1(int code, HttpSession session, ModelMap modelMap) {
		MedicineInfoBean medicineInfoBean = service.getProduct1(code);
		if (medicineInfoBean != null) {
			modelMap.addAttribute("medicineInfoBean", medicineInfoBean);
		} else {
			modelMap.addAttribute("msg", "Product ID " + code + " Not Found!!!");
		}
		return "getProduct1";
	}

	@RequestMapping(path = "/updateUserForm", method = RequestMethod.GET)
	public ModelAndView displayUpdateUser(UserInfoBean userInfoBean) {
		ModelAndView modelAndView = new ModelAndView();
		service.updateUser(userInfoBean);
		modelAndView.setViewName("updateUser");
		return modelAndView;
	}

	@PostMapping("/updateUser")
	public String updateUser(UserInfoBean userInfoBean, HttpSession session, ModelMap modelMap) {

		if (service.updateUser(userInfoBean)) {
			modelMap.addAttribute("msg", "User update successfully");
		} else {
			modelMap.addAttribute("msg", "Unable to update user");
		}
		return "updateUser";
	}

	@GetMapping("/logout1")
	public String logout1(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg", "Logged out successfully");
		return "loginForm1";
	}

	@GetMapping("/getMessage")
	public String getMessage(HttpSession session, ModelMap modelMap) {
		List<UserRequestBean> messageList = service.getMessage();
		modelMap.addAttribute("messageList", messageList);
		return "getMessage";
	}

	@RequestMapping(path = "/putMessage", method = RequestMethod.GET)
	public ModelAndView displayPutMessage(UserRequestBean userRequestBean) {
		ModelAndView modelAndView = new ModelAndView();
		service.putMessage(userRequestBean);
		modelAndView.setViewName("putMessage");
		return modelAndView;
	}

	@PostMapping("/putMessage1")
	public String putMessage(UserRequestBean userRequestBean, HttpSession session, ModelMap modelMap) {

		if (service.putMessage(userRequestBean)) {
			modelMap.addAttribute("msg", "Message sent successfully");
		} else {
			modelMap.addAttribute("msg", "Message not sent");
		}
		return "putMessage";
	}

	@RequestMapping(path = "/putResponse", method = RequestMethod.GET)
	public ModelAndView displayPutResponse(AdminResponseBean adminResponseBean) {
		ModelAndView modelAndView = new ModelAndView();
		service.putResponse(adminResponseBean);
		modelAndView.setViewName("putResponse");
		return modelAndView;
	}

	@PostMapping("/putResponse1")
	public String putResponse(AdminResponseBean adminResponseBean, HttpSession session, ModelMap modelMap) {

		if (service.putResponse(adminResponseBean)) {
			modelMap.addAttribute("msg", "Response added successfully");
		} else {
			modelMap.addAttribute("msg", "Response not added");
		}
		return "putResponse";
	}

	@RequestMapping(path = "/getResponse", method = RequestMethod.GET)
	public ModelAndView displayGetResponse() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("getResponse");
		return modelAndView;
	}

	@GetMapping("/getResponse1")
	public String getResponse(int id, HttpSession session, ModelMap modelMap) {

		AdminResponseBean adminResponseBean = service.getResponse(id);
		if (adminResponseBean != null) {
			modelMap.addAttribute("adminResponseBean", adminResponseBean);
		} else {
			modelMap.addAttribute("msg", "Response for " + id + " Not Found!!!");
		}

		return "getResponse";
	}

	@RequestMapping(path = "/addMedicine", method = RequestMethod.GET)
	public ModelAndView displayAddMedicine() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addToCart");
		return modelAndView;
	}

	@PostMapping("/addProductToCart")
	public String addMedcine(CartBean cartBean, HttpSession session, ModelMap modelMap) {

		if (service.addMedicine(cartBean) != null) {
			modelMap.addAttribute("msg", "Medicine added to cart successfully");
		} else {
			modelMap.addAttribute("msg", "Medicine not added");
		}
		return "addToCart";
	}

	@RequestMapping(path = "/deleteMedicine", method = RequestMethod.GET)
	public ModelAndView displayDeleteMedicine() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("deleteMedicine");
		return modelAndView;
	}

	@GetMapping("/deleteMedicine1")
	public String removeMedicine(int cartid, CartBean cartBean, HttpSession session, ModelMap modelMap) {

		if (service.removeMedicine(cartBean) != null) {
			modelMap.addAttribute("msg", "Medicine not Deleted ");
		} else {
			modelMap.addAttribute("msg", "Medicine Deleted from cart Successfully!");
		}
		return "deleteMedicine";
	}

	@RequestMapping(path = "/payment", method = RequestMethod.GET)
	public ModelAndView displayPayment() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("payment");
		return modelAndView;
	}

	@GetMapping("/payment1")
	public String payment(int uid, CartBean cartBean, HttpSession session, ModelMap modelMap) {
		double bill = service.payment(uid);
		if (bill != 0.0) {
			modelMap.addAttribute("msg", "The payable amount is "+bill);
		} else {
			modelMap.addAttribute("msg", "Payment for " + uid + " Not Done!!!");
		}
		return "payment";
	}
}
