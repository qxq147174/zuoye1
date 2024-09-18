package com.ex02.student;

import com.ex02.student.po.Student;
import com.ex02.student.utils.StudentDBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
public class StudentTest {
    SqlSession sqlSession = StudentDBUtil.getSession();
    int count = -1;
    Student student;
    @Test
    public void findStudentBySno() {


        // 精确查询测试
        Student student = sqlSession.selectOne("com.ex02.student.po.Student.selectStudentBySno", "100000001");
        System.out.println(student);
    }
    @Test
    public void findStudentAll() {
        // 模糊查询测试
        List<Student> list = sqlSession.selectList("com.ex02.student.po.Student.selectStudentBySname", "小");
        for (Student stu : list)
            System.out.println(stu);
    }

    @Test
    public void insertStudent() {
        // 插入记录测试
        student = new Student();
        student.setSno("100000009");
        student.setSname("刘伟");
        student.setSsex("男");
        student.setSnative("广东汕头");
        student.setMno(2);
        count = sqlSession.insert("com.ex02.student.po.Student.insertStudent", student);
        sqlSession.commit();
        System.out.println("成功插入了" + count + "条记录。");
    }
    // 补充删除记录测试



    // 补充更新记录测试


}
