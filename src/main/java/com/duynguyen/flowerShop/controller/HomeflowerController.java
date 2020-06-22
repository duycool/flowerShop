package com.duynguyen.flowerShop.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeflowerController {
	@RequestMapping(value = {"/home", "/"}, method = RequestMethod.GET)
	public String hello(Model model) {
		return "homepage";
	}
}
