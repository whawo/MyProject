package com.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproject.entity.MemberDto;
import com.myproject.entity.MemberImgDto;
import com.myproject.repository.ItemDao;
import com.myproject.repository.MemberDao;

@Controller
public class TestController {
	
	@Autowired
	private ItemDao itemDao;
	
	
	@Autowired
	private MemberDao memberDao;
	

	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("item", itemDao.selectList());
		
		return "test/Test";
	}
	
	//회원가입
	@GetMapping("/insert")
	public String insert() {
		return "member/insert";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute MemberDto memberDto,
						@ModelAttribute MemberImgDto memberImgDto) {
		memberDao.insert(memberDto);
		memberDao.memberProfileInsert(memberImgDto);
		return "redirect:insert_success";
	}
}
