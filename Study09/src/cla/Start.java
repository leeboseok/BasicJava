package cla;

public class Start {
	public static void main(String[] args) {
		Student.jjajang=4;
		System.out.println(Student.jjajang);
	}//main end
}//class end
class Student { //변수 이름지을때 3개월 후에도 왜 만들었는지 알게끔 짓는다.
	int number; 	//학번을 저장할 공간
	String name; 	//이름을 저장할 공간
	String phone; 	//연락처를 저장할 공간
	boolean check; 	//출석여부를 저장할 공간
	static int jjajang; // 메모 적는 부분 static
}//class end
