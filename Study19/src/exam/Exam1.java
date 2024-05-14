package exam;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		
		int i;
		
		int num = 94;
		
		int ber = 93;
		
		for(i=num; i<=ber; i++) {
			
			System.out.println(i);
			
		}//for end
		
		Test a;
		
		a = new Test();
		
		a.make(num, ber);
		
		System.out.println("구구단을 출력합니다. 출력하신 단을 2~9사이 수로 입력해주세요.");
		
		Scanner n=new Scanner(System.in);
		
		int number=n.nextInt();
		
		a.multi_table(number);
		
	}//main end
}//class end
class Test{
	//메서드란 클래스 내부에 작성되어 객체가 수행하는 동작
	//리턴타입 이름(){}
	String make(int a, int b){
		
		int i;
		
		for(i=a; i<=b; i++) {
			
			System.out.println(i);
			
		}//for end
		
		return"스트링";
		
	}//make end
	
	void multi_table(int dan) {
		
		System.out.println("\t"+"["+dan+" 단]");
		
		System.out.println();
		
		int i;
		
		for(i=1; i<=9; i++) {
			
			System.out.println("\t"+dan+" x "+i+" = "+(dan*i));
			
		}//for end
		
	}//multi_table end
	
}//class Test end
