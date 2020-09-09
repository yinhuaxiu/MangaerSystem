package com.Managerment.pojo;

public class Clazz {
    private Integer classId;

    private String className;

    private Integer classNumber;

    private String teacherName;

    private String teacherTel;

    private String monitorName;

    private String monitorTel;

    private Double breakRuleRate;

    private Double failRate;

    private Double prizeRate;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherTel() {
        return teacherTel;
    }

    public void setTeacherTel(String teacherTel) {
        this.teacherTel = teacherTel == null ? null : teacherTel.trim();
    }

    public String getMonitorName() {
        return monitorName;
    }

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName == null ? null : monitorName.trim();
    }

    public String getMonitorTel() {
        return monitorTel;
    }

    public void setMonitorTel(String monitorTel) {
        this.monitorTel = monitorTel == null ? null : monitorTel.trim();
    }

    public Double getBreakRuleRate() {
        return breakRuleRate;
    }

    public void setBreakRuleRate(Double breakRuleRate) {
        this.breakRuleRate = breakRuleRate;
    }

    public Double getFailRate() {
        return failRate;
    }

    public void setFailRate(Double failRate) {
        this.failRate = failRate;
    }

    public Double getPrizeRate() {
        return prizeRate;
    }

    public void setPrizeRate(Double prizeRate) {
        this.prizeRate = prizeRate;
    }
}