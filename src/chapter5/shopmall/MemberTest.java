package chapter5.shopmall;

public class MemberTest {

	public static void main(String[] args) {
		// 클래스 사용법
		// 객체생성: 클래스로 만든 변수를 다른 변수와의 구분을 위해 객체라고 부른다.
		// Member(): 클래스 이름으로 되어있는 메소드를 생성자라고 부른다.
		// new: 힙 영역의 공간에 클래스를 이용하여 메모리를 생성하는 기능.
		//클래스명 변수 = new 클래스이름();
		Member mem = new Member();
		/* 두줄로도 가능
		 Member mem = null; : 클래스로 만든 객체는 스택 영역의 공간(기억장소)에 생성됨.
		 mem = new Member();
		 */
		
	}

}
