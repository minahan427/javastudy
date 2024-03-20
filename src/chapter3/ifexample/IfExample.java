package chapter3.ifexample;

//단일 if문 : 조건식이 1개일 때 사용
public class IfExample {

	public static void main(String[] args) {

		boolean isMarried = true;
		
		//(조건식)에는 true나 false로 해석되는 코드가 와야함.
		if(isMarried) {
			System.out.println("기혼입니다."); //기혼입니다.
		}
		
		boolean isEven;
		int num = 10;
		
		//해석: (num % 2 == 0) 코드가 true이면 true 대입, 아니면 false 대입
		isEven = (num % 2 == 0) ? true : false; // 10/2=5...0;
		System.out.println(isEven); //true

	}

}
