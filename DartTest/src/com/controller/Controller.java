package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Loan;

@RestController
public class Controller {

	@RequestMapping("/getLoan")
	@ResponseBody
	public Loan greeting() {
		return new Loan("position-id-1", 10000d);
	}
}
