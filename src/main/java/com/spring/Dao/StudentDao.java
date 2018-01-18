package com.spring.Dao;

import com.spring.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Said","CS"));
                put(2, new Student(2, "Said","CS"));
                put(3, new Student(3, "Said","CS"));
            }
        };
    }

    public Collection<Student> getAllStudents()
    {
        return this.students.values();
    }

}
