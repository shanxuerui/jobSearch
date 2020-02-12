package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * Author:单雪瑞
 * 2019/8/19
 */
public interface StudentService {

   int  addStudent(Student student);

    List<Student> searchStudent();

}
