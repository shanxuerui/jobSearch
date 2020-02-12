package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.lang.annotation.Target;

/**
 * Author:单雪瑞
 * 2019/8/19
 */
@Controller
@RequestMapping("/student")
public class JumpStudentController {


    @RequestMapping("/jump.do")

    public String jump(String target){

       return target;


    }
}
