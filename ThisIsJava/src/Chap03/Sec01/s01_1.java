package Chap03.Sec01;

public class s01_1 {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1 : " + result1);

        long result2 = v1 + v2 - v4;
        System.out.println("result2 : " + result2);

        double result3 = (double) v1 / v2; //소수점 이하까지 계산에 포함되는 숫자로 바꾸어서 나누기 연산을 수행
        System.out.println("result3 : " + result3);

        int result4 = v1 % v2;
        System.out.println("result4 : " + result4);
    }
}
