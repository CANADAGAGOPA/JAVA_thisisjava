package Chap05.Prac;

public class p7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int arrayMaxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (arrayMaxValue < array[i]) {
                arrayMaxValue = array[i];
            }
        }
        System.out.println(arrayMaxValue);
    }
}
