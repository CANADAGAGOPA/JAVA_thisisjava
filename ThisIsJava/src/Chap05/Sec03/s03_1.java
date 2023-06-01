package Chap05.Sec03;

public class s03_1 {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2) {
            System.out.println("strVaq1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVaq1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("strVaq1과 strVar2는 문자열이 같음");
        }

        String strVar3 = "이순신";
        String strVar4 = new String("이순신");

        if(strVar3 == strVar4) {
            System.out.println("strVaq3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVaq3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVaq3과 strVar4는 문자열이 같음");
        }
    }
}
