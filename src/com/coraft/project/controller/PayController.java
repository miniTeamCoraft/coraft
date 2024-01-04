package com.coraft.project.controller;

import java.util.Scanner;

public class PayController {

    //고객정보 객체생성



    public void payBonusMember() {
        // 현제 보너스 포인트(객체 생성한 고객정보에서 고객명 받아온 후 현제 보너스 값 출력) = 기본값은 5000

//        if(금액 - 보너스금액 == 0)
        System.out.println(/*포인트 금액  + */"포인트 차감되었습니다.");
        System.out.println(". . .");
        System.out.println("포인트로 결제 완료되었습니다.");
//        } else if(금액 - 보너스금액 != 0){
          System.out.println(/*포인트 금액  + */"포인트를 차감하였습니다. \n부족한 금액은 자동 카드결제됩니다.");
          payCardMember();
//        }

    }

    public void payCardMember() {
        // 결제 금액
        // 진행상황
        System.out.println(". . .");
        System.out.println("카드결제가 진행됩니다.");
    }


}
