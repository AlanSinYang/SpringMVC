package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ControllerTest2 {

    @RequestMapping("/h2")
    public String test1(Model model){

        model.addAttribute("msg","Controller666");
        return "test";
    }
}
