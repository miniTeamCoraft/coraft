package com.coraft.project.controller;

import com.coraft.project.dto.MemberDTO;
import com.coraft.project.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
    private ArrayList<MemberDTO> members;

    Scanner sc = new Scanner(System.in);

    public MemberController() {
        members = new ArrayList<MemberDTO>();
        members.add(new MemberDTO("id01", "pwd01", "user01", 25, '여', "010-1054-5078", "user01@mail.com", 1000000));
        members.add(new MemberDTO("id02", "pwd02", "user02", 21, '남', "010-3455-2343", "user02@mail.com", 3000));
        members.add(new MemberDTO("id03", "pwd03", "user03", 18, '남', "010-3864-7642", "user03@mail.com", 1200));
        members.add(new MemberDTO("id04", "pwd04", "user04", 45, '여', "010-2789-1087", "user04@mail.com", 60000));
        members.add(new MemberDTO("id05", "pwd05", "user05", 33, '여', "010-1283-0032", "user05@mail.com", 55000));
    }
    public void login(MemberDTO member) {
        System.out.println("로그인 확인");

        for(int i = 0; i < members.size(); i++) {
            if(members.get(i).getId().equals(member.getId())) {
                if(members.get(i).getPwd().equals(member.getPwd())) {
                    System.out.println("로그인을 성공했습니다.");
                    Menu menu = new Menu();
                    menu.mainMenu(members.get(i));
                }else {
                    System.out.println("비밀번호를 틀렸습니다. 다시 로그인해주세요.");
                    break;
                }
            }else {
                System.out.println("없는 아이디입니다. 다시 로그인해주세요.");
                break;
            }
        }
    }

    public void regist(MemberDTO user) {
        members.add(user);

        Menu menu = new Menu();
        menu.mainMenu(user);

        /* 전체 회원 출력 */
//        for(MemberDTO mem : members) {
//            System.out.println(mem.toString());
//        }
    }

    public void memberInfo(MemberDTO user) {
        System.out.println("*****************************************************");
        System.out.println("이름 : " + user.getName());
        System.out.println("나이 : " + user.getAge());
        System.out.println("성별 : " + user.getGender());
        System.out.println("전화번호 : " + user.getPhone());
        System.out.println("이메일 : " + user.getEmail());
        System.out.println("포인트 : " + user.getPoint());
        System.out.println("*****************************************************");

        int num;
        do {
            System.out.print("뒤로가기(1) : ");
            num = sc.nextInt();
        }while(num != 1);
    }



}
