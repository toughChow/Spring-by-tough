package com.qingshixun.project.dao;

import com.qingshixun.project.model.Student;

import java.util.List;

public interface StudentDao {

    public void save(Student student);
    public List<Student> getAllStudent();
    public List<Student> getStudentByCategory(String category);
    public List<Student> getStudentBySex(String sex);

}
