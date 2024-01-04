package com.coraft.project.controller;

import com.coraft.project.dto.MemberDTO;

import java.util.ArrayList;

public class MemberController {

    public class UserDataSet {
        private ArrayList<MemberDTO> members;

        public UserDataSet() {
            members = new ArrayList<MemberDTO>();
        }

        // 회원 추가
        public void addUsers(MemberDTO user) {
            members.add(user);
        }

        // 아이디 중복 확인
        public boolean isIdOverlap(String name) {
            return members.contains(new MemberDTO());
        }

        // 회원 삭제
        public void withdraw(String id) {
            members.remove(getUser());
        }

        // 유저 정보 가져오기
        public MemberDTO getUser() {
            return members.get(members.indexOf(new MemberDTO()));
        }

        // 회원인지 아닌지 확인
        public boolean contains(MemberDTO members) {
            return members.contains(members);
        }

    }
}
