package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Response {
	
	@GetMapping("/home")
	public String home()
	{
		return "redirect:/hello";
	}
	
	@GetMapping("/hi")
	@ResponseBody
	public String name()
	{
		return "Iam Kalyani";
	}
	
}