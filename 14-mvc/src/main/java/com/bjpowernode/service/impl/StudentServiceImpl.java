package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLOutput;
import java.util.List;

/**
 * Author:单雪瑞
 * 2019/8/19
 */

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private  StudentDao studentDao;

    @Transactional
    @Override
    public int addStudent(Student student) {
        System.out.println("StudentServiceImpl");

        int count = studentDao.addStudent(student);

        return count;

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Student> searchStudent() {

        System.out.println("searchStudent2");

       List<Student> list =  studentDao.searchStudent();


       return list;


    }
}




















