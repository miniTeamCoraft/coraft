package com.coraft.project.view;

public class Member {
    /*
     * 랜덤 말고 정해진 인원 추가로 변경
     * 5명 인적사항 만들기로 함.*/

    public static void main(String[] args) {
        Applylogin member1 = new Applylogin("user1", "1234", "김아름");
        System.out.println(member1.gim());

        Applylogin member2 = new Applylogin("user2", "5678", "유한별");
        System.out.println(member2.gim());

        Applylogin member3 = new Applylogin("user3", "9101112", "안지후");
        System.out.println(member3.gim());

        Applylogin member4 = new Applylogin("user4", "13141516", "강우주");
        System.out.println(member4.gim());

        Applylogin member5 = new Applylogin("user5", "17181920", "조하나");
        System.out.println(member5.gim());
    }


}
