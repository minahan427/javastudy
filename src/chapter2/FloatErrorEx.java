package chapter2;

public class FloatErrorEx {

	public static void main(String[] args) {
		// 정수형 데이터 타입보다는 실수형 데이터 타입을 더 큰 범위로 저장하기 위하여 
		// 컴퓨터에서는 정수형 방식으로 데이터 표현을 실수형에서는 사용하지 않고, 부동소수점방식으로 설계
		// 정수형 데이터 표현 : ex) 32bit 부호비트 1+나머지 31bit
		// 실수형 데이터 표현 : ex) 32bit 부호비트 1+지수비트 8bit 가수비트 23bit 
		// 부동 소수점 방식으로 실수를 표현하다 보면 오차 문제가 발생된다.
		// 오차 문제는 다른 많은 라이브러리를 통하여 해결이 가능하다.
		
		System.out.println(0.1 + 0.2); //0.30000000000000004
	}

}
