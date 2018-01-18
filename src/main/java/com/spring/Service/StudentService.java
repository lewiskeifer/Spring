package com.spring.Service;

import com.spring.Dao.StudentDao;
import com.spring.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Service

public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents()
    {
        return studentDao.getAllStudents();
    }

}
