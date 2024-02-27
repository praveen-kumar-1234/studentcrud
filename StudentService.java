package com.web.service;

import com.web.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(int stdRollNo);
    public Student getStudent(int stdRollNo);
    public List<Student> getAllStudents();


}
