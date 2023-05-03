package com.dadams28.restapiCalls.controller;

import com.dadams28.restapiCalls.entity.CustomerAccount;
import com.dadams28.restapiCalls.services.InfoService;
import com.dadams28.restapiCalls.services.LoginService;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerAccountController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	InfoService infoService;
	
	@GetMapping("/login")
	public String loginForm(Model model) {
		model.addAttribute("login", new CustomerAccount());
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("loginForm") CustomerAccount cusAcc, RedirectAttributes redirectAttributes) {
		if (loginService.validate(cusAcc.getUsername(), cusAcc.getPassword())) {
			//Successful Validation
            redirectAttributes.addFlashAttribute("customer", cusAcc);
            return "redirect:/customer";
        } else {
        	//Failed Validation --- Creates new Account or overwrites
            redirectAttributes.addFlashAttribute("customer", cusAcc);
            loginService.saveAccount(cusAcc);
            return "redirect:/customer";
        }
	}
	
	@GetMapping("/customer")
    public String showCustomerInfo(Model model, @ModelAttribute("customer") CustomerAccount cusAcc) {
		//cusAcc.getVehicleList(); Sets the VehicleList so that HTML is updated
		model.addAttribute("customer", cusAcc);
		return "customer";
	}
}


