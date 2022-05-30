package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller//代表这个类被Spring接管,被注解的这个类中所有的方法,如果返回值是String,并且有具体页面可以跳转,那么就会被视图解析器解析
public class ControllerTest1 {


    @RequestMapping("/h2")
    public String test1(Model model) {
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "ConTrollerTest1");
        //返回视图位置
        return "test";
    }

    @RequestMapping("/h3")
    public String test2(Model model) {
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "Test2");
        //返回视图位置
        return "test";
    }
}
