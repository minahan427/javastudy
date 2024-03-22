package chapter5.hiding;

//default 필드는 동일한 패키지일 경우 접근 가능
public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.day = 1; //public
		date.month = 10; //default는 public 처리
		//date.year = 2024; private 접근자로 돼있어 접근 안되는 특징이 있다.

	}

}
