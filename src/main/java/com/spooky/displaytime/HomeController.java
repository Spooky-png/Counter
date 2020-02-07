package com.spooky.displaytime;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		String dateString = format.format(new Date());
		model.addAttribute("time", dateString);
		return "time.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new java.util.Date();
		model.addAttribute("time", date);
		return "date.jsp";
	}
	
	}
