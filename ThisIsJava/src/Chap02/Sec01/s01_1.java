package Chap02.Sec01;

public class s01_1 {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");
        System.out.println(hour + minute);

        int totalMinute = (hour * 60) + minute;
        System.out.println("총 " + totalMinute + "분");
    }
}
