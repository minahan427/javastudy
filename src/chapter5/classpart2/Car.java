package chapter5.classpart2;

// 객체 : 자동차
/*
 - 속성: 성격, 성질, 특성
    속도, 모델, 색상
    프로그래밍 : 변수
 - 기능 및 동작
    운전하다, 정지하다.
    프로그래밍 : 메소드
 */
//car.java 파일을 컴파일하면 Car.class 파일에 Car() 기본 생성자가 자동으로 생성된다.
//Car.java 파일에 Car (int speed) 매개변수가 있는 생성자를 정의하면,
//Car.class 파일에 Car() 기본 생성자가 생성되지 않도록 설계를 해두었다.
public class Car {
	
	//필드: 클래서에서 설계된 변수를 구분하기 위하여 부르는 이름.
	String company;
	int speed;
	String model;
	String color;
	boolean isAircon;
	
	//운전하는 기능
	void drive() {
		
	}
	
	// 정지하다.
	void stop () {
		
	}
	
	// 생성자 메소드 정의. 일반 메소드랑 만드는 문법이 조금 틀리다.
	//생성자 메소드를 여러개 만들 때 매개변수의 개수와 데이터 타입이 다르게 만들어야 한다는 규칙 - 생성자 오버로딩
	//Car (int speed) {}
	Car(String c) {
		this.company = company;
	}
	
	Car(String company, String color) {
		this.company = company;
		this.color = color;
	}
	
	Car(boolean isAircon) {
		this.isAircon = isAircon;
	}
	
	//위의 매개변수가 있는 생성자로 인하여, 기본생성자가 컴파일 과정에서 생성되지 않도록 설계되어 있기 때문에 
	//기본 생성자를 사용하고 싶으면, 수동으로 생성해야 한다.
	Car() {}
}