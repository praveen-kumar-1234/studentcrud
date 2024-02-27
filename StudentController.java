package com.web.controller;


import com.web.model.Student;
import com.web.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController
{



    @Autowired
    private StudentServiceImp service;

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String homePage()
    {
        return "home";
    }

    @RequestMapping(value="/addStudent",method=RequestMethod.GET)
    public String studentForm()
    {
        return "student";
    }

    @RequestMapping("/register")
    public String saveMarks(Student student)
    {
        Student student1=service.saveStudent(student);
        return "success";
    }

    @RequestMapping(value="/viewStudent",method=RequestMethod.GET)
    public String viewAllStudent(ModelMap model)
    {
        List<Student> students;
        model.put("students",service.getAllStudents());
        return "viewStudent";
    }

    @RequestMapping("/delete/{stdRollNo}")
    public String delete(@PathVariable int stdRollNo)
    {
        service.deleteStudent(stdRollNo);
        return "redirect:/viewStudent";
    }

    @RequestMapping("/edit/{stdRollNo}")
    public String edit(@PathVariable int stdRollNo,ModelMap model)
    {
        model.put("command",service.getStudent(stdRollNo));
        return "editStudent1";
    }

    @RequestMapping("/editandsave")
    public String editAndSave(Student student)
    {
        Student edit = service.updateStudent(student);
        return "redirect:/viewStudent";
    }

}
