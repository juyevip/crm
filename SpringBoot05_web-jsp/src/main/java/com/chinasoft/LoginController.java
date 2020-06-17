package com.chinasoft;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {



	@RequestMapping("/login")
	public String login()
	{
		System.out.println(11111);
		return "index";  
	}
	
	@RequestMapping("/loginSuccess")
	public String loginSuccess()
	{
		return "success";
	}
}


