package chapter8.inheritance2;

public class Lion extends Animal {

	//메소드 오버라이딩(재정의)
	@Override
	void run() {
		System.out.println("사자가 달린다.");
	}

	@Override
	void cry() {
		System.out.println("사자가 으르렁한다.");
	}

	//일반메소드 추가
	void play() {
		System.out.println("사자가 운동한다.");
	}

}
