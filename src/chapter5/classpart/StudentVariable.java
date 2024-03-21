package chapter5.classpart;

public class StudentVariable {

	public static void main(String[] args) {
		// 학생 관련 정보 저장. (학번, 이름, 학년, 주소지) 학생 한 명 한 명마다 작성해야 하는 번거로움 발생.
		int studentID; 
		String studentName; 
		int grade; 
		String address; 
		
		studentID = 1;
		studentName = "홍길동";
		grade = 4;
		address = "노원구";
		
		System.out.println("학번은? " + studentID );
		System.out.println("이름은? " + studentName );
		System.out.println("학년은? " + grade );
		System.out.println("주소는? " + address );
		
		int studentID2; 
		String studentName2; 
		int grade2; 
		String address2; 
		
		studentID2 = 2;
		studentName2 = "손흥민";
		grade2 = 3;
		address2 = "도봉구";
		
		System.out.println("학번은? " + studentID2 );
		System.out.println("이름은? " + studentName2 );
		System.out.println("학년은? " + grade2 );
		System.out.println("주소는? " + address2 );
	}

}
