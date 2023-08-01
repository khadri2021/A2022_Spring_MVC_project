package com.khadri.spring.mvc.calc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.khadri.spring.mvc.calc.service.CalcService;

@Controller
public class CalcController {

	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public ModelAndView additon(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println("addition Invoked");

		String v1 = req.getParameter("v1");
		String v2 = req.getParameter("v2");

		int val1 = Integer.parseInt(v1);
		int val2 = Integer.parseInt(v2);

		CalcService addCalcService = new CalcService();

		Integer sum = addCalcService.addition(val1, val2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("res_sum", sum);
		modelAndView.setViewName("result");

		return modelAndView;
	}

	@RequestMapping("/sub")
	public ModelAndView substraction(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println("substraction Invoked");

		String v1 = req.getParameter("v1");
		String v2 = req.getParameter("v2");

		int val1 = Integer.parseInt(v1);
		int val2 = Integer.parseInt(v2);

		CalcService addCalcService = new CalcService();
		Integer sub = addCalcService.substraction(val1, val2);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("res_sub", sub);
		modelAndView.setViewName("result");


		return modelAndView;
	}
	@RequestMapping("/multi")
	public ModelAndView multiplication(HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("multiplication Invoked");
		
		String v1 = req.getParameter("v1");
		String v2 = req.getParameter("v2");
		
		int val1 = Integer.parseInt(v1);
		int val2 = Integer.parseInt(v2);
		
		CalcService addCalcService = new CalcService();
		Integer multi = addCalcService.multiplication(val1, val2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("res_multi", multi);
		modelAndView.setViewName("result");
		
		
		return modelAndView;
	}

}
