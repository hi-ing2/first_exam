package com.hi.test3.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class ApiController {
	@GetMapping("/getapi")
	public String getListMap(Model model) {
		RestTemplate rt = new RestTemplate();
		Map<String, Object> map = rt.getForObject("http://ggoreb.com/m/exam.jsp", Map.class);
		model.addAttribute("map" ,map);
		return "apihtml";
	}
}	