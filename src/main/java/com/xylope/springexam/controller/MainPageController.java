package com.xylope.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class MainPageController {
    @RequestMapping("/main")
    public String showPage() {
        return "main";
    }
}
