package Chap06.Sec02;

public class CalculatorExample {
    public static void main(String[] args) {
        // Calculator 객체 생성
        Calculator myCal = new Calculator();

        // 리턴값이 없는 powerOn() 메소드 호출
        myCal.powerOn();

        // plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
        // 덧셈 결과를 리턴 받아 result1 변수에 대입
        int result1 = myCal.plus(5, 6);
        System.out.println("result1 : " + result1);

        int x = 10;
        int y = 4;

        // divide() 메소드 호출 시 변스 x와 y의 값을 매개값으로 제공하고,
        // 나눗셈 결과를 리턴 받아 result2 변수에 대입
        double result2 = myCal.divide(x, y);
        System.out.println("result2 : " + result2);

        // 리턴값이 없는 powerOff() 메소드 호출
        myCal.powerOff();
    }
}
