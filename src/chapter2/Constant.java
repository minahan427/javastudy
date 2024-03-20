package chapter2;

public class Constant {

	public static void main(String[] args) {
		// 상수와 리터럴
		
		// 상수 선언 키워드 : final
		// 상수 이름은 대문자로 정의한다. 규칙은 아니고 관례.
		// 상수 이름으로 값을 변경할 수 없다.
		final int MAX_NUM = 100; // final 키워드 제외하면 변수라고 부른다.
		
	//	MAX_NUM = 200; 상수는 값을 변경하면 에러가 발생
		
		final int MIN_NUM;
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
