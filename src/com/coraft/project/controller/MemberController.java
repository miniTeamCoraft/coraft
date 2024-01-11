package com.coraft.project.controller;

import com.coraft.project.dto.MemberDTO;
import com.coraft.project.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
    private ArrayList<MemberDTO> members;

    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();

    public MemberController() {
        members = new ArrayList<MemberDTO>();
        members.add(new MemberDTO("id01", "pwd01", "홍길동", 25, '남', "010-1054-5078", "user01@mail.com", 100000));
        members.add(new MemberDTO("id02", "pwd02", "김지윤", 21, '여', "010-3455-2343", "user02@mail.com", 50000));
        members.add(new MemberDTO("id03", "pwd03", "김현지", 18, '여', "010-3864-7642", "user03@mail.com", 30000));
        members.add(new MemberDTO("id04", "pwd04", "박다은", 45, '여', "010-2789-1087", "user04@mail.com", 10000));
    }

    public void login(MemberDTO memberDTO) {

        MemberDTO member = FindById(memberDTO.getId());
        if(member == null){
            System.out.println("등록되지 않은 ID입니다.");
        }else if(member.getPwd().equals(memberDTO.getPwd())) {
            System.out.println(member.getName() + "님 로그인 확인되었습니다.");
            Menu menu = new Menu();
            menu.mainMenu(member);
        }else {
            System.out.println("비밀번호를 틀렸습니다.");
        }

    }

    private MemberDTO FindById(String id) {
        for(MemberDTO memberDTO : members) {
            if(memberDTO.getId().equals(id)) {
                return memberDTO;
            }
        }
        return null;
    }

    public void regist(MemberDTO user) {
        members.add(user);

        menu.mainMenu(user);
    }

    public void memberInfo(MemberDTO user) {

        System.out.println("\n= 회원정보 =========================================");
        System.out.println("이름 : " + user.getName());
        System.out.println("나이 : " + user.getAge() + "세");
        System.out.println("성별 : " + user.getGender());
        System.out.println("전화번호 : " + user.getPhone());
        System.out.println("이메일 : " + user.getEmail());
        System.out.println("포인트 : " + user.getPoint());
        System.out.println("-------------------------------------------------");

        while(true) {
            System.out.print("메인으로 돌아갑니다. (Y / N) ");
            char answer = sc.next().toUpperCase().charAt(0);

            if(answer == 'Y') {
                menu.mainMenu(user);
            }else if(answer == 'N') {
                memberInfo(user);
            }else {
                System.out.println("다시 입력해주세요");
            }
        }

    }

    public String checkId() {
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();

        for(int i = 0; i < members.size(); i++) {
            if(members.get(i).getId().equals(id)) {
                System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
                System.out.println("-------------------------------------------------");
                return checkId();
            }
        }

        return id;
    }
}
