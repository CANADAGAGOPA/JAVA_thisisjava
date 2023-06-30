package Chap06.Sec07.exam02.package2; // 패키지가 A, B 클래스와 다름

import Chap06.Sec07.exam02.package1.*;
public class C {
    // 필드 선언
    A a1 = new A(true); // O
 // A a2 = new A(1);       // X  <--- default 생성자 접근 불가 (컴파일 에러)
 // A a3 = new A("문자열"); // X  <--- private 생성자 접근 불가 (컴파일 에러)
}
