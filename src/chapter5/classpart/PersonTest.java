package chapter5.classpart;

public class PersonTest {

	public static void main(String[] args) {
		// Person 클래스 사용 - 기억장소가 생성된 의미
		// 데이터 타입 이름 = new 데이터 타입 이름();
		// 클래스명 이름   =  new      클래스 ();
		
		Person ps1 = new Person();
		// ps1 객체가 가리키는 기억장소 표현
		ps1.name = "홍길동";
		ps1.height = 180;
		ps1.weight = 75;
		ps1.gender = 'M';
		ps1.married = true;
		
		//System.out.println("이름: " + ps1.name); ...를 한 줄로 한 방에 쓸 수 있음.
		ps1.getPersonInfo();
		
		
		Person ps2 = new Person();
		// ps2 객체가 가리키는 기억장소 표현
		ps2.name = "김미영";
		ps2.height = 160;
		ps2.weight = 60;
		ps2.gender = 'W';
		ps2.married = false;
		
		ps2.getPersonInfo();
		
		
		Person ps3 = new Person();
		// ps3 객체가 가리키는 기억장소 표현
		ps3.name = "손흥민";
		ps3.height = 183;
		ps3.weight = 77;
		ps3.gender = 'M';
		ps3.married = false;
		
		ps3.getPersonInfo();
		
		
		Person ps4 = new Person();
		ps4.name = "김여사";
		ps4.height = 155;
		ps4.weight = 52;
		ps4.gender = 'W';
		ps4.married = true;
		
		ps4.getPersonInfo();
		
		
		Person ps5 = new Person();
		ps5.name = "홍두깨";
		ps5.height = 171;
		ps5.weight = 68;
		ps5.gender = 'M';
		ps5.married = true;
		
		ps5.getPersonInfo();
	}

}
