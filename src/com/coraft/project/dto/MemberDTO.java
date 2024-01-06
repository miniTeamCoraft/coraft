package com.coraft.project.dto;

import com.coraft.project.controller.PayController;

public class MemberDTO {

    private boolean jo;

    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

//    private int point;


    public static void main(String[] args) {

        /*    회원가입
    가입을 한다 > 개인 정보 입력 > 완료 후 포인트 지급
    이미 있는 아이디다 > 사이트로 돌아간다.
    기능(메소드) : 회원 가입 (이름, 나이, 성별, 전화번호, 이메일 입력)/ 이미 있는 정보로 사이트로 돌아가기 */

    }
    public MemberDTO() {}

    public void MemberDTO(String name, int age, char gender, String phone, String email){
        setName(name);
        setAge(age);
        setGender(gender);
        setPhone(phone);
        setEmail(email);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

//    public int getPoint() {
//        return point;
//    }
//
//    public void setPoint(int point) {
//        this.point = 5000;
//    }


    public boolean join (Object o){
        if (o == null || !(o instanceof MemberDTO)){
            return false;
        }
        MemberDTO temp = (MemberDTO)o;
        return false;
    }

    @Override
    public String toString() {
        String info = "name : " + name + "\n";
        info += "age: " + age + "\n";
        info += "gender : " + gender + "\n";
        info += "phone : " + phone + "\n";
        info += "email : " + email + "\n";
//        info += "point : " + point + "\n";
        return info;
    }



    public boolean contains(MemberDTO members) {
        return false;
    }
}

