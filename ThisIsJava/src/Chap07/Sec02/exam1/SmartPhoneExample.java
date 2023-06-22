package Chap07.Sec02.exam1;

import Chap07.Sec01.SmartPhone;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // Phone 으로부터 상속 받은 필드 읽기
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
    }
}
