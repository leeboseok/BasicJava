package cond;

public class WHILE {
	public static void main(String[] args) {
		//반목문 while
		//while(조건){반복 수행할 문장;}
		//반목문 do-while
		//조건이 거짓일 지라도 한번은 무조건 반복하도록 하는 문법
		
		int i=5;
		i++;
		System.out.println("반복중...");
		while(i>10){
			i++;
			System.out.println("반복중...");
		}
	}//main end
}//class end
