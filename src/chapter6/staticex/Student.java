package chapter6.staticex;

//JVM이 운영체제로부터 메모리 할당을 위임받아서 자바프로그램을 실행할 때 사용되는 메모리의 영역을 학습하는 예제.
//static area(method area) : 정적영역
//책은 예제의 단순함을 위하여 필드의 접근자를 public으로 사용했으나, 실제 개발에서는 필드는 private, public getter/setter메소드 사용
public class Student {
	//필드 선언
	//**필드가 private 접근자일 때만 getter/setter메소드를 정의한다.**
	//문법> 접근자 [static선택] 데이터 타입 변수;
	
	//자바프로그램이 실행될 때, JVM이 클래스의 내용을 보고, static 키워드를 사용하는 필드 또는 메소드에 대하여, static area 메모리를 생성한다.
	//static 필드(정적 필드)
	private static int serialNum; //static 필드를 접근하는 메소드는 static이어야 한다.
	
	//instance 필드(인스턴스 필드): Student stu1 = new Student(); 객체생성구문이 실행될 때에만 stack, heap 영역의 메모리를 사용한다.
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	private int count;
	
	//getter 메소드: studentName필드로 생성된 기억장소의 값을 읽어오기 위한 목적의 메소드
	public String getStudentName() {
		return studentName;
	}
	
	//setter 메소드는 void여야 한다.
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//3개 필드에 대한 getter/setter 메소드 선언하기
	//int grade;
	public int getGrade() {
		//serialNum++; 사용가능. static필드 또는 메소드 jvm이 자동으로 메모리를 생성해주기 때문.
		//인스턴스 메소드가 호출이 된다면, 먼저 생성되어 있는 메모리 접근이 가능하므로 문제가 안된다.
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	//String address;
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//int String;
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	//static int serialNum;
	public static int getSerialNum() {
		//studentName = "홍길동"; 에러발생. 이유는 static메소드에서 
		serialNum++;
		//static 필드는 클래스명, static필드로 기억장소를 접근한다.
		
		return Student.serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		//static 필드는 클래스명, static필드로 기억장소를 접근한다.
		Student.serialNum = serialNum;
	}
	
}
