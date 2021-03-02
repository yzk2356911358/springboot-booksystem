package com.yzk.book.control;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yzk.book.model.Orders;
import com.yzk.book.service.BookService;
import com.yzk.book.service.ClassifyService;
import com.yzk.book.service.OrderService;

@Controller
public class OrderControl {
	@Autowired
	private OrderService orderservice;
	@Autowired
	private BookService bookservice;
	@Autowired
	private ClassifyService classifService;

	@RequestMapping(value = { "/addorder" })
	public String addorder(Model model, int id, HttpSession httpSession) {
		Orders orders = new Orders();
		orders.setBname(bookservice.getbyid(id).getName());
		orders.setUname((String) httpSession.getAttribute("uname"));
		orderservice.add(orders);
		return "redirect:/addsuccessbooklist";
	}

	@RequestMapping(value = { "/addsuccessbooklist" })
	public String addsuccessbooklist(Model model) {
		model.addAttribute("list", bookservice.findall());
		model.addAttribute("classifylist", classifService.findall());
		model.addAttribute("message", "success");
		return "index";
	}

	@RequestMapping(value = { "/meorder" })
	public String meorder(Model model, HttpSession httpSession) {
		model.addAttribute("classifylist", classifService.findall());
		model.addAttribute("orders", orderservice.findbyuname((String) httpSession.getAttribute("uname")));
		return "meorders";
	}

	@RequestMapping(value = { "/useruporder" })
	public String useruporder(Model model, int id, HttpSession httpSession) {
		orderservice.useruporder(id);
		return "redirect:/meorder";
	}

	@RequestMapping(value = { "/userdelorder" })
	public String userdelorder(Model model, int id, HttpSession httpSession) {
		orderservice.del(id);
		return "redirect:/meorder";
	}
}
