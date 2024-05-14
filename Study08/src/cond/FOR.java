package cond;

public class FOR {
	public static void main(String[] args) {
		//반복문 for : 특정 동작을 반복해서 수행하도록 하는 문법
		//for(시작점; 조건; 증감식){반복 수행할 문장;}
		//*x5,000,000 반시계방향
		//반복 기준점을 잡고 기준점에 변화를 줘서 특정값이 될 때까지 반복해라
		System.out.println("반복시작 전");
		int i;
		for(i=4; i<6; i++) {
			System.out.println("반복중..."+i);
		}// for end
		System.out.println("반복 종료"+i);//거짓말로 만들었던 마지막 i의 숫자로 나온다. //반복의 횟수를 개발자가 특정할 수 있을때 for문 사용.
	}// main end
}//class end
