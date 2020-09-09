package com.Managerment.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HealthCardRecord {
    private Integer id;
    private String remarkNum;
    private String studentName;
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stime;
    private String address;
    private String medicineName;
    private String ismoveToHosp;


    SimpleDateFormat mydate=new SimpleDateFormat("yyyy-MM-dd");



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemarkNum() {
        return remarkNum;
    }

    public void setRemarkNum(String remarkNum) {
        this.remarkNum = remarkNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStime() {
        return mydate.format(stime);
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getIsmoveToHosp() {
        return ismoveToHosp;
    }

    public void setIsmoveToHosp(String ismoveToHosp) {
        this.ismoveToHosp = ismoveToHosp;
    }

    @Override
    public String toString() {
        return "HealthCardRecord{" +
                "id=" + id +
                ", remarkNum='" + remarkNum + '\'' +
                ", studentName='" + studentName + '\'' +
                ", sex='" + sex + '\'' +
                ", stime=" + stime +
                ", address='" + address + '\'' +
                ", medicineName='" + medicineName + '\'' +
                ", ismoveToHosp=" + ismoveToHosp +
                '}';
    }

}
