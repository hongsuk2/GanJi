package com.wemakeprice.ganji;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Access
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home"); //뷰이름
		mv.addObject(model); //모델엔뷰 객체에 모델맵을 넣어줘야하지만..
		return mv;
	}
	
	
	
	@RequestMapping("/admin/tina")
	public String hello(){
	    return "tina";
	}
	
	@RequestMapping("/login")
	public String login(){
	    return "login";
	}
}
