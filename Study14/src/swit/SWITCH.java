package swit;

public class SWITCH {
	public static void main(String[] args) {
		//switch 분기문 : 프로그램의 시작지점을 지정하는 문법
		// 특정 부분을 선별해서 사용하기 위해서는 break와 함께 사용해야 한다.
		/*
		 switch(변수면){
		 	case 값 : 변수의 값이 case의 값과 일치할 경우 수행할 문장;
		 	default : 변수의 값과 case의 값이 일치하는 것이 없는 경우 수행할 문장;
	     }
	     case들 중에서는 중복되는 값이 있어서는 안된다.
	     case의 값들은 오름차순, 내림차순 순서대로 적혀야 하는것은 아니다.
		 */
		String data="마";
		switch(data) {
			case "가" : System.out.println("가가 선택되었습니다.");break;
			case "나" : System.out.println("나가 선택되었습니다.");break;
			case "다" : System.out.println("다가 선택되었습니다.");break;
			case "라" : System.out.println("라가 선택되었습니다.");break;
			case "마" : 
			case "바" :
			case "사" : System.out.println("마바사가 선택되었습니다.");
			default : System.out.println("해당하는 값이 없습니다.");
		}//switch
		System.out.println("switch{} 외부에는 break가 영향을 미치지 않는다.");
		
		//switch문을 이용한 조건의 표현, 가급적 if문을 사용해 주세요.
		int score=100;
		String grade="";
		switch(score) {
			case 100 : case 99 : case 98 : case 97 :
			case 96 : grade="A+";break;
			case 95 : case 94 : case 92 : case 93 :
			case 91 : grade="A";break;
			case 90 : case 89 : case 88 : case 87 :
			case 86 : grade="B+";break;
			case 85 : case 84 : case 83 : case 82 : 
			case 81 : grade="B";break;
			default : System.out.println("재수강입니다.");
		}
		System.out.println(grade+"학점입니다.");
	}//main
}//class
