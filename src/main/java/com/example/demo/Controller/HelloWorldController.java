package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {
    	String msg="Spring is easy to study!";
    	model.addAttribute("message",msg);
    	 boolean isLike =true;
         model.addAttribute("isLiking", isLike);
        return "like";
    }
}