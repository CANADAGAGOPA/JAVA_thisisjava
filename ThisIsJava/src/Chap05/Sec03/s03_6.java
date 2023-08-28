package Chap05.Sec03;

public class s03_6 {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6); // 0번째부터 6번째 직전까지 인덱싱
        System.out.println(firstNum);

        String secondNum = ssn.substring(7); // 7번째부터 끝까지 인덱싱
        System.out.println(secondNum);
    }
}
