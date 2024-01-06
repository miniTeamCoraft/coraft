package com.coraft.project.view;

public class Applylogin {



    private String id;
    private String pw;
    private String userName;
    private java.util.Date enrollDate;



    public Applylogin(String id, String pw, String userName) {
        this.id = this.id;
        this.pw = this.pw;
        this.userName = this.userName;
    }

    public Applylogin(String id, String pw, String userName, java.util.Date enrollDate) {

        this(id, pw, userName);
        this.enrollDate = enrollDate;

    }

    public void testMethod() {
        gim();
    }
    public String gim() {
        return "Member [id=" + this.id + ", pw=" + this.pw
                + ", username=" + this.userName + ", enrollDate=" + this.enrollDate + "]";
    }

}
