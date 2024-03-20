package chapter3.ifexample;

// 다중if문 : 조건식이 여러개일 경우
public class IfExample4 {

	public static void main(String[] args) {

		// 변수 선언 시, 초기값을 주거나 아니면 코드 내에서 변수가 조건에 의하여 값을 가지도록 코딩해야 한다.
		int age = -9; //나이
		int charge;//입장료
		
		// 아래 다중if문에서 조건식이 성립이 안되어 charge변수가 값을 갖지 못하는 경우는 에러가 발생.
		
		if (age >=0 && age < 8) { //0세 이상 8세 미만
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}else if(age >= 8 && age < 14) { //8세 이상 14세 미만
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age >= 14 && age < 20) { //14세 이상 20세 미만
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		}else if(age >= 20){
			charge = 3000;
			System.out.println("일반인입니다.");
		}else {
			charge = 999999;
			System.out.println("나이를 확인해주세요.");
		}
		
		System.out.println("입장료는 " + charge + "원입니다.");
		
	}

}
