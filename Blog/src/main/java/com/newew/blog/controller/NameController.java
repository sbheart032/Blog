package com.newew.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newew.blog.dto.NameDTO;
import com.newew.blog.service.NameService;

@Controller
public class NameController {

	@Autowired
	NameService nameService;
	
	@RequestMapping("/main/name")
	public String name(Model model) {
		NameDTO nameDTO = nameService.getName();
		System.out.println("name = " + nameDTO.getName());
		model.addAttribute("name",nameDTO.getName());
		
		return "/main/name";
	}
	/*
	@RequestMapping("/main/login")
	public String login(Model model) {
		return "/main/login";
	}
	
	@RequestMapping("/main/callback")
	public String callback(Model model) {
		return "/main/callback";
	}
	*/
}//class
