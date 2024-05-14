package test;

public class Sample02 {
	public static void main(String[] args) {
		int a = 100;
		System.out.println(a);
		int b = 500000;//*5,000,000
		System.out.println(b);
		char alpha = 'A';
		System.out.println(alpha);
		long lang = 21000000000L;
		System.out.println(lang);
		boolean bl = false;
		System.out.println(bl);
		double d = 3.123456;//*5,000,000
		System.out.println(d);
		float f = 3.1234567f;
		System.out.println(f);
			/* 가능한 방법 System.out.println(a+"\n"+ ....) */
				
		//boolean 	: true 또는 false
				//char 		: 문자 하나
				//byte 		: 아주작은수
				//short 	: 작은수
				//int 		: 일상적인 수
				//long 		: 아주 큰 수
				//float 	: 짧은 소수점
				//double 	: 긴 소수점
		
		String g; //문자열을 저장할 수 있는 타입  //문자열: 문자가 여러개 붙어있는 것(문장등)
		g="A"; //한글자만 들어가더라도 ""를 붙여서 넣는다.
		System.out.println(g);
	}//main end
}//class end
