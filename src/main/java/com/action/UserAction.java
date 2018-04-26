package com.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.entity.User;
import com.service.UserService;

public class UserAction implements Controller{


	private UserService userService ;

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		User u = userService.get(63);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user");
		mv.addObject("user",u);
		
		return mv;
		
	
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
