package Chap06.Sec01;

public class CarExample5 {
    public static void main(String[] args) {
        Car5 car1 = new Car5("자가용"); // 생성자 호출
        System.out.println("car1.company : " + car1.company);
        System.out.println("car1.model : " + car1.model);
        System.out.println();

        Car5 car2 = new Car5("자가용", "빨강"); // 생성자 호출
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println();

        Car5 car3 = new Car5("자가용", "빨강", 200); // 생성자 호출
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println("car3.maxSpeed : " + car3.maxSpeed);
        System.out.println();
    }
}
