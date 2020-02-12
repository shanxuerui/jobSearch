package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author:单雪瑞
 * 2019/8/16
 */
@Controller
public class MyController {
    /**
     * 逐个接收请求参数 : 控制器方法的形参名和请求中参数名一样， 按名称给形参赋值
     * 框架处理参数
     * 1. 使用request接收参数
     *   String strName = request.getParameter("name");
     *   String strAge = request.getParameter("age");
     *
     * 2.框架使用处理器适配器调用处理器方法doSome()时，按名称对应传入参数值
     *
     *    doSome(strName, Integer.parseInt(strAge))
     *
     *   框架可以实现请求中参数String类型到int ，long ,float,double等的类型转换。
     *
     */

    @RequestMapping(value = "/sxr.do")

    public ModelAndView dosome1(String name,Integer age){
        System.out.println(name+"|"+age);

        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("one");
        return mv;
    }

    /**
     * 使用java对象接收请求中的多个参数
     * 在处理器方法的形参列表是java对象。
     */


    @RequestMapping(value = "/sn.do")
    public ModelAndView dosome2(Student student){
        System.out.println(student.getName()+"||"+student.getAge());

        ModelAndView mv = new ModelAndView();
        mv.addObject("sname",student.getName());
        mv.addObject("sage",student.getAge());
        mv.addObject("student",student);
        mv.setViewName("two");
        return mv;
    }

    /**
     * 在逐个接收参数中， 如果控制器方法的形参名和请求中参数名不一样。
     * 需要在控制器方法的形参定义前面加入@RequestParam.
     * @RequestParam
     *      属性： 1）value 请求中的参数名
     *            2）required boolean类型的，默认是true
     *               true:表示参数必须有
     *               false:可以没有
     *
     *      位置： 在形参的前面
     */

    @RequestMapping(value = "/sss.do")
    public ModelAndView dosome3(@RequestParam(value = "sname") String name,
                                @RequestParam(value = "sage") Integer age){
        System.out.println(name+"|"+age);

        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("one");

        return mv;
    }


}
