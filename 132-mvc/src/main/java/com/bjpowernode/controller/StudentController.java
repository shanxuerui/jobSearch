package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Author:单雪瑞
 * 2019/8/21
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @RequestMapping("/add.do")
    public ModelAndView addStudent(Student student) {
        System.out.println("1addStudent");
        int count = studentService.addstudent(student);
        ModelAndView mv = new ModelAndView();
        if (count == 1) {
            mv.addObject("message", "[" + student.getName() + "]添加成功");
        } else {
            mv.addObject("message", "[" + student.getName() + "]添加失败");
        }
        mv.setViewName("one");
        return mv;
    }



    @RequestMapping("/search.do")
    @ResponseBody
    public List<Student> searchStudent() {
        System.out.println("1searchStudent");
        List<Student> list = studentService.searchStudent();
        return list;
    }

}
