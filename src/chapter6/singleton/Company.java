package chapter6.singleton;

//디자인 패턴 중 싱글톤 패턴으로 구성하는 클래스이다.
//싱글톤 패턴 디자인: 단 하나의 객체만 생성하고자 하는 목적
public class Company {
	//1)클래스 안에서 자신을 private static 멤버로 객체 생성.
	private static Company instance = new Company();
	
	//2)생성자 디폴트생성자를 생성되지 않게 하고 private접근자를 사용해라.
	private Company() {}
	
	//public getter 메소드 정의: instance가 private이므로 클래스 외부에서 접근이 막아져 있으므로 getter 메소드 사용
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
		
	}
	
}
