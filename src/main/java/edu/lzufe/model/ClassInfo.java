package edu.lzufe.model;

import java.io.Serializable;

public class ClassInfo implements Serializable {
    private String classname;
    private Integer classid;

    public ClassInfo() {
    }

    public ClassInfo(String classname, Integer classid) {
        this.classname = classname;
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}
