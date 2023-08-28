package Chap05.Sec03;

public class s03_3 {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char sex = ssn.charAt(7);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다");
                break;
        }
    }
}
