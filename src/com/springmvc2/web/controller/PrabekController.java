/**
 * 
 */
package com.springmvc2.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc2.web.model.User;
import com.springmvc2.web.service.UsersService;

/**
 * @author Pra Vek
 *
 */
@Controller
public class PrabekController {
	private UsersService UsersService;
	
	@Autowired
	public void setUsersService(UsersService usersService)
	{
		UsersService =usersService;
	}
	@RequestMapping("/")
	public String showprabek(Model model) 
	{	
		List<User> users= UsersService.getCurrent();
	model.addAttribute("users", users);
		return "display";
	}
	

}
