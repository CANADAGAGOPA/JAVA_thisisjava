package Chap04.Sec01;

public class s01_2 {
    public static void main(String[] args) {
        int score = 73;

        if (score >= 90) {
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("A 등급입니다!");
        } else if (score >= 80){
            System.out.println("점수가 80점 이상입니다.");
            System.out.println("B 등급입니다!");
        } else if (score >= 70){
            System.out.println("점수가 70점 이상입니다.");
            System.out.println("C 등급입니다!");
        } else if (score >= 60){
            System.out.println("점수가 60점 이상입니다.");
            System.out.println("D 등급입니다!");
        } else {
            System.out.println("점수가 59점 이하입니다.");
            System.out.println("F 등급입니다!");
        }
    }
}
