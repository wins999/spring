package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class Controller2 {
	
	@RequestMapping({"/add","/update","/delete","/list"})
	public String customerAdd() {
		return "customeradd";
	}
/*
	@RequestMapping("/update")
	public String customerUpdate() {
		return "customerupdate";
	}
	
	@RequestMapping("/delete")
	public String customerDelete() {
		return "customerdelete";
	}
	
	@RequestMapping("/list")
	public String customer() {
		return "list";
	}*/
}
