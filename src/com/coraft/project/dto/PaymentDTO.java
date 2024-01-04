package com.coraft.project.dto;

public class PaymentDTO {

    private int payCard;            //카드결제
    private int bonusPoint = 5000;         //보너스
    // 회원가입 축하금 5000원(회원가입 축하 인사말에 5000원보너스가 지급되었습니다.)
    //초기값으로 보너스 5000원 세팅(클래스 결제될 때마다 보너스 5% 추가적립)

    public PaymentDTO() {}

    public PaymentDTO(int payCard, int bonusPoint) {
        this.payCard = payCard;
        this.bonusPoint = bonusPoint;
    }

    public void setPayCard(int payCard) {
        this.payCard = payCard;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public int getPayCard() {
        return payCard;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }


}
