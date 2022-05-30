package com.kuang.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//@Controller
@RestController //如果用这个注解 那么@Controller和@ResponseBody 就不用在写了
public class UserController {

    @RequestMapping("/j1")
//    @ResponseBody 只要增加了这个注解 它就不会走视图解析器 会直接返回一个字符串
    public String json1() throws JsonProcessingException {

//        jackson. ObjctMapper
        ObjectMapper mapper = new ObjectMapper();


//        创建一个对象
        User user = new User("小阳", 4, "男");

        String str = mapper.writeValueAsString(user);

        return str;
    }


    @RequestMapping("/j2")

    public String json2() throws JsonProcessingException {

        List<User> userList = new ArrayList<User>();

        User user = new User("阳仔", 5, "男");
        User user2 = new User("阳仔", 6, "男");
        User user3 = new User("阳仔", 7, "男");
        User user4 = new User("阳仔", 8, "男");

        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);


        return JsonUtils.getJson(userList);
    }


    @RequestMapping("/j3")

    public String json3() throws JsonProcessingException {


        Date date = new Date();

        return JsonUtils.getJson(date);

    }

    @RequestMapping("/j4")

    public String json4() throws JsonProcessingException {

        List<User> userList = new ArrayList<User>();

        User user = new User("阳仔", 5, "男");
        User user2 = new User("阳仔", 6, "男");
        User user3 = new User("阳仔", 7, "男");
        User user4 = new User("阳仔", 8, "男");

        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String string = JSON.toJSONString(userList);
        return string;
    }

}
