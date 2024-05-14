package block;

public class Block {
	public static void main(String[] args) {
		//작명 권장사항(이름에 띄어쓰기를 사용하지 못하기 때문에 권장)
		//1. 파스칼표기 : 단어의 첫 문자를 대문자로 표기, class명에 사용
		//2. 카멜표기 : 두번째 단어부터 첫 문자를 대문자로 표기, 동작이름에 사용
		//3. 팟홀표기 : 띄어쓰기 대신 _를 사용, 변수명에 사용
		//지키지 않아도 오류가 발생하지는 않는다. 
		
		// {} 블락 : 영역을 나누는 기호
		// 블락 내부에서 생성된 변수는 블락이 종료되면 소멸한다.
		int a;
		{ 
			a=10;
			System.out.println(a);
		}//임의 블락의 종료지점
		a=20;
		System.out.println(a);
	}//main end
}//class end
