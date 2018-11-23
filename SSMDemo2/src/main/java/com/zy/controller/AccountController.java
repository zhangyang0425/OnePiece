package com.zy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zy.entity.Account;
import com.zy.services.AccountServices;

@Controller
public class AccountController{

	@Resource(name="aservices")
	private AccountServices as;
	
	@RequestMapping("/account.action")
	public ModelAndView selectAll() {
		List<Account> alist = as.selectAccount();
		ModelAndView mv=new ModelAndView("jsp/selectView");
		mv.addObject("alist",alist);
		mv.addObject("aa","aa");
		return mv;
	}
	
}
