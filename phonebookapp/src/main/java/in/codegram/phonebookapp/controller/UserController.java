package in.codegram.phonebookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping(value = {"/","/index"})
	public String showIndexPage() {
		return "index";
	}

}
