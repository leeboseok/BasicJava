package var;

public class CHAR {
	public static void main(String[] args) {
		//char : 케릭터, 문자 하나를 저장할 수 있는 변수타입
		//저장하는 문자가 명령어가 아닌 문자 하나임을 알려주기 위해 'A'로 데이터를 표현
		//컴퓨터는 문자 자체의 의미를 해석할 수 없기 때문에 문자마다 숫자를 부여해서 기억
		//문자 하나는 ''여러개의 문자는 ""로 묶어줘야 한다.
		char a;
		a='A';//글자는 한글자만 들어감
		System.out.println(a);
		
		char b;
		b=97; //문자로 출력됨 //A = 65, a = 97
		System.out.println(b);
		
		char c='가';
		int i=c; // 가 = 44032 
		System.out.println(i);
		
	}
}
