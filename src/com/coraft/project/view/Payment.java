package com.coraft.project.view;

import com.coraft.project.controller.PayController;

import java.util.Scanner;

public class Payment {

    private Scanner sc = new Scanner(System.in);
    PayController pc = new PayController();

    public void mainPayment() {
        // 결제 금액
        // 진행상황

        System.out.println("=========== 결제 진행 ==========");
        System.out.println("1. 카드 결제");
        System.out.println("2. 포인트 차감"); // 포인트 차감 후 카드결제로 넘어감
        System.out.println("9. 결제 중단");  // 클래스 선택으로 넘어감
        System.out.println("===============================");
        System.out.print("결제진행 수단을 선택해 주세요 : ");
        int payProgress = sc.nextInt();

        switch (payProgress) {
            case 1 : pc.payCardMember(); break;
            case 2 :
                System.out.println("포인트를 차감하고 부족한 금액은 카드결제로 진행합니다.");
                System.out.print("결제 진행여부를 선택해 주세요 (Y/N) : ");
                char ch = sc.next().toUpperCase().charAt(0);
                if(ch == 'y') {
                    pc.payBonusMember();
                } break;
            case 9 : System.out.println("결제가 취소되었습니다. 다른 메뉴를 선택해 주세요"); break;
            default:
                System.out.println("잘못된 번호를 입력하셨습니다. 확인 후 재입력해주세요");
        }


    }



}
