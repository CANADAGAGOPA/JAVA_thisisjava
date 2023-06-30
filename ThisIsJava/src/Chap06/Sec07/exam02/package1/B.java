package Chap06.Sec07.exam02.package1; // A 클래스와 패키지 동일

public class B {
    // 필드 선언
    A a1 = new A(true); // O
    A a2 = new A(1);    // O
 // A a3 = new A("문자열"); // X  <--- private 생성자 접근 불가능 (컴파일 에러)
}
