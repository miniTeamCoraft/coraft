package com.coraft.project.view;

import com.coraft.project.controller.MemberController;
import com.coraft.project.controller.MenuController;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    MenuController menuc = new MenuController();
    MemberController memc = new MemberController();

    public void mainMenu() {
        while(true) {
            System.out.println("==============================================");
            System.out.println("1.강좌 목록 보기");
            System.out.println("2.회원 정보 확인하기");
            System.out.println("9.종료하기");
            System.out.println("==============================================");

            System.out.print("메뉴를 선택하세요 : ");
            int num = sc.nextInt();

            switch(num) {
                case 1 : menuc.showListLecture(); break;
                case 2 : menuc.toString(); break;
                case 9 : System.out.println("Coraft를 종료합니다. 감사합니다."); return;
                default : System.out.println("메뉴를 잘못 선택했습니다."); break;
            }

        }
    }
}
