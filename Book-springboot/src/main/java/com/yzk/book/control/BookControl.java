package com.yzk.book.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yzk.book.service.BookService;
import com.yzk.book.service.ClassifyService;

@Controller
public class BookControl {
	@Autowired
	private BookService bookservice;
	@Autowired
	private ClassifyService classifService;

	@RequestMapping(value = { "/booklist" })
	public String demo(Model model) {
		model.addAttribute("list", bookservice.findall());
		model.addAttribute("classifylist", classifService.findall());
		return "index";
	}
	@RequestMapping(value = { "/findbookbyclassify" })
	public String findbookbyclassify(Model model,String classify) {
		model.addAttribute("list", bookservice.findbyclassify(classify));
		model.addAttribute("classifylist", classifService.findall());
		return "index";
	}
	@RequestMapping(value = { "" })
	public String loginpage(Model model,String classify) {
		return "login";
	}
}
