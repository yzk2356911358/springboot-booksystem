package com.yzk.book.control;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yzk.book.model.User;
import com.yzk.book.service.BookService;
import com.yzk.book.service.ClassifyService;
import com.yzk.book.service.UserService;

@Controller
public class UserControl {
	@Autowired
	private UserService userservice;
	@Autowired
	private BookService bookservice;
	@Autowired
	private ClassifyService classifService;

	@RequestMapping(value = { "/login" })
	public String login(Model model, User user, HttpSession httpSession) {
		System.out.println(user);
		if (userservice.login(user.getUsername(), user.getPassword())) {
			httpSession.setAttribute("uname", user.getUsername());
			model.addAttribute("list", bookservice.findall());
			model.addAttribute("classifylist", classifService.findall());
			return "index";
		}
		model.addAttribute("error", "用户名或密码错误");
		return "login";
	}

	@RequestMapping(value = { "/usermessage" })
	public String usermessage(Model model, User user, HttpSession httpSession) {
		model.addAttribute("user", userservice.findbyusername((String) httpSession.getAttribute("uname")));
		model.addAttribute("classifylist", classifService.findall());
		return "usermessage";
	}

	@RequestMapping(value = { "/reg" })
	public String reg(Model model, User user, HttpSession httpSession) {
		if (userservice.findbyusername(user.getUsername()) == null) {
			user.setRole("user");
			userservice.add(user);
			model.addAttribute("error", "注册成功");
			return "login";
		}
		model.addAttribute("error", "用户名已经存在");
		return "reg";
	}
}
