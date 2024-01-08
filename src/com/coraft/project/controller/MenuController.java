package com.coraft.project.controller;

import com.coraft.project.dto.LectureDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuController {
    private List<LectureDTO> lectures;

    Scanner sc = new Scanner(System.in);

    public MenuController() {
        lectures = new ArrayList<LectureDTO>();
        lectures.add(new LectureDTO("보컬 레슨 클래스", "2024년 1월 28일", "오후 6시30분 ~ 8시30분", 70000));
        lectures.add(new LectureDTO("천연 비누 만들기 클래스", "2024년 1월 15일", "오후 3시 ~ 4시30분", 40000));
        lectures.add(new LectureDTO("과자 만들기 클래스", "2024년 1월 20일", "오전 11시 ~ 오후 12시30분", 40000));
        lectures.add(new LectureDTO("레진 손거울 만들기 클래스", "2024년 2월 3일", "오후 1시 ~ 3시", 60000));
        lectures.add(new LectureDTO("전통 유리 공예 클래스", "2024년 2월 5일", "오후 1시30분 ~ 3시", 70000));
    }

    public void showListLecture() {
        System.out.println("*****************************************************");
        for(int i = 0; i < lectures.size(); i++) {
            System.out.println("-------------------------------------" + "\n"
                    + "강의 이름 : " + lectures.get(i).getLecName() + "\n"
                    + "날짜/시간 : " + lectures.get(i).getDate() + " / " + lectures.get(i).getTime() + "\n"
                    + "가격 : " + lectures.get(i).getLecPrice() + "\n"
                    + "-------------------------------------");
        }
        System.out.println("*****************************************************");

        System.out.print("강좌를 선택하시겠습니까? (Y / N) : ");
        char answer = sc.next().toUpperCase().charAt(0);
        if (answer == 'Y') {
            selectLecture();
        }else {
            System.out.println("메뉴를 잘못 입력했습니다.");
        }
    }

    public void selectLecture() {
        System.out.println("강의 선택");
    }
}
