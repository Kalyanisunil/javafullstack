package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Controllers {
	
	@GetMapping("/greeting")
	@ResponseBody
	
	public String greet()
	{
		return "Good Afternoon!";
	}
	
}