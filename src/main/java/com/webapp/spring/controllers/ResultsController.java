package com.webapp.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.spring.models.Results;

@Controller
@RequestMapping("/results")
public class ResultsController {

	private static final List<Results> results = new ArrayList<>();
	
	static {
		for(int i = 0; i < 10; i++) {
			results.add(new Results(i, "com.web" + i, "test" + i, "10:" + i + "AM", "Pass", ""));
		}
	}
	
	@GetMapping
	public String getAllResults(Model model) {
		model.addAttribute("results", results);
		return "results";
	}
}
