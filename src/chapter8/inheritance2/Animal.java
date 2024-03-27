package chapter8.inheritance2;

public class Animal {
	//메소드 : head + body의 구조. head: prototype(프로토타입)
	
	//달린다(움직인다)
	void run() {
		System.out.println("동물이 달린다.");
	}
	
	//소리짖다(울다)
	void cry() {
		System.out.println("동물이 소리짖다.");
	}
	
	//운동한다
	void play() {
		System.out.println("동물이 운동한다.");
	}
}
