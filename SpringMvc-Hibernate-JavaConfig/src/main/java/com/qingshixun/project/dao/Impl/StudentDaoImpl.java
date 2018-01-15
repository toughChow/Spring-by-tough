package com.qingshixun.project.dao.Impl;

import com.qingshixun.project.dao.StudentDao;
import com.qingshixun.project.model.Student;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@Repository
@EnableTransactionManagement(proxyTargetClass = true)
public class StudentDaoImpl implements StudentDao{
    @Autowired
    private SessionFactory sessionFactory;
    @SuppressWarnings("unchecked")
    @Override
    public List<Student> getAllStudent() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Student> getStudentByCategory(String category) {
        Query query=sessionFactory.getCurrentSession().createQuery("from Student where category=?").setString(0,category);
        return query.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Student> getStudentBySex(String sex) {
        return sessionFactory.getCurrentSession().createQuery("from Student where sex=?").setString(0, sex).list();
    }

    @Override
    public void save(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }
}
