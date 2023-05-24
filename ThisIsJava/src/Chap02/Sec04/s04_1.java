package Chap02.Sec04;

public class s04_1 {
    // 자동 타입 변환
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 : " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue : " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue " + doubleValue);
    }
}
