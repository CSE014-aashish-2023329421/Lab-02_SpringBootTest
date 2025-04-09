package com.aashish.Springboottest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/hi")
	public String call ()
	{
		System.out.println("For Test");
		return "index";
	}
}
