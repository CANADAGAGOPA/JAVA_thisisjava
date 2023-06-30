package Chap06.Sec07.exam01.package2; // 패키지가 A, B 클래스와 다름

import Chap06.Sec07.exam01.package1.*;
// 동일한 패키지에 포함된 다수의 클래스를 사용할 때 클래스 이름을 생략하고 * 사용

public class C {
    // 필드 선언
 // A a; // X  <--- A 클래스 접근 불가 (컴파일 에러)
    B b; // O
}
