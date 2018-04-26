package com.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserActionAnno {
	@Autowired
	private UserService userService;

	@RequestMapping("/get.action")
	public ModelAndView getUserById() {
		ModelAndView mv = new ModelAndView();

		User user = userService.get(2);
		mv.addObject("user", user);
		mv.setViewName("user");
		return mv;
	}

	@RequestMapping("/getAll.action")
	public String getAll(Model model) {
		List<User> list = userService.getAll();
		model.addAttribute("ulist", list);
		return "userlist";
	}

	@RequestMapping("/save.action")
	public void save(User user, HttpServletResponse resp) throws IOException {
		int r = userService.save(user);
		if (r != 0) {
			resp.getWriter().println("success");
		}

	}

	@RequestMapping("/edit.action")
	public String editor(HttpServletRequest resq, Model model) throws IOException {
		int id = Integer.parseInt(resq.getParameter("userid"));
		User user = userService.get(id);
		model.addAttribute(user);
		return "edit";
	}

	@RequestMapping("/updataUser.action")
	public String updataUser(HttpServletRequest resq, HttpServletResponse resp, Model model) throws IOException {
		User user = new User();
		user.setPassword(resq.getParameter("password"));
		user.setUsername(resq.getParameter("username"));
		user.setSex(Integer.parseInt(resq.getParameter("sex")));
		user.setId(Integer.parseInt(resq.getParameter("id")));
		int r = userService.updateUser(user);
		if (r != 0) {
			resp.getWriter().println("success");
		}
		List<User> userArr = new ArrayList<User>();
		userArr.add(user);
		model.addAttribute(userArr);
		return "userlist";
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
