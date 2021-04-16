package in.codegram.phonebookapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.codegram.phonebookapp.command.LoginCommand;
import in.codegram.phonebookapp.constants.PhoneBookConstants;
import in.codegram.phonebookapp.domain.User;
import in.codegram.phonebookapp.exception.BlockUserException;
import in.codegram.phonebookapp.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = {"/","/index"})
	public String showIndexPage(Model model) {
		model.addAttribute("command", new LoginCommand());
		return "index";
	}
	
	@RequestMapping(value = "admin/dashboard")
	public String showAdminDashboard() {
		return "dashboard_admin";
	}
	
	@RequestMapping(value = "/logout")
	public String hangleLogout(HttpSession session) {
		session.invalidate();
		return "redirect:index?act=lo";
	}
	
	@RequestMapping(value = "user/dashboard")
	public String showUserDashboard() {
		return "dashboard_user";
	}
	@RequestMapping(value = "/loginHandle", method = RequestMethod.POST)
	public String handleUserLogin(@ModelAttribute("command") LoginCommand command, Model model, HttpSession session) {
		try {
			User loggedInUser = userService.authenticate(command.getLoginName(), command.getPwd());
			//login failed
			if(loggedInUser==null) {
				model.addAttribute("errMsg", "Login Failed! Enter correct credential.");
				return "index";
			}
			//successfull login
			else {
				if(loggedInUser.getRole().equals(PhoneBookConstants.USER_ROLE_ADMIN)) {
					addUserInSession(loggedInUser, session);
					return "redirect:admin/dashboard";
				}
				else if(loggedInUser.getRole().equals(PhoneBookConstants.USER_ROLE_USER)) {
					addUserInSession(loggedInUser, session);
					return "redirect:user/dashboard";
				}
				else {
					model.addAttribute("errMsg", "Invalid Role");
					return "index";
				}
			}
		} catch (BlockUserException e) {
			model.addAttribute("errMsg", e.getMessage());
			return "index";
		}
		
	}
	
	private void addUserInSession(User user, HttpSession session) {
		session.setAttribute("user", user);
		session.setAttribute("userId", user.getId());
		session.setAttribute("role", user.getRole());
	}

}
