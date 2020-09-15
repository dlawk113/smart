// 자바에서는 반드시 시작객체가 1개 존재해야한다.
// 시작객체=>시작이라는 동작을 가지고 있어야한다.
// 시작동작=>main()
public class OOP1 {
	public static void main(String[] args) {
		// 프로그램의 3대요소(변수, 자료형, 할당(=, 대입))
		// 4바이트 크기의 정수 데이터를 저장할 변수를 선언하시오?
		// Q.변수의 크기와 변수에 저장될 데이터의 종류를 결정하는것 ?(DataType=자료형)
		// 자료형(기본자료형-PDT)
		// 정수->int / 실수->float / 문자->char / 불(참,거짓)->boolean
		// 자료형(사용자정의자료형-UDDT) -> 도구(class)
		// 문자열->String  / 책->Book  / 회원->Member / 영화->Movie
		int a; // 변수선언-->기억공간이 만들어진다(메모리에) , symbol table
		// a에 100을 저장하시오.
		a=100;
        System.out.println(a);
        
        float f=56.7f; // 선언+초기화
	}
}
