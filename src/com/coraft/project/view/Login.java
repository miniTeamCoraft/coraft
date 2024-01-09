package com.coraft.project.view;

import com.coraft.project.controller.MemberController;
import com.coraft.project.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Login {
    Scanner sc = new Scanner(System.in);

    MemberController memcont = new MemberController();

    public void mainLogin() {
        while(true) {
            System.out.println("*****************************************************");
            System.out.println("1.로그인 하기");
            System.out.println("2.회원가입 하기");
            System.out.println("9.종료");
            System.out.println("*****************************************************");

            System.out.print("메뉴를 선택하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 : memcont.login(doLogin()); break;
                case 2 : memcont.regist(doRegist()); break;
                case 9 : System.out.println("Coraft를 나갑니다. 감사합니다."); return;
                default : System.out.println("메뉴를 잘못 입력했습니다."); break;
            }
        }
    }

    public MemberDTO doLogin() {
        sc.nextLine();
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String pwd = sc.nextLine();

        return new MemberDTO(id, pwd);
    }

    public MemberDTO doRegist() {
        sc.nextLine();
        System.out.println("*****************************************************");
        String id = memcont.checkId();
        System.out.print("비밀번호를 입력하세요 : ");
        String pwd = sc.nextLine();
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("핸드폰 번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.println("*****************************************************");

        System.out.print("회원가입을 하시겠습니까? (Y / N)");
        char answer = sc.next().toUpperCase().charAt(0);

        MemberDTO user = null;

        if(answer == 'Y') {
            user = new MemberDTO(id, pwd, name, age, gender, phone, email);
            System.out.println("축하드립니다!! 회원가입에 성공했습니다. 가입축하 5000포인트를 드렸습니다!");

        }else {
            System.out.println("로그인 페이지로 돌아갑니다.");
            mainLogin();
        }

        return user;
    }
}
