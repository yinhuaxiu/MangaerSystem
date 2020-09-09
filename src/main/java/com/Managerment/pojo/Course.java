package com.Managerment.pojo;

public class Course {

    private String studentNum;

    private String studentName;

    private Double courseScore;

    private String className;

    private String courseName;

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

    public Double getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(Double courseScore) {
        this.courseScore = courseScore;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "studentNum='" + studentNum + '\'' +
                ", studentName='" + studentName + '\'' +
                ", courseScore=" + courseScore +
                ", className='" + className + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
