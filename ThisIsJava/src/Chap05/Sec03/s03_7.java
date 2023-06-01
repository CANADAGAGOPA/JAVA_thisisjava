package Chap05.Sec03;

public class s03_7 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location); // 3번째 문자열부터 인덱싱
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련없는 책이군요.");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련없는 책이군요.");
        }
    }
}
