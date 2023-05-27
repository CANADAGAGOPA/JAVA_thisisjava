package Chap04.Sec02;

public class s02_2 {
    public static void main(String[] args) {
        int time = (int)(Math.random() * 4) + 8; // 8과 11사이의 수 뽑기
        System.out.println("[현재 시간] : " + time + "시");

        switch (time) {
            case 8:
                System.out.println("출근합니다.");
                break;
            case 9:
                System.out.println("회의를 합니다.");
                break;
            case 10:
                System.out.println("업무를 봅니다.");
                break;
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
