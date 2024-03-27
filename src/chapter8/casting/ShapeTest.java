package chapter8.casting;

//참조타입의 클래스를 이용한 형변환(Casting) -> 다형성 학습을 하기 위한 전단계 예제.
//참조타입: 클래스가 상속관계에 따른 형변환.
public class ShapeTest {
	
	public static void main(String[] args) {
	//부모클래스 변수 = 자식객체;
	//Shape shape1 = Shape new Circle();
	//반대로 자식클래스 = 부모클래스 구문은 형변환 생략 불가능 에러: 자식클래스 = (자식클래스명) 부모클래스 명시적 형 변환
	//업캐스팅: 자식객체로 부모클래스 형변환. 묵시적 형 변환
	//Shape shape1 = (Shape)new Circle();
	Shape shape1 = new Circle();
	//*****draw() 메소드가 부모, 자식클래스에 같이 존재하면, 부모클래스 변수는 자식의 draw()메소드 호출하도록 설계돼있다.
	//*****그리고 부모클래스(Shape) 변수로 멤버들 호출하게 되면 자신의 클래스(Shape) 구성요소만 호출되도록 설계되어 있다.
	shape1.draw();//Circle클래스의 재정의된 draw()메소드가 호출
	//shape1.method1(); 자식클래스의 구성요소는 호출이 안되도록 설계돼있다.
	
	Shape shape2 = new Rectangle(); //해석: Shape shape2 = (Shape) new Rectangle();
	shape2.draw(); //Rectangle클래스의 재정의된 draw() 호출
	
	Shape shape3= new Triangle(); //해석: Shape shape3 = (Shape)new Triangle();
	shape3.draw(); //Triangle클래스의 재정의된 draw() 호출
	
	//다운캐스팅. 명시적 형변환
	//자식객체 = (자식클래스)부모객체;
	if (shape1 instanceof Circle) {
		Circle c1 = (Circle) shape1;
		c1.method1(); //shape1.method1()이렇게 호출 안되고 자식객체로 형변환해야 호출 되도록 설계
	}
		//Shape shape2 = new Rectangle();
		//Circle c2 = (Circle) shape2;
		Rectangle r1 = (Rectangle) shape2;
	
	}
}
