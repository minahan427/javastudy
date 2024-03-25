package chapter7.otherarray;

import java.awt.print.Book;

public class BookTest {

	public static void main(String[] args) {
		//생성자의 접근자 이해 때문에 작성.
		//default는 동일 패키지 접근, 다른 패키지 접근 불가
		//public 경우에 패키지 상관 없이 모두 접근 가능
		Book b1 = new Book();

	}

}
