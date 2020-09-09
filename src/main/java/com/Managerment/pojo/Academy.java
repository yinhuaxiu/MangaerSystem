package com.Managerment.pojo;

public class Academy {
    private Integer academyId;

    private String academyName;

    private Integer academyNumber;

    private String deanName;

    private String deanTel;

    public Integer getAcademyId() {
        return academyId;
    }

    public void setAcademyId(Integer academyId) {
        this.academyId = academyId;
    }

    public String getAcademyName() {
        return academyName;
    }

    public void setAcademyName(String academyName) {
        this.academyName = academyName == null ? null : academyName.trim();
    }

    public Integer getAcademyNumber() {
        return academyNumber;
    }

    public void setAcademyNumber(Integer academyNumber) {
        this.academyNumber = academyNumber;
    }

    public String getDeanName() {
        return deanName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName == null ? null : deanName.trim();
    }

    public String getDeanTel() {
        return deanTel;
    }

    public void setDeanTel(String deanTel) {
        this.deanTel = deanTel == null ? null : deanTel.trim();
    }
}