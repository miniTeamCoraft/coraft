package com.coraft.project.dto;

public class LectureDTO {
    private String lecName;
    private String date;
    private String time;
    private int lecPrice;

    public LectureDTO() {}

    public LectureDTO(String lecName, String date, String time, int lecPrice) {
        this.lecName = lecName;
        this.date = date;
        this.time = time;
        this.lecPrice = lecPrice;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLecPrice() {
        return lecPrice;
    }

    public void setLecPrice(int lecPrice) {
        this.lecPrice = lecPrice;
    }

    @Override
    public String toString() {
        return "LectureDTO{" +
                "lecName='" + lecName + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", lecPrice=" + lecPrice +
                '}';
    }
}
