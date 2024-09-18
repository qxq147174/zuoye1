package com.ex02.student.po;

public class Student {
    private String sno;
    private String sname;
    private String ssex;
    private String snative;
    private int mno;

    // 省略了getter和setter方法

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", snative='" + snative + '\'' +
                ", mno=" + mno +
                '}';
    }
}