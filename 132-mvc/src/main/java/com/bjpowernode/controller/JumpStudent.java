package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:单雪瑞
 * 2019/8/21
 */
@Controller
public class JumpStudent {

    @RequestMapping("/student/jump.do")
    public String   jump(String target){
        return target;
    }
}
