package com.offcn.controller;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @Desctiption
 * @Author czh
 * @Date:
 **/
@Controller
public class MyController {
    @RequestMapping("/index")
    public String index(Model model){
        System.out.println("====");
        String message="hello thymeleaf";
        model.addAttribute("message",message);
        return "index";
    }

    @RequestMapping("/getuser")
    public String getUser(Model model){
        User user = new User(1, "zhangsan", 12);
        model.addAttribute("user",user);
        Map<String,Object> map=new HashMap<>();
        map.put("src1","6.jpg");
        map.put("src2","5.jpg");
        model.addAttribute("src",map);
        return "index2";
    }

    @RequestMapping("/getUserList")
    public String  getUserList(Model model){
        List<User> list=new ArrayList<>();
        list.add(new User(1001,"zhangsan",23));
        list.add(new User(1002,"zhangsanfeng",211));
        list.add(new User(1003,"zhangwuji",37));
        list.add(new User(1004,"zhangcuizhan",55));
        model.addAttribute("userList",list);
        return "index3";
    }

    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username","张三");
        model.addAttribute("href","http://www.baidu.com");
        return "index4";
    }

    @RequestMapping("/index5")
    public String index5(Model model){
        model.addAttribute("result","y");
        model.addAttribute("menu","manager");
        model.addAttribute("manager","manager");
        return "index5";
    }

    @RequestMapping("/index6")
    public String index6(){
        System.out.println("in index6");
        return "index6";
    }

    @RequestMapping("/index7")
    public String index7(Model model){
        //时间
        Date date=new Date();
        model.addAttribute("date",date);
        //数字格式化
        model.addAttribute("num",12345.1222);
        //字符串的显示
        String str="醉里挑灯看剑，梦回吹角连营。八百里分麾下炙，五十弦翻塞外声，沙场秋点兵。\n" +
                "马作的卢飞快，弓如霹雳弦惊。了却君王天下事，赢得生前身后名。可怜白发生！";
        model.addAttribute("str",str);
        //字符串的截取
        String str2="java-offcn-0615";
        model.addAttribute("str2",str2);
        return "index7";
    }
}
