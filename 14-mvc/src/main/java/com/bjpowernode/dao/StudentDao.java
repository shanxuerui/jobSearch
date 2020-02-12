package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * Author:单雪瑞
 * 2019/8/19
 */
public interface StudentDao {


    int addStudent(Student student);

    List<Student> searchStudent();
}
