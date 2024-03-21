package chapter5.constructor;

public class PersonTest {

	public static void main(String[] args) {

		//Person p1 = new Person();
		Person p1 = new Person("홍길동");
		
		p1.height = 50f;
		
		//힙 영역에 생성된 Person클래스의 필드값을 확인하고자 한다.
		System.out.println(p1.name);  //null->홍길동
		System.out.println(p1.height);//0.0f
		System.out.println(p1.weight);//0.0f
		
		Person p2 = new Person(50.0f); //50.0d ≠ float f, f 붙여주기
		System.out.println(p2.height);
		
	}

}
