package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String test(Model model) {
//        重定向 redirect是不走视图解析器的
        model.addAttribute("msg", "ModelTest");
        return "test";
    }

}
