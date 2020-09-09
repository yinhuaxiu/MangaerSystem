package com.Managerment.pojo;

public class Student {
    private Integer studentId;

    private String studentNum;

    private String studentName;

    private String className;

    private String sex;

    private Integer age;

    private String photo;

    private String remark;

    private String academyName;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAcademyName() {
        return academyName;
    }

    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNum=" + studentNum +
                ", studentName='" + studentName + '\'' +
                ", className='" + className + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", photo='" + photo + '\'' +
                ", remark='" + remark + '\'' +
                ", academyName='" + academyName + '\'' +
                '}';
    }
}