package com.zgurel.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zgurel.petclinic.service.PetClinicService;

import io.micrometer.core.instrument.MockClock;

@Controller//Gelen web isteklerini controller ile karşılaştıracak.

public class PetClinicController {
	
	@Autowired
	private PetClinicService petclinicservice;
	
	@RequestMapping(value="/owners", method=RequestMethod.GET)
	public String getOwners(Model model) {
		System.out.println("test");
		ModelAndView mav= new ModelAndView();
		model.addAttribute("owners", petclinicservice.findOwners());
		mav.setViewName("owners");
		return "owners";
	}
	
	@RequestMapping("/pcs")
	@ResponseBody
	public String welcome() {
		return "welcome to petClinic world";
	}
}
