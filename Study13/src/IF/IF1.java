package IF;

import java.util.*; //Scanner를 포함한 편의기능들이 다 들어있는 묶음
public class IF1 {
	public static void main(String[] args) {
		
		int a=5;
		
		System.out.println("if앞에 나온 부분은 조건과 무관합니다.");
		if(a<0){
			System.out.println("조건이 참이므로 실행합니다.");
			System.out.println("명령이 여러개여도 수행합니다.");
			a=25;
		}//if
		System.out.println(a);
		
		Scanner b;
		b=new Scanner(System.in);
		System.out.println("음수를 포함해서 숫자를 하나 입력해 주세요. 문자금지!");
		a=b.nextInt();
		if(a<0) {
			System.out.println("음수입니다.");
		}
		if(a>0) {
			System.out.println("양수입니다.");
		}

		
	}//main
}//class
