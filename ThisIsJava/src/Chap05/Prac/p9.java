package Chap05.Prac;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int[] scores = null;

        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");

            String strNum = sc.nextLine();

            switch (strNum) {
                case "1":
                    System.out.print("학생 수> ");
                    String x = sc.nextLine();
                    int stuNum = Integer.parseInt(x);
                    scores = new int[stuNum];
                    break;
                case "2":
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]> ");
                        String y = sc.nextLine();
                        int subject = Integer.parseInt(y);
                        scores[i] = subject;
                    }
                    break;
                case "3":
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                    break;
                case "4":
                    int subSum = 0;
                    int subMaxScore = 0;
                    for (int i = 0; i < scores.length; i++) {
                        if (subMaxScore < scores[i]) {
                            subMaxScore = scores[i];
                        }
                        subSum += scores[i];
                    }
                    double subAvg = (double) subSum / scores.length;
                    System.out.println("최고 점수: " + subMaxScore);
                    System.out.println("평균 점수: " + subAvg);
                    break;
                case "5":
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다");
                    break;
            }
        }
    }
}
