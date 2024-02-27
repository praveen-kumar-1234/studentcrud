package com.web.service;

import com.web.model.Student;
import com.web.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepo repo;


    public Student saveStudent(Student student)
    {
        int tot=0;
        double p = 0.0;
        String g=null,r=null;
        tot=student.getHibernate()+student.getSpring()+student.getSpringBoot();
        p=tot/3;
        if(p >= 70)
        {
            g="A grade";
        }
        else if(p >= 60)
        {
            g="B grade";
        }
        else if(p >=50)
        {
            g="C grade";
        }
        else
        {
          g="D grade";
        }
        if(student.getHibernate()>= 35  && student.getSpring() >=35 && student.getSpringBoot() >=35)
        {
            r = "Pass";
        }
        else {
            r="Fail";
        }
        student.setTotal(tot);
        student.setPercentage(p);
        student.setGrade(g);
        student.setResult(r);
        Student save = repo.save(student);
        return save;
    }

    @Override
    public Student updateStudent(Student student) {
      Student newRecord =repo.findById(student.getStdRollNo()).get();
      newRecord.setName(student.getName());
      newRecord.setCourse(student.getCourse());
      newRecord.setHibernate(student.getHibernate());
      newRecord.setSpring(student.getSpring());
      newRecord.setSpringBoot(student.getSpringBoot());
        int tot=0;
        double p = 0.0;
        String g=null,r=null;
        tot=student.getHibernate()+student.getSpring()+student.getSpringBoot();
        p=tot/3;
        if(p >= 70)
        {
            g="A grade";
        }
        else if(p >= 60)
        {
            g="B grade";
        }
        else if(p >=50)
        {
            g="C grade";
        }
        else
        {
            g="D grade";
        }
        if(student.getHibernate()>= 35  && student.getSpring() >=35 && student.getSpringBoot() >=35)
        {
            r = "Pass";
        }
        else {
            r="Fail";
        }
        student.setTotal(tot);
        student.setPercentage(p);
        student.setGrade(g);
        student.setResult(r);
        newRecord.setTotal(student.getTotal());
        newRecord.setPercentage(student.getPercentage());
        newRecord.setGrade(student.getGrade());
        newRecord.setResult(student.getResult());

        Student save = repo.save(newRecord);
        return save;
    }

    @Override
    public void deleteStudent(int stdRollNo) {
    repo.deleteById(stdRollNo);
    }

    @Override
    public Student getStudent(int stdRollNo) {
        Student get = repo.findById(stdRollNo).get();
        return get;
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }


}
