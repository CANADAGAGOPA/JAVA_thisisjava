package Chap06.Sec06.hyundai;

// import 문으로 다른 패키지 클래스 사용을 명시
import Chap06.Sec06.hankook.SnowTire;
import Chap06.Sec06.kumho.AllSeasonTire;

public class Car {
    // 부품 필드 선언
    Chap06.Sec06.hankook.Tire tire1 =  new Chap06.Sec06.hankook.Tire();
    Chap06.Sec06.kumho.Tire tire2 =  new Chap06.Sec06.kumho.Tire();
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
