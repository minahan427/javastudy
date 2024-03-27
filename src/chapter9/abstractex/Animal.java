package chapter9.abstractex;

//추상클래스는 abstract 키워드를 사용해야 한다.
//특징: 1) 객체생성 불가능(new 생성자()) 2) 상속 목적 3) 상속 받는 자식클래스는 강제 구현해야.
//몸체가 없는 메소드(추상메소드) : 메소드의 기능을 정의할 필요가 없다고 결정했을 때, 추상클래스로 구성하라.
public abstract class Animal {
	
	//추상클래스: 필드 사용 가능
	String eyeColor;
	String speed;
	//추상클래스: 메소드 사용 가능
	void methodA() {}
	
	//추상메소드: 몸체(body)가 없는 메소드
	abstract void run();
	
	abstract void cry();
}
