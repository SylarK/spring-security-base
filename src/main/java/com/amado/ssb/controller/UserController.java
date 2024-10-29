package com.amado.ssb.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
public class UserController {

	@GetMapping("/user")
	public String user(Model model, Principal principal) {
		UserDetails currentUser = (UserDetails) ((Authentication) principal).getPrincipal();
		model.addAttribute("username", currentUser.getUsername());
		return "user";
	}

}
