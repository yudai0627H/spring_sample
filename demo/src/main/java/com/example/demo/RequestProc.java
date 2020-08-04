package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestProc {


	@RequestMapping(value="/callResponse")
	public ModelAndView response(@ModelAttribute ParamObject param) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("response", param);
		mav.setViewName("index");
		
		
		return mav;
		
	}
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	public static class ParamObject {
		
		private String name;
		
		private String tweet;
		
		public String getName() {
			return name;
		}
		
		public String getTweet() {
			return tweet;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setTweet(String tweet) {
			this.tweet = tweet;
		}
		
		
	}
	
	
	
}
