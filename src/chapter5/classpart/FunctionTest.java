package chapter5.classpart;

//메소드 : 기능을 구현하는 코드로 구성된 것.
//메소드 기본구조
/*
 리턴타입 메소드 이름(매개변수 선언) {
    ... 사탄들의 학교에
    ... 코드들의 등장이라..
    return 사용유무;
 }
 */
public class FunctionTest {

	// main()메소드 : 자바에서 프로그램을 실행하기 위한 목적으로 만들어준 것.
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int sum = add(n1, n2);
		System.out.println(n1 + " + " + n2 + " = " + sum + " 입니다.");
		
		int sub = substract(n1, n2);
		System.out.println(n1 + " - " + n2 + " = " + sub + " 입니다.");

		int mul = multiply(n1, n2);
		System.out.println(n1 + " * " + n2 + " = " + mul + " 입니다.");
		
		/*나눗셈 할 때 더 간단히 쓰는 방법
		  n1 = 2;
		  n2 = 3;
		
		 System.out.println( n1 + " / " + n2 + " = " + divide(n1, n2) + " 입니다.");
		 */
		double div = divide(n1, n2);
		System.out.println( "( " + n1 + " + " + n2 + " )" + " / " + 2 + " = " + div + " 입니다.");
	}
	
	// 정수형 숫자 2개의 값을 매개변수로 제공받아 더한 값을 리턴하는 메소드.
	//ex) 덧셈 10 + 20 = 30
	public static int add(int num1, int num2) {
		
		//2개의 값을 더하는 코드작성.
		int result = num1 + num2;
		
		return result;
	}
	//ex) 뺄셈 10 - 20 = -10
	public static int substract(int num1, int num2) {
		int result = num1 - num2;
		
		return result;
	}
	
	//ex) 곱셈 10 * 20 = 200
	public static int multiply(int num1, int num2) {
		int result = num1 * num2;
		
		return result;
	}
	
	//ex) 나눗셈 10 + 20 / 2 = 15
	public static double divide(int num1, int num2) {
		
		// 정수끼리 연산하면 결과는 정수로 떨어짐 ex) 정수 + 정수 = 정수
		// 정수와 실수끼리 연산하면 결과는 실수로 떨어짐 ex) 정수 + 실수 = 실수  해석: (실수데이터타입)정수+실수=실수;
		// 실수끼리 연산하면 결과는 실수로 떨어짐 ex) 실수 + 실수 = 실수
		double result = ( num1 + num2 ) / 2.0; //2.0D
		
		return result;
	}
	
}
