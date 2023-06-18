package Chap06.Sec05;

public class KoreanExample {
    public static void main(String[] args) {
        // 객체 생성 시 주민등록번호 이름 전달
        Korean k1 = new Korean("991111-1234567", "김자바");

        // 필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // final 필드는 값을 변경할 수 없음
        // k1.nation = "USA"; // 에러
        // k1.ssn = "123-12-1234"; // 에러

        // 비 final 필드는 값 변경 가능
        k1.name = "김파이썬";
        System.out.println(k1.name);
    }
}
