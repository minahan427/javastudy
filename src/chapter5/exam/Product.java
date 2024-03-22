package chapter5.exam;

public class Product {
	String name;
	int price;
	
	//생성자를 여러개 정의를 가능하게 하는 문법? 메소드 오버로딩
	//동일한 생성자를 중복 정의하는 문법 : 매개변수의 개수와 데이터 타입을 다르게 해야 한다.
	//기본생성자.
	Product () {	}
	
	//매개변수가 있는 생성자.
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
}
