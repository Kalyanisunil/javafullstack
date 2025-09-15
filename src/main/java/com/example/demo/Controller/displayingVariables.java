package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class displayingVariables {

    @GetMapping("/getting")
    public String var() {
        return "redirect:/display";
    }
    
    @GetMapping("/display")
    public String hello(Model model) {
    	String msg="Spring is easy to study!";
    	model.addAttribute("message",msg);
        return "variable";
    }
}