package com.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproject.repository.ItemDao;

@Controller
public class TestController {
	
	@Autowired
	private ItemDao itemDao;

	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("item", itemDao.selectList());
		
		return "test/Test";
	}
}
