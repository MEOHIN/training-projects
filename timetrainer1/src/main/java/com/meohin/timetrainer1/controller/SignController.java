package com.meohin.timetrainer1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/sign")
public class SignController {

    @GetMapping("/in")
    public String signin() {
        return "/sign/sign_in";
    }

    @GetMapping("/up")
    public String signup() {
        return "/sign/sign_up";
    }

    @PostMapping("/up")
    public String signup(@RequestParam String user) {
        //TODO: process POST request
        
        
        return "redirect:/task/list";
    }
}
