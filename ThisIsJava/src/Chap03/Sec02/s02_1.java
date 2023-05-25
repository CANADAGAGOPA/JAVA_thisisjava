package Chap03.Sec02;

public class s02_1 {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i = 0; i < 5; i++) {
            var1++; // 127보다 커지는 순간 오버플로우 발생
            System.out.println("var1 : " + var1);
        }

        System.out.println("---------------------");

        byte var2 = -125;
        for(int i = 0; i < 5; i++) {
            var2--; // -128보다 작아지는 순간 언더플로우 발생
            System.out.println("var2 : " + var2);
        }
    }
}
