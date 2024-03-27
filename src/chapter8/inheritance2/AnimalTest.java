package chapter8.inheritance2;

public class AnimalTest {

	public static void main(String[] args) {

		//Animal클래스를 이용하여 객체를 생성.
		//자식 클래스와는 전혀 상관 없다.
		Animal ani = new Animal();
		ani.cry();//동물이 소리짖다
		ani.run();//동물이 달린다
		ani.play();//동물이 운동한다
		
		//자식클래스 Cat으로 객체 생성하면, 
		//new메모리연산자 부모클래스 Animal을 이용하여, 힙영역 메모리생성
		//돌아와서 자식클래스 Cat을 이용하여 힙영역 메모리생성
		//이 와중에 생성자는 부모생성자 호출 -> 자식생성자 호출로 이루어진다.(설계)
		Cat cat = new Cat();
		//재정의된 cry(), run()메소드는 자신의 것으로 호출
		cat.cry(); //고양이가 야옹야옹한다
		cat.run(); //고양이가 달린다.
		cat.method1(); //내부코드가 super.run() 갖고 있으므로 부모메소드 호출
		
		Animal animal = new Cat();
		animal.cry(); //Cat클래스의 재정의된 cry()호출
		animal.run(); //Cat클래스의 재정의된 cry()호출
	
		Animal animal2 = new Lion();
		animal.run();
		animal.cry();
		animal.play();
		
		if ( animal2 instanceof Lion) {
		Lion lion = (Lion) animal2;
		lion.play();
	}	
		
		//animal.method1(); 호출불가. 호출하고 싶을 경우 
		if ( animal instanceof Cat) {
		Cat c1 = (Cat) animal;
		c1.method1(); //호출가능
	}
		
		
	}

}
