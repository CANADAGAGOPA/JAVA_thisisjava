package Chap02.Sec01;

public class s01_2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x : " + x + ", y : " + y + ", x+y : " + (x + y));

        int temp; // 빈 변수 선언
        temp = x;
        x = y;
        y = temp;
        System.out.println("x : " + x + ", y : " + y);
    }
}
