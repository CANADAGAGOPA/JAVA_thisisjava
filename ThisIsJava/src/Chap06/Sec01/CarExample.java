package Chap06.Sec01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 선언
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("모델명 : " + myCar.model);
        System.out.println("시동여부 : " + myCar.start);
        System.out.println("현재속도 : " + myCar.speed);
    }
}
