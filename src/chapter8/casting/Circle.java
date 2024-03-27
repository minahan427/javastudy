package chapter8.casting;

public class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void Circle() {
		System.out.println("원입니다.");
	}
	
	void method1() {
		super.draw(); //부모의 draw()메소드 호출
	}
	
}
