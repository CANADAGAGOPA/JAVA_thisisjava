package Chap06.Sec01;

public class Car4 {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 선언
    Car4() {}

    Car4(String model) {
        this.model = model;
    }

    Car4(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car4(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
