package Chap04.Sec01;

public class s01_3 {
    public static void main(String[] args) {
        String subject = "영어";
        int score = 83;

        if (subject == "국어") {
            if (score >= 90) {
                System.out.println("국어시험 합격입니다.");
            } else {
                System.out.println("국어시험 불합격입니다.");
            }
        } else {
            if (score >= 90) {
                System.out.println("영어시험 합격입니다.");
            } else {
                System.out.println("영어시험 불합격입니다.");
            }
        }
    }
}
