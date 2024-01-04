package com.coraft.project.dto;

import java.util.Date;

public class LectureDTO {
    private String lecName;
    // private 날짜 시간
    private int lecPrice;

    public LectureDTO() {
    }

    public LectureDTO(String lecName, int lecPrice) {
        this.lecName = lecName;/* 날짜 시간 */
        this.lecPrice = lecPrice;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public String getLecName() {
        return this.lecName;
    }

    /* 날짜 시간 setter/getter 추가 */

    public void setLecPrice(int lecPrice) {
        this.lecPrice = lecPrice;
    }

    public int getLecPrice() {
        return this.lecPrice;
    }

    public String lectInfo() {
        return "강좌 명: " + this.lecName + ", 날짜/시간: " + ", 강좌 가격: " + this.lecPrice + "원";
    }
}
