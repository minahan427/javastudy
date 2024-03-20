package chapter2;
//형 변환 (Casting) : 데이터 타입 변환
//명시적 형 변환
public class ExplicitConversion {

	public static void main(String[] args) {
		
		// 큰데이터타입 = 작은데이터타입 (가능)
		// 작은데이터타입 = 큰데이터타입 (불가능) -> 작은데이터타입 = (작은데이터타입)큰데이터타입 (가능)

		double dNum1 = 1.2;  // 해석: double dNum1 = 1.2d;
		float fNum2 = 0.9f;  // f 안쓰면 d로 인식
		
		//int iNum3 = dNum1; (불가능)
		int iNum3 = (int) dNum1 + (int) fNum2; // 1.2 의 정수로 소수점이 떨어짐.
		int iNum4 = (int) (dNum1 + fNum2); // 1.2d+0.9d =2.1d 에서 int 대입
		
		// 실수값이 정수값으로 변환 시 소수부분은 버려진다. 반올림x ex) (int) 0.9f -> 0
		System.out.println(iNum3); // 1
		System.out.println(iNum4); // 2

	}

}
