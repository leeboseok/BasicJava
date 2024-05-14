package fo;

public class FOR3 {
	public static void main(String[] args) {
		//break : 제어문이 가지고 있는 동작을 정지시키는 효과
		//continue : 제어문이 가지고 있는 동작을 처음으로 돌아가는 효과
		//continue가 발생하면 그 아래부분이 동작하지 않는 효과가 있다.
		for(int i=0; i<10; i++) {
			if(i%2==0) {
					continue;
			}//if
			System.out.println(i);
		}//for
		System.out.println("반복문의 외부에서는 break의 영향을 받지 않습니다.");
		
		//while : {}내부의 내용을 반복해서 수행하는 제어문법
		//while(조건){반복해서 수행할 문장;}
		//조심해서 사용하지 않으면 무한반복오류에 빠질 수 있다.
		//do{반복해서 수행할 문장;}while(조건);
		//do-while은 조건이 거짓일지라도 한번은 무조건 실행하도록 하는 기법이다.
		int a=0;
		
		System.out.println("반복중..."+a);
		a--;
		
		while(a>1){
			System.out.println("반복중..."+a);
			a--;	
		}
	}//main
}//class
