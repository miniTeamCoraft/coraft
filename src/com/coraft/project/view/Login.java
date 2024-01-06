package com.coraft.project.view;

import com.coraft.project.controller.MemberController;

import java.util.Scanner;

public class Login {

    Scanner sc = new Scanner(System.in);



    public void mainLogin() {

        System.out.println("안녕하세요~ coraft 입니다.");
        System.out.println("클래스 신청을 위해 로그인 페이지로 이동합니다.");
        System.out.println("========================================");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("9. 종료");
        System.out.println("========================================");

        System.out.print("메뉴를 선택해주세요 : ");
        int num = sc.nextInt();

        switch (num) {
            case 1 : ; break;
            case 2 : ; break;
            case 9 : ; break;
            default: System.out.println("잘못된 번호를 입력하셨습니다."); break;

        }



    }



}
