package chapter3.operator;

// 산술연산자 : +, -, *, /, %
public class OperationEx1 {

	public static void main(String[] args) {

		int mathScore = 90;
		int engScore = 75;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);  //165
		
		// int 형끼리 연산하면 결과는 int 가 된다. int/int=int
//		double avgScore = totalScore / 2;  -> 82.0 나옴. 소수점까지 평균 못 구함.
		double avgScore = totalScore / 2.0; //해석: (double)totalScore/2.0;
		System.out.println(avgScore); // 82.5 

	}

}
