package com.coraft.project.view;

public class Member {
    /*
     * 랜덤 말고 정해진 인원 추가로 변경
     * 5명 인적사항 만들기로 함.*/

    public static void main(String[] args) {
        Applylogin member1 = new Applylogin("아이디1", "비번1", "이름1");
        System.out.println(member1.gim());

        Applylogin member2 = new Applylogin("아이디2", "비번2", "이름2");
        System.out.println(member2.gim());

        Applylogin member3 = new Applylogin("아이디3", "비번3", "이름3");
        System.out.println(member3.gim());

        Applylogin member4 = new Applylogin("아이디4", "비번4", "이름4");
        System.out.println(member4.gim());

        Applylogin member5 = new Applylogin("아이디5", "비번5", "이름5");
        System.out.println(member5.gim());
    }


}
