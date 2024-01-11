package com.coraft.project.controller;

import com.coraft.project.dto.LectureDTO;
import com.coraft.project.dto.MemberDTO;
import com.coraft.project.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class PayController {

    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();

    public static ArrayList<LectureDTO> lec = new ArrayList<>();

    // 포인트 차감 결제
    public ArrayList<LectureDTO> payBonusMember(MemberDTO user, LectureDTO lecture) {

        int getPoint = (int)Math.abs((lecture.getLecPrice() * 5) / 100.0);

        System.out.println("-------------------------------------------------");
        System.out.println("craft 규정에 따라 결제금액의 5%인 " + getPoint + "포인트 적립됩니다.");
        System.out.println("적립된 포인트는 다음 수강신청 시 사용하실 수 있습니다.");
        System.out.println("-------------------------------------------------");
        System.out.println(user.getName() + "님의 결제금액은 " + lecture.getLecPrice() + "원 입니다.");
        System.out.println("보유하신 포인트는 " + user.getPoint() + "포인트 입니다.");

        int newPrice = lecture.getLecPrice() - user.getPoint();

        if(newPrice < 0) {
            System.out.println("보유하신 포인트가 결제할 금액보다 많습니다.");
            System.out.println("-------------------------------------------------");
            System.out.print("사용하실 포인트를 입력해 주세요 : ");
            int usePoint = sc.nextInt();

            int minusPoint = user.getPoint() - usePoint;
            System.out.println(usePoint + "포인트 사용하여 " + minusPoint + "포인트 남았습니다.");
            System.out.println("-------------------------------------------------");

            int usPrice = lecture.getLecPrice() - usePoint;
            System.out.println("포인트를 차감한 "  + usPrice + "원은 자동 카드결제됩니다.");
            System.out.println(". . .");
            System.out.println("카드 결제가 완료되었습니다. ");
            user.setPoint(getPoint + user.getPoint() - usePoint);

        } else if (newPrice > 0) {
            int usingPoint = lecture.getLecPrice() - user.getPoint();
            System.out.println("포인트를 차감한 " + usingPoint + "원은 자동 카드결제됩니다.");
            user.setPoint(getPoint);
            System.out.println("-------------------------------------------------");
            System.out.println("카드결제가 진행됩니다.");
            System.out.println(". . .");
            System.out.println("카드 결제가 완료되었습니다. ");

        } else if (newPrice == 0) {
            System.out.println(user.getPoint() + "포인트 차감되었습니다.");
            user.setPoint(getPoint + user.getPoint());
            System.out.println(". . .");
            System.out.println("포인트로 결제 완료되었습니다.");
        }

        lec.add(new LectureDTO(lecture.getLecName(), lecture.getDate(), lecture.getTime(), lecture.getLecPrice()));

        menu.mainMenu(user);

        return lec;

    }

    // 카드결제
    public ArrayList<LectureDTO> payCardMember(MemberDTO user, LectureDTO lecture) {

        int getPoint = (int)Math.abs((lecture.getLecPrice() * 5) / 100.0);

        System.out.println(user.getName() + "님의 결제금액은 " + lecture.getLecPrice() + "원 입니다.");
        System.out.println("craft 규정에 따라 결제금액의 5%인 " + getPoint + "포인트 적립됩니다.");
        user.setPoint(getPoint + user.getPoint());
        System.out.println("적립된 포인트는 다음 수강신청 시 사용하실 수 있습니다.");

        System.out.println("-------------------------------------------------");
        System.out.println("카드결제가 진행됩니다.");
        System.out.println(". . .");
        System.out.println("카드 결제가 완료되었습니다. ");

        lec.add(new LectureDTO(lecture.getLecName(), lecture.getDate(), lecture.getTime(), lecture.getLecPrice()));

        menu.mainMenu(user);

        return lec;
    }

    public void userSelectLec() {
        System.out.println("\n[ 수강 내역 ]");
        if(lec.isEmpty()) {
            System.out.println("수강 신청 내역이 존재하지 않습니다.");
        }else {
            for(int i = 0; i < lec.size(); i++) {
                System.out.println("강의 이름 : " + lec.get(i).getLecName() + " | 날짜 : " + lec.get(i).getDate() + " | 시간 : " + lec.get(i).getTime()  + " | 가격 : " + lec.get(i).getLecPrice() + "원");
            }
        }
    }

}
