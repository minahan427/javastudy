package chapter3.operator;

//증감연산자 ++, --
//변수 앞 또는 변수 뒤에 사용되느냐에 따라 동작(해석)이 달라진다.
public class OperationEx2 {
	
	public static void main(String[] args) {
				
		int gameScore = 150;
		
		//변수++ 뒤에 사용되면, 변수 값을 먼저 읽은 후 좌측에 대입하고, 나중에 변수+1을 적용한다.
		int lastScore1 = gameScore++;
		System.out.println(lastScore1); //150
		
		//변수-- 뒤에 사용되면, 변수 값을 먼저 읽은 후 좌측에 대입하고, 나중에 변수-1을 적용한다.
		int lastScore2 = gameScore--;
		System.out.println(lastScore2); //151
		
		System.out.println(gameScore); //150
		}

}
