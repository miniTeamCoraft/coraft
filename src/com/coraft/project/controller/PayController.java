package com.coraft.project.controller;

import com.coraft.project.dto.LectureDTO;
import com.coraft.project.dto.MemberDTO;
import com.coraft.project.dto.PaymentDTO;
import com.coraft.project.view.Menu;

import java.util.Scanner;

public class PayController {

    Scanner sc = new Scanner(System.in);
    MemberDTO memberDTO = new MemberDTO();  //고객DTO 객체생성
    LectureDTO menuDTO = new LectureDTO();     //메뉴DTO 객체 생성
    MenuController menuc = new MenuController();
//    MemberController menc = new MemberController();
    PaymentDTO paymentDTO = new PaymentDTO();
    Menu menu = new Menu();

//    Payment pm = new Payment();

    // 포인트 차감 결제
    public void payBonusMember() {

        int extraPoint = (int)(menuDTO.getMenuPrice() * 0.05);

        System.out.println("적립된 포인트는 다음 수강신청 시 사용하실 수 있습니다.");
        System.out.println("보유하신 포인트는 " + paymentDTO.getBonusPoint() + "포인트 입니다.");


//        int newPrice = lectureDTO.getLecPrice() - paymentDTO.getBonusPoint();
        int newPrice = 5000 - paymentDTO.getBonusPoint();

        if(newPrice < 0) {
            System.out.println("보유하신 포인트가 결제할 금액보다 많습니다.");
            System.out.print("사용하실 포인트를 입력해 주세요 : ");
            int usePoint = sc.nextInt();
            int minusPoint = paymentDTO.getBonusPoint() - usePoint;
            System.out.println(usePoint + "포인트 사용하여 " + minusPoint + "포인트 남았습니다.");

        } else if (newPrice > 0) {
            System.out.println(paymentDTO.getBonusPoint() + "포인트를 차감하였습니다. \n부족한 금액은 자동 카드결제됩니다.");
            System.out.println("==========================");
            System.out.println("카드결제가 진행됩니다.");
            System.out.println(". . .");
            System.out.println("카드 결제가 완료되었습니다. ");

        } else if (newPrice == 0) {
            System.out.println(paymentDTO.getBonusPoint() + "포인트 차감되었습니다.");
            System.out.println(". . .");
            System.out.println("포인트로 결제 완료되었습니다.");
        }

    }

    public void payCardMember() {
//        menuc.selectLecture() = menuc.lecture[1].getLecPrice();

        // 결제 금액
        System.out.println("craft 규정에 따라 결제금액의 5%인 " + menuc.lecture[0].getLecPrice() * 0.05 + "포인트 적립됩니다.");
        System.out.println("적립된 포인트는 다음 수강신청 시 사용하실 수 있습니다.");
        // 진행상황
        System.out.println("==========================");
        System.out.println("카드결제가 진행됩니다.");
        System.out.println(". . .");
        System.out.println("카드 결제가 완료되었습니다. ");
    }


}
