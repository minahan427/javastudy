package chapter5.hiding2;

import chapter5.hiding.MyDate;

//default 필드는 다른 패키지일 경우에는 접근이 불가능하다.
public class MyDateTest {

	public static void main(String[] args) {
		//import 구문 덕분에 chapter5.hiding 패키지를 생략할 수 있다.
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate();
		MyDate date3 = new MyDate();
		MyDate date4 = new MyDate();
		MyDate date5 = new MyDate();
		
		date1.day = 1; //public
		//date2.month = 10; //default는 private로 처리
	}
}
