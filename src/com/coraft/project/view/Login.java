package com.coraft.project.view;

import com.coraft.project.dto.MemberDTO;

import java.util.Scanner;

public class Login {

    Scanner sc = new Scanner(System.in);

    private static MemberDTO menber[] = new MemberDTO[5];


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
            case 1 :



                System.out.printf("로그인을 시작합니다.");
                System.out.printf("알맞는 아이디와 비밀번호를 적어주세요.");
                System.out.printf("아이디 : ");
                String id = sc.next();


                ;break;
            case 2 : ;
                System.out.println("회원가입을 시작합니다.");
                System.out.printf("알맞는 정보를 넣어주세요.");
                String name = sc.next();
                int age = sc.nextInt();
                String gender = sc.next();
                String phone = sc.next();
                String email = sc.next();

                System.out.printf("name : " + name);
                System.out.printf("age :" + age);
                System.out.printf("gender : " + gender);
                System.out.printf("email : " + email);


                ;break;
            case 9 : ; break;
            default: System.out.println("잘못된 번호를 입력하셨습니다."); break;

        }



    }



}
