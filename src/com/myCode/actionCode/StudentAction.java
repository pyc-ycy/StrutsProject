//IntelliJ IDEA
//StrutsProject
//StudentAction
//2019/12/20
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.actionCode;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{
    private static final long serialVersionUID = 1L;
    private String student;

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent() {
        return student;
    }
    public String add() throws Exception{
        student="添加学生信息";
        return "add";
    }
    public String update() throws Exception{
        student="更新学生信息";
        return "update";
    }
}
