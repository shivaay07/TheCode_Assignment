package com.duttech.theCode_Assignment;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeCodeController {
	
	
	@RequestMapping("/")
	
	public String index ()  {
		System.out.println();
		return  "index.jsp";
	}
	
	
	
	@RequestMapping(value ="/codeProcess", method = RequestMethod.POST)
	
	public String codeProcess(HttpSession session, RedirectAttributes redirectAttributes, @RequestParam(value = "code") String code) {
		session.setAttribute("code", code);
		
		if (session.getAttribute("code").equals("bushido")) {
			return "redirect:/code";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "You must Train Hard");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/code")
	
	public String code() {
		return "code.jsp";
	}

}
