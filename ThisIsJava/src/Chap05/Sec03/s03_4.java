package Chap05.Sec03;

public class s03_4 {
    public static void main(String[] args) {
        String ssn = "981212-1095714";
        int length = ssn.length();
        if(length == 14) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }
}
