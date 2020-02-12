package com.bjpowernode.controller;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Author:单雪瑞
 * 2019/8/19
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student) {
        System.out.println("addStudent");

        int count = studentService.addStudent(student);

        ModelAndView mv = new ModelAndView();

        if (count == 1) {
            mv.addObject("tips", "["+student.getName() + "]注册成功");
        }else {
            mv.addObject("tips", "["+student.getName() + "]注册失败");
        }

        mv.setViewName("one");

        return mv;
    }


    @RequestMapping("/searchStudent.do")
    @ResponseBody
    public List<Student> searchStudent(){

        System.out.println("searchStudent1");


        List<Student> list =   studentService.searchStudent();


        return list;

    }
}























