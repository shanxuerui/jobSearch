package com.bjpowernode.vo;

/**
 * Author:单雪瑞
 * 2019/8/16
 */
public class Student {
    //使用java对象接收请求中多个参数， 要求 对象的属性名和请求中参数名一样
    private String name;
    private String age;


    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
