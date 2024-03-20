package chapter3.operator;

// 관계연산자 : >, <, ==, >=, <=, !=
// 논리연산자 : &&(논리합), ||(논리곱), !(부정)
public class OperationEx3 {
	
	// && 논리 and연산자
	// 2개의 입력조건이 true 일 때만 결과가 true가 된다.
	// 1개라도 입력조건이 false일 경우에는 결과가 false가 된다.
	// 좌측의 코드가 false이면 우측의 코드는 실행되지 않는다.
	
	// || 논리 or연산자
	// 1개라도 입력조건이 true 면 결과가 true가 된다.
	// 2개의 입력조건이 false일 경우에는 결과가 false가 된다.
	// 좌측의 코드가 true이면 우측의 코드는 true or false 상관없이 결과가 true가 되고 우측코드는 실행되지 않는다.(규칙)

	//코드가 실행되려면 main()메소드 안에 작성돼야 한다.
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		//                10=10+10<10 false         2=2+2<10 true    
		boolean value = (num1 = num1 + 10) < 10 && (i = i + 2) < 10; //true or false가 와야 한다.
		//위의 코드가 어떻게 동작이 되는지를 이해하기 위하여 변수의 값을 출력한다.
		System.out.println(value); //false
		System.out.println(num1); //20
		System.out.println(i); //4가 안 나왔네? 좌측 코드값이 false
		//우측의 코드(4)가 실행되지 않아 i변수값은 좌측의 값(2)으로 출력된다.
		
		System.out.println("===============================");
		
		//      10=10+10<10 true           2=2+2<10 true
		value = (num1 = num1 + 10) > 10 || (i = i + 2) < 10;
		System.out.println(value);//true
		System.out.println(num1);//30
		System.out.println(i);//4 또 안 나와? 좌측 코드값이 true
		//우측의 코드(4)가 실행되지 않아 i변수값은 좌측의 값(2)으로 출력된다.
	}

}
