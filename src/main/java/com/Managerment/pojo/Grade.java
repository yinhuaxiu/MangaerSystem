package com.Managerment.pojo;

public class Grade {
    private Integer gradeId;

    private String gradeName;

    private Integer gradeNumber;

    private Double employmengtRate;

    private Double  postgradeRate;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getGradeNumber() {
        return gradeNumber;
    }

    public void setGradeNumber(Integer gradeNumber) {
        this.gradeNumber = gradeNumber;
    }

    public Double getEmploymengtRate() {
        return employmengtRate;
    }

    public void setEmploymengtRate(Double employmengtRate) {
        this.employmengtRate = employmengtRate;
    }

    public Double getPostgradeRate() {
        return postgradeRate;
    }

    public void setPostgradeRate(Double postgradeRate) {
        this.postgradeRate = postgradeRate;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                ", gradeNumber=" + gradeNumber +
                ", employmengtRate=" + employmengtRate +
                ", postgradeRate=" + postgradeRate +
                '}';
    }
}