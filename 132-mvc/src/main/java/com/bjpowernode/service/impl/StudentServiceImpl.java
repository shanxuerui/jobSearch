package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:单雪瑞
 * 2019/8/21
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    @Override
    public int addstudent(Student student) {
        System.out.println("2addstudent");

        int count = studentDao.addStudent(student);

        return count;

    }

    @Override
    public List<Student> searchStudent() {
        System.out.println("2searchStudent");
        List<Student> list = studentDao.searchStudent();
       return list;
    }
}
