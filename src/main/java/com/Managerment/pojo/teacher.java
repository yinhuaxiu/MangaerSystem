package com.Managerment.pojo;

import org.apache.ibatis.annotations.Select;

public class teacher {

    private String courseTeacher;

    private Integer chooseNum;

    private String courseName;

    private String courseId;

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public Integer getChooseNum() {
        return chooseNum;
    }

    public void setChooseNum(Integer chooseNum) {
        this.chooseNum = chooseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "courseTeacher='" + courseTeacher + '\'' +
                ", chooseNum=" + chooseNum +
                ", courseName='" + courseName + '\'' +
                ", courseId='" + courseId + '\'' +
                '}';
    }
}
