package com.coraft.project.view;

import com.coraft.project.controller.MenuController;
import com.coraft.project.controller.MemberController;
import com.coraft.project.dto.MemberDTO;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void mainMenu(MemberDTO user) {
        while(true) {
            System.out.println("*****************************************************");
            System.out.println("1.강좌 목록 보기");
            System.out.println("2.회원 정보 확인하기");
            System.out.println("9.종료하기");
            System.out.println("*****************************************************");

            System.out.print("메뉴를 선택하세요 : ");
            int num = sc.nextInt();

            MenuController lectcont = new MenuController();
            MemberController memcont = new MemberController();

            switch(num) {
                case 1 : lectcont.showListLecture(); break;
                case 2 : memcont.memberInfo(user); break;
                case 9 : System.out.println("Coraft를 종료합니다. 감사합니다."); return;
                default : System.out.println("메뉴를 잘못 선택했습니다."); break;
            }
        }
    }
}
