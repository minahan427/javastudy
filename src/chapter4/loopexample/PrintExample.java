package chapter4.loopexample;

//print(), println()의 차이점.
public class PrintExample {

	public static void main(String[] args) {
		
		//print() : 줄바꿈 기능이 없다. 한 줄에 출력.
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		System.out.println("==================================");
		
		//println() : 줄바꿈 기능이 있다. 줄 변경되며 출력.
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "\t");
		}

	}

}
