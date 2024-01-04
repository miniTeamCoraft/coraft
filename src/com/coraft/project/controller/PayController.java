package com.coraft.project.controller;

import java.util.Scanner;

public class PayController {

    public void payCardMember() {
        // 결제 금액
        // 진행상황
        Scanner sc = new Scanner(System.in);
        System.out.println("========== 결제진행 ==========");
        System.out.println("1. 카드 결제");
        System.out.println("2. 포인트 차감"); // 포인트 차감 후 카드결제로 넘어감
        System.out.println("9. 결제 중단");  // 클래스 선택으로 넘어감
        System.out.println("====================");
        System.out.print("결제진행 수단을 선택해 주세요 : ");
        int payProgress = sc.nextInt();

        switch (payProgress) {
            case 1 : System.out.println("카드결제를 선택하셨습니다. \n 결제가 완료되었습니다."); break;
            case 2 : payBonusMember(); break;
            case 0 :
        }


    }

    public void payBonusMember() {
        // 현제 보너스 포인트
        //



    }


}
