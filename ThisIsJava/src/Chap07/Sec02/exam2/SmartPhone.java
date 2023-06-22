package Chap07.Sec02.exam2;

public class SmartPhone extends Phone{
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        super(model, color); // 반드시 작성해야 한다.
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
