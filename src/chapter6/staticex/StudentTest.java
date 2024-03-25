package chapter6.staticex;

public class StudentTest {

	public static void main(String[] args) {
		// JVM이 main()메소드를 호출하면서, 프로그램이 실행될 때 Student클래스의 static필드와 메소드를 이용하여 static area에 매모리를 생성한다. 공유목적
		
		Student stu1 = new Student();//스택영역: 힙영역에 생성된 주소를 저장. 힙 영역: 실제 데이터를 저장
		stu1.setStudentName("손흥민");
		//static메소드는 클래스명,메소드명()호출해야 한다. 객체, 메소드명()으로 호출은 되나 권장하지 않음. stu1.getSerialNum(); x
		Student.getSerialNum(); //1
		
		System.out.println(stu1.getSerialNum()); //1
		
		Student stu2 = new Student();//스택영역과 힙영역에 메모리 생성
		stu2.setStudentName("김민재");
		Student.getSerialNum(); //2
		
		System.out.println(stu2.getSerialNum()); //2
	}

}
