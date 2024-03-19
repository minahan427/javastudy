package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		// 문자형 데이터 타입 : char(2)
		// char 데이터 타입으로 만든 기억장소에는 값을 작은 따옴표(')로 표현
		// 문자 1개만 저장해야 한다.
		// 문자로 저장되지만, 내부적으로는 숫자의 의미를 가지고 있다.
		// 문자로 해석하여 사용된다.
		// 아스키, 유니코드의 숫자 사용. 유니코드값: 0 ~ 65535 범위로 사용.
		
		// 문자 1개를 저장
		char ch1 = 'A';
		System.out.println(ch1); // 문자 A 출력
		System.out.println((int)ch1); //문자에 해당하는 숫자값 출력
		
		// 숫자로 저장
		char ch2 = 66;
		System.out.println(ch2); // 문자 B 출력
		
		int ch3 = 45000;
		System.out.println(ch3); // 숫자 67 출력 
		System.out.println((char)ch3); // 문자 C 출력
	}


}
