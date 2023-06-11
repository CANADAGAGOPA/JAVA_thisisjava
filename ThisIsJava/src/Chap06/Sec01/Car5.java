package Chap06.Sec01;

public class Car5 {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car5(String model) {
        // 20라인 생성자 호출
        this(model, "은색", 250);
    }

    Car5(String model, String color) {
        // 20라인 생성자 호출
        this(model, color, 250);
    }

    Car5(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
