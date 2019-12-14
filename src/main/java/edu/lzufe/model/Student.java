package edu.lzufe.model;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer  studentid;
    private Integer stuage;
    private Integer classid;
    private String  stuname;
    private String  gender;
    private String  hobbies;
    private String  classname;

    public Student() {
    }

    public Student(Integer stuage, Integer classid, String stuname, String gender, String hobbies, String classname) {
        this.stuage = stuage;
        this.classid = classid;
        this.stuname = stuname;
        this.gender = gender;
        this.hobbies = hobbies;
        this.classname = classname;
    }

    public Student(Integer studentid, Integer stuage, Integer classid, String stuname, String gender, String hobbies, String classname) {
        this.studentid = studentid;
        this.stuage = stuage;
        this.classid = classid;
        this.stuname = stuname;
        this.gender = gender;
        this.hobbies = hobbies;
        this.classname = classname;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
