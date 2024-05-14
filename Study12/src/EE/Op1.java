package EE;

public class Op1 {
	public static void main(String[] args) {
		//이항연산자
		//	산술연산자 : 계산의 결과가 특정한 값으로 나온다
		//	비교연산자 : 계산의 결과가 true 또는 false로 나온다.
		// 	> : 왼쪽이 오른쪽보다 큰지 확인
		//	< : 왼쪽이 오른쪽보다 작은지 확인
		//	>=: 왼쪽이 오른쪽보다 크거나 같은지 확인
		//	<=: 왼쪽이 오른쪽보다 작거나 같은지 확인
		//	==: 왼쪽과 오른쪽이 동일한지 확인, 조건작성시 =로 쓰지 않도록 주의 *x5,000,000
		//	!=: 왼쪽과 오른쪽이 다른지 확인
		int a=10;
		int b=5;
		boolean result=(a+b)>(a*b); //a와 b를 더한 값이 a와 b를 곱한 값보다 큰지 확인
		System.out.println(result);		
		
		int c=a+b;
		int d=a*b;
		result=c>d;
	}//main end
}//class end