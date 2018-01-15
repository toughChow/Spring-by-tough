package com.qingshixun.project.controller;

import com.alibaba.fastjson.JSONObject;
import com.qingshixun.project.model.Student;
import com.qingshixun.project.service.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;
    @RequestMapping(value="list",method= RequestMethod.GET)
    public String to_listStudent(Model model){
        List<Student> list=studentServiceImpl.getAllStudent();
        model.addAttribute("list", list);
        return "list";
    }
    @RequestMapping(value="to_save",method=RequestMethod.GET)
    public String to_save(){
        return "save";
    }
    @RequestMapping(value="do_save",method=RequestMethod.POST)
    public String do_save(@Valid Student student, BindingResult result, Model model){

        if(result.hasErrors()){
            return "save";
        }

        studentServiceImpl.save(student);
        return to_listStudent(model);
    }
    @ResponseBody
    @RequestMapping(value="byCategory",method=RequestMethod.POST,produces = {"text/html;charset=UTF-8;"})
    public String byCategory(String category){
        JSONObject jsonObject=new JSONObject();
        List<Student> list=studentServiceImpl.getStudentByCategory(category);
        jsonObject.put("list",list);
        return jsonObject.toString();
    }
    @ResponseBody
    @RequestMapping(value="bySex",method=RequestMethod.POST,produces = {"text/html;charset=UTF-8;"})
    public String bySex(String sex){
        JSONObject jsonObject=new JSONObject();
        List<Student> list=studentServiceImpl.getStudentBySex(sex);
        jsonObject.put("list",list);
        return jsonObject.toString();
    }
    @ResponseBody
    @RequestMapping(value="byAll",method=RequestMethod.POST,produces = {"text/html;charset=UTF-8;"})
    public String byAll(){
        JSONObject jsonObject=new JSONObject();
        List<Student> list=studentServiceImpl.getAllStudent();
        jsonObject.put("list",list);
        return jsonObject.toString();
    }
}
