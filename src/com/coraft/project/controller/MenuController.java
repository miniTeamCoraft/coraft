package com.coraft.project.controller;

import com.coraft.project.dto.LectureDTO;
import com.coraft.project.view.Payment;

import java.util.Scanner;

public class MenuController {
    Scanner sc = new Scanner(System.in);
    Payment payment = new Payment();
    LectureDTO lecture[] = new LectureDTO[5];

    {
        lecture[0] = new LectureDTO("보컬 레슨 클래스", 100000);
        lecture[1] = new LectureDTO("천연 비누 만들기 클래스", 80000);
        lecture[2] = new LectureDTO("과자 만들기 클래스", 50000);
        lecture[3] = new LectureDTO("레진 손거울 만들기 클래스", 60000);
        lecture[4] = new LectureDTO("전통 유리 공예 클래스", 70000);
    }

    public void showListLecture() {
        System.out.println("=====================");
        for (int i = 0; i < lecture.length; i++) {
            System.out.println(lecture[i].lectInfo());
        }
        System.out.println("=====================");
        System.out.print("강좌를 선택하시겠습니까? (Y / N) : ");
        char answer = sc.next().toUpperCase().charAt(0);
        if (answer == 'Y') {
            selectLecture();
        }
    }

    public int selectLecture() {
        System.out.println("=====================");
        System.out.println("1.'보컬 클래스' 신청하기");
        System.out.println("2.'천연 비누 만들기' 신청하기");
        System.out.println("3.'과자 만들기' 신청하기");
        System.out.println("4.'레진 손거울 만들기' 신청하기");
        System.out.println("5.'전통 유리 공예 클래스' 신청하기");
        System.out.println("9. 뒤로가기");
        System.out.println("=====================");
        System.out.print("신청할 강좌를 선택하세요 : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println(lecture[0].lectInfo());
                payment.mainPayment(); break;

            case 2:
                System.out.println(lecture[1].lectInfo());
                payment.mainPayment(); break;

            case 3:
                System.out.println(lecture[2].lectInfo());
                payment.mainPayment(); break;
            case 4:
                System.out.println(lecture[3].lectInfo());
                payment.mainPayment(); break;

            case 5:
                System.out.println(lecture[4].lectInfo());
                payment.mainPayment(); break;

            case 9:
                System.out.println("뒤로가기");
                break;
            default:
                System.out.println("강좌를 잘못 선택하셨습니다.");
                break;
        }

        // 강좌 결제

        int index = num - 1;

        return index;
    }
}
