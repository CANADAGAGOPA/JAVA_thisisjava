package Chap04.Sec06;

public class s06_1 {
    public static void main(String[] args) {
        while (true) {
            int num = (int)(Math.random() * 6) + 1;
            System.out.println(num + "이 나왔습니다.");
            if(num == 6) {
                break; // 6이 나오면 while문 종료
            }
        }
        System.out.println("프로그램 종료");
    }
}
