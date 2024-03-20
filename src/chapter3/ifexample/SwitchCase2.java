package chapter3.ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		// String class: 문자열 데이터를 관리할 때 사용.
		// char 데이터 타입과는 다름.
		String medal = "Gold";
		
		// switch문에 정수 변수 뿐만 아니라 문자열 변수를 사용할 수가 있다.(java 1.7부터 지원)
		switch (medal) {
			case "Gold":
				System.out.println("금메달입니다.");
				break;
			case "Silver":
				System.out.println("은메달입니다.");
				break;
			case "Bronze":
				System.out.println("동메달입니다.");
				break;	
			default:
				System.out.println("메달이 없습니다.");
				break;
		}
	
	}

}
