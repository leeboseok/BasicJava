package IF;

public class IF2 {
	public static void main(String[] args) {
		int number=150;
		number-=1; //A+=B A=A+B		A/=B A=A/B		number/=2 number=number/2
		if(number>0) {
			System.out.println("양수입니다.");
			if(number>100) {
				System.out.println("100보다 큰 수입니다.");
				if(number%2==0) {
					System.out.println("짝수입니다.");
				}//if3
			}//if2
			System.out.println("외부조건만 만족하면 내부조건과 무관하게 실행");
		}//if
		System.out.println("if문들과는 완전 무관하게 실행되는 부분");
	}//main
}//class
