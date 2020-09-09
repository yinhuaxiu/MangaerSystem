package com.Managerment.pojo;

import java.util.Arrays;
import java.util.List;

public class QueryVo {


    private Integer[] ids;

    private List<Grade> gradeList;

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "gradeList=" + gradeList +
                '}';
    }
}
