package com.Managerment.pojo;

public class FailCourse {
    private Integer failCourseId;

    private Integer studentId;

    private String studentName;

    public Integer getFailCourseId() {
        return failCourseId;
    }

    public void setFailCourseId(Integer failCourseId) {
        this.failCourseId = failCourseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }
}