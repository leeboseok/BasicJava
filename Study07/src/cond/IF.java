package cond;

public class IF {
	public static void main(String[] args) {
		//조건문 if : 조건의 true, false여부에 따라 실행을 할지 말지 결정하는 문법
		//if(조건){조건이 true일 경우 수행할 명령;}
		//*x5,000,000
		//if문에 {}이 없는 경우 뒤에 처음으로 나오는 ;까지를 {}으로 본다.
		int a=10;
		int b=5;
		System.out.println("if문 밖이므로 조건과 무관하게 무조건 실행");
		if(a!=10){//새미콜론 주의하기. 컴퓨터가 인식 못하는 논리오류를 주의하자.
			b=20;
			System.out.println("조건이 참이므로 실행 합니다.");
		}//if end
		System.out.println(b);
		
		//if-else 문
		//조건에 따라 어느부분을 실행할지 결정하는 문법
		//if(조건){조건이 true일 경우 수행;}else{조건이 false일 경우 수행;}
		//절대로 두개가 동시에 실행되거나 아무것도 실행되지 않는 경우는 없다.
		a=104;
		if(a<100) { //로그인 서비스 할때 사용하면 좋을듯
			System.out.println("if-else의 조건이 true입니다.");
			if(a>5) {
				System.out.println("a는 5보다 크고 100보다 작다");
			}//if in the if-else
		}else {
			System.out.println("if-else의 조건이 false입니다.");
		 }//if-else end
		
		//if-else if : 조건이 여러개인 경우 그중 하나를 선택하여 수행하는 문장
		//조건은 위에서부터 순서대로 확인하고 하나라도 true가 나오면 아래는 보지 않는다.
		//if(조건1){}else if(조건2){}else if(조건3){} ....
		a=6;
		if(a>10) {
			System.out.println("조건1 만족");
		}else if(a>5) {
			System.out.println("조건2 만족");
		}else if(a>1) {
			System.out.println("조건3 만족");//조건 범위가 큰 것부터 위에부터 순서대로.
		}else {
			System.out.println("조건이 모두 불만족이므로 else실행");
		}
	}//main end
	//System.out.println("프로그램 종료지점 밖이므로 오류발생");
}// class end
