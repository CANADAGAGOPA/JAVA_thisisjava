package Chap05.Sec03;

public class s03_5 {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);

        if(oldStr == newStr) {
            System.out.println("oldStr 변수와 newStr 변수가 같은 참조이다");
        } else {
            System.out.println("oldStr 변수와 newStr 변수가 다른 참조이다");
        }
    }
}
