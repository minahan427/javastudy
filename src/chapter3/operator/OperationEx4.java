package chapter3.operator;

// 조건연산자(삼항연산자) : if문과 유사.
public class OperationEx4 {

	public static void main(String[] args) {
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch; // 숫자 사용시, 0~65535 범위를 갖는다.
		ch = (fatherAge > motherAge) ? 'T' : 'F'; //문자코드표현'', 숫자 가능
		
		System.out.println(ch); // F
	}
}
