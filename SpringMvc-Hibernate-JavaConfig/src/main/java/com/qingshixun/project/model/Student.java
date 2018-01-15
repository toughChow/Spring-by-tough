package com.qingshixun.project.model;

import javax.persistence.*;

@Entity
@Table(name="t_student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id; //id号
    private int stuNo; //学号
    private String name; //姓名
    private String sex; //性别
    private String profession; //职业
    private String category; //方向
    private int skill; //技术
    private int ability; //能力

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int stuNo, String name, String sex, String profession, String category, int skill, int ability) {
        this.stuNo = stuNo;
        this.name = name;
        this.sex = sex;
        this.profession = profession;
        this.category = category;
        this.skill = skill;
        this.ability = ability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuNo=" + stuNo +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", profession='" + profession + '\'' +
                ", category='" + category + '\'' +
                ", skill=" + skill +
                ", ability=" + ability +
                '}';
    }
}
