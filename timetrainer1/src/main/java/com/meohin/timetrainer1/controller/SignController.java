package com.meohin.timetrainer1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign")
public class SignController {

    @GetMapping("/in")
    public String signin() {
        return "/sign/sign_in";
    }
    
}
