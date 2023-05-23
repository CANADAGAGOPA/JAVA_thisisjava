package Chap02.Sec02;

public class s02_1 {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다."); // true이기 떄문에 실행
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean result1 = (x == 20); // false
        boolean result2 = (x != 20); // true
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }
}
