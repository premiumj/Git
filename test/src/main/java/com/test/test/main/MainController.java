package com.test.test.main;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("main/*")
public class MainController {

	private static final Logger logger= LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String main(Locale locale) {
		logger.info("Main boot-2 Page //"+locale);
		return "main";		
	}
}
