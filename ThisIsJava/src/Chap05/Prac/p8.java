package Chap05.Prac;

public class p8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int arraySum = 0;
        int arraySubSum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum = arraySum + array[i].length;
                for (int j = 0; j < array[i].length; j++) {
                    arraySubSum = arraySubSum + array[i][j];
                }
        }
        double arrayAvg = (double) arraySubSum / arraySum;

        System.out.println("전체 합은 : " + arraySubSum);
        System.out.println("평균은 : " + arrayAvg);
    }
}
