package method;

import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("num1에 저장할 숫자를 입력해 주세요");
		int num1=scan.nextInt();
		System.out.println("num2에 저장할 숫자를 입력해 주세요");
		int num2=scan.nextInt();
		System.out.println("num3에 저장할 숫자를 입력해 주세요");
		int num3=scan.nextInt();
		Exam e=new Exam();
		int result=e.sum(num1, num2, num3);
		System.out.println(result+"이 결과 입니다.");
		e.check();
	}
}
class Exam{
	//가급적 매개변수 명과 필드명을 같은 이름을 쓰지 맙시다. //가급적 사용한 이름은 사용하지 말자. //프레임워크에서는 같은 이름을 사용하기도 한다.
	//만약 같은 이름을 꼭 사용해야 하는 상황이 있다면 필드명 앞에 this.필드명 의 방법으로 필드와 매개변수 구별
	int a;
	int sum(int a, int b, int c) {
		System.out.println("두 수를 더하면 다음과 같습니다.");
		//매개변수로 전달된 데이터는 안써도 상관없다.
		this.a=a;
		System.out.println(a);
		return a+b;
		//retern a+b+c; retrun뒤에는 retrun도 실행 불가 // 다른 return 나올 수 없다.
		//System.out.println("retern이후에는 다른 명령 불가");
	}
	void check() {
		System.out.println("a내부의 값:"+a);
		//void는 return을 적으면 오류가 난다. //void타입은 반환 데이터가 없어 변수에 저장 불가
	}
}