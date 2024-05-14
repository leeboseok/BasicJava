package IF;

public class IF3 {
	public static void main(String[] args) {
		//if-else문
		//if문은 실행 할지 말지를 결정한다면
		//if-else문은 둘 중 하나를 골라서 실행하게 된다.
		//둘 다 실행되는 경우는 없고, 둘다 실행되지 않는 경우도 없다.
		//if(조건){조건이 true일때 실행될 부분;}else{조건이 false일때 실행될 부분;}
		int number=51;
		if(number%2!=0) {
			System.out.println("홀수입니다.");
			if(number>=100) {
				System.out.println("100보다 크거나 같은 수 입니다.");
			}else {
				System.out.println("100보다 작은 수 입니다.");
				if(number>50) {
					System.out.println("50보다는 큰 수 입니다.");
				}//if in the if-else2
			}//if-else2
		}else {
			System.out.println("짝수입니다.");
		}//if-else
	}//main
}//class
