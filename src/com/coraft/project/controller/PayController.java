package com.coraft.project.controller;

import com.coraft.project.dto.LectureDTO;
import com.coraft.project.dto.MemberDTO;
import com.coraft.project.dto.PaymentDTO;
import com.coraft.project.view.Payment;
import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayController {
    Scanner sc = new Scanner(System.in);
    MemberDTO memberDTO = new MemberDTO();  //고객DTO 객체생성
    LectureDTO lectureDTO = new LectureDTO();    //메뉴DTO 객체 생성
    MemberController menc = new MemberController();
    PaymentDTO paymentDTO = new PaymentDTO();

//    Payment pm = new Payment();

    // 포인트 차감 결제
    public void payBonusMember() {
        // 현제 보너스 포인트(객체 생성한 고객정보에서 고객명 받아온 후 현제 보너스 값 출력) = 기본값은 5000
        menc.l
        for (int i = 0; i < lecture.length; i++) {
            System.out.println(lecture[i].lectInfo());
        }
        System.out.println(/*memberDTO.getName() +*/  "김현지 회원님의 결제금액은 "
                + /*  lectureDTO.getLecPrice()*/ 5000 + "원 입니다.");

        int extraPoint = (int)(lectureDTO.getLecPrice() * 0.05);

        System.out.println("보유하신 포인트는 " + paymentDTO.getBonusPoint() + "포인트 입니다.");
        System.out.println("craft 규정에 따라 결제금액의 5%인 " + /*point*/"포인트 적립됩니다.");
        System.out.println("적립된 포인트는 다음 수강신청 시 사용하실 수 있습니다.");

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
            System.out.println(". . .");
            System.out.println("카드결제가 진행됩니다.");
            System.out.println(". . .");
            System.out.println("카드 결제가 완료되었습니다. ");

        } else if (newPrice == 0) {
            System.out.println(paymentDTO.getBonusPoint() + "포인트 차감되었습니다.");
            System.out.println(". . .");
            System.out.println("포인트로 결제 완료되었습니다.");
        }

    }

    // 카드결제
    public void payCardMember() {
        // 결제 금액
        System.out.println(memberDTO.getName() + "의 결제금액은 " + lectureDTO.getLecPrice() + "원 입니다.");
        System.out.println("craft 규정에 따라 결제금액의 5%인 " + /*point*/"포인트 적립됩니다.");
        System.out.println("적립된 포인트는 다음 수강신청 시 사용하실 수 있습니다.");
        // 진행상황
        System.out.println("카드결제가 진행됩니다.");
        System.out.println(". . .");
        System.out.println("카드 결제가 완료되었습니다. ");
    }

    // 포인트
//    public int plusPoint() {
////        List<Integer> intList = new ArrayList<>(paymentDTO.getBonusPoint());
//        return ;
//    }

//    public int originPoint() {
//        memberDTO.setPoint(5000);
//    }

    // 포인트 결합(기존포인트 + 결제 후 적립포인트)
    public int plusPoint() {
       int plusPoint = memberDTO.getPoint() + extraPoint();
       return plusPoint;
    }

    // 포인트 사용
    public int minusPoint() {
        if()

        int minusPoint = lectureDTO.getLecPrice() - memberDTO.getPoint();


        return minusPoint;
    }

    // 결제 후 포인트 적립
    public int extraPoint() {
        int extraPoint = (int)(lectureDTO.getLecPrice() * 0.05);
        return extraPoint;
    }




}
