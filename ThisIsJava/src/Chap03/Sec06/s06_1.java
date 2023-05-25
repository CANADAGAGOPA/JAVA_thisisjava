package Chap03.Sec06;

public class s06_1 {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C'); // 피연산자에는 연산식도 올 수 있다.
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
