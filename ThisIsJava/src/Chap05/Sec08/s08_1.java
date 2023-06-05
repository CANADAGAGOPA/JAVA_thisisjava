package Chap05.Sec08;

public class s08_1 {
    public static void main(String[] args) {
        // 길이 3인 배열
        String[] oldStrArray = {"java", "array", "copy"};

        // 길이 5인 배열을 새로 생성
        String[] newStrArray = new String[5];

        // 배열 항목 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
