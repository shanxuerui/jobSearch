package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * Author:单雪瑞
 * 2019/8/21
 */
public interface StudentDao {



    List<Student> searchStudent();

    int addStudent(Student student);
}
