package com.Managerment.pojo;

public class BreakRule {
    private Integer breakRuleId;

    private Integer studentId;

    private String studentName;

    public Integer getBreakRuleId() {
        return breakRuleId;
    }

    public void setBreakRuleId(Integer breakRuleId) {
        this.breakRuleId = breakRuleId;
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