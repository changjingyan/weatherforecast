package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {

	@RequestMapping("/pagemain")
	public String pageMain() {
		System.out.println("to pageMain...");
		return "weatherinfo";
	}

}
