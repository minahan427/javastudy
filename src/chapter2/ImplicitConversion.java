package chapter2;
// 형 변환 (Casting) : 데이터 타입 변환
public class ImplicitConversion {

	public static void main(String[] args) {
		
		// 정수 데이터 타입 크기 순서  byte(1) < short(2) < int(4) < long(8)
		
		byte bNum = 10;  // 크기 1바이트
		
		// 1바이트 10이 4바이트 10으로 형 변환되어 좌측의 타입과 일치되어 변수에 대입된다.
		int iNum = bNum; //     4바이트 = 1바이트    int iNum = (int) bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		// 정수 데이터 타입보다는 실수 데이터 타입이 크다. (설계)
		int iNum2 = 20;
		float fNum = iNum2;  // 해석: float fNum = (float) iNum2;
		
		System.out.println(iNum2); // 20
		System.out.println(fNum);  // 20.0f (float형으로 저장)
		
		double dNum;
		dNum = fNum + iNum;  // fNum + iNum 해석: (float) + (int) -> 더 큰 데이터 타입으로 변환.
		                     // -> 20.0f + 10 -> (float) + (float)이 돼버림. -> 20.0f + 10.0f
							 // -> (double)을 만나서 30.0f가 30.0d 가 돼버림.
		
		System.out.println(dNum); // 30.0d
	}

}
