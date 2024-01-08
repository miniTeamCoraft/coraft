package com.coraft.project.view;

import com.coraft.project.controller.MemberController;
import com.coraft.project.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Login {
    Scanner sc = new Scanner(System.in);
    private char answer;

    public void mainLogin() {
        while(true) {
            System.out.println("*****************************************************");
            System.out.println("1.로그인 하기");
            System.out.println("2.회원가입 하기");
            System.out.println("9.종료");
            System.out.println("*****************************************************");

            System.out.print("메뉴를 선택하세요 : ");
            int num = sc.nextInt();

            MemberController memcont = new MemberController();

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
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();
        List<MemberDTO> members = new ArrayList<>();
        boolean isDuplicate = true;
        for (MemberDTO member : members) {
            if (member.getId().equals(id)) {
                isDuplicate = false;
                break;
            }
        } if (isDuplicate) {
            System.out.println("중복된 아이디입니다.");
            System.out.printf("다시 입력 부탁드립니다.");
            id = sc.nextLine();
        } else {
            System.out.printf("확인되었습니다.\n");
        }
        boolean isDuplicate = false;
        for (MemberDTO member : members) {
            if (member.getId().equals(id)) {
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            System.out.println("중복된 아이디입니다.");
        } else {
            MemberDTO user = new MemberDTO(id);
        }

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
        
        MemberDTO user = null;

        if(answer == 'Y') {
            user = new MemberDTO(id, pwd, name, age, gender, phone, email);
        }else {
            System.out.println("로그인 페이지로 돌아갑니다.");
            mainLogin();
        }

        return user;
    }
}
