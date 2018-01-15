package com.qingshixun.project.service.Impl;

import com.qingshixun.project.dao.Impl.StudentDaoImpl;
import com.qingshixun.project.model.Student;
import com.qingshixun.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDaoImpl studentDaoImpl;
    @Override
    public List<Student> getAllStudent() {
        return studentDaoImpl.getAllStudent();
    }

    @Override
    public List<Student> getStudentByCategory(String category) {
        return studentDaoImpl.getStudentByCategory(category);
    }

    @Override
    public List<Student> getStudentBySex(String sex) {
        return studentDaoImpl.getStudentBySex(sex);
    }

    @Override
    public void save(Student student) {
        studentDaoImpl.save(student);
    }
}
