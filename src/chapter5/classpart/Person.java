package chapter5.classpart;

// 일반개인정보를 저장하기 위한 데이터 타입을 설계하는 클래스.
// 개인정보 : 이름, 신장(키), 몸무게, 성별, 결혼유무
public class Person {
	// 변수설계. -> 필드라고 부르기. : 기억장소 만드는 것
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	// 메소드 : 필드가 만든 기억장소에 접근해서 데이터를 이용한 기능 목적.
	public void getPersonInfo() {
		System.out.println("이름: " + name);
		System.out.println("신장(키): " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("성별: " + gender);
		System.out.println("결혼유무: " + married);
	}
}
