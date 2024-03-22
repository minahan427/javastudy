package chapter5.hiding;
//접근자의 4가지 유형
/*
1) private. 접근 금지
2) default.  접근자 사용 안함. 동일한 패키지일 경우, 접근 가능(public). 다른 패키지일 경우, 접근 불가.(private)
3) public. 접근 허용
private < default < public
4) protected : 상속접근자
*/
public class MyDate {
	
	public int day;
	int month;  //dafault int month;라고 할 필요 없다.
	private int year;
	
}
