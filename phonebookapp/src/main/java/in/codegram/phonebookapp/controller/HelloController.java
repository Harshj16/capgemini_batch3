package in.codegram.phonebookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "test/hello")
	public String sayHello() {
		return "hello";
	}

}
