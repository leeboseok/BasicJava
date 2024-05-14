package exam;

public class Exam01 {
	public static void main(String[] args) {
		People[] school=new People[4];
		school[0]=new Student(15, "홍길동");
		school[1]=new Teacher(45, "김철수");
		school[2]=new Student(16, "왕건");
		school[3]=new Student(17, "이순신");
		for(int i=0; i<school.length; i++) {
			school[i].work();
		}
		Student s= new Student(100, "이보석");
		s.show();
	}
}
//추상 클래스는 추상 메서드를 가질 수 있다.
//클래스는 추상 메서드를 가질 수 없다.
//추상 메서드를 가진 추상 클래스를 상속받은 일반 클래스는 반드시 추상 메서드의 몸통을 구현하여야 한다.
abstract class People{
	int age;
	String name;
	People(){
		
	}
	People(int a, String b){
		age=a;
		name=b;
	}
	void show(int a, String b){
		System.out.println("나이,이름 : "+a+","+b);
	}
	abstract void work();
}
class Student extends People{
	int kor;
	int eng;
	int math;
	
	Student(int a, String b){
		super(a, b);
		System.out.println(a+b);
	}
	void input(int[] arr) {
		kor=arr[0];
		eng=arr[1];
		math=arr[2];
	}
	void show() {
		System.out.println("나이 : "+age+", 이름 : "+name+"국어 :"+kor+", 영어 : "+eng+", 수학 : "+math);
	}
	void work() {
		System.out.println("공부합니다.");
	}
}
//abstract class가 abstract 메서드를 가진 경우
//이를 상속받은 class는 반드시 abstarct 메서드의 몸통을 구현하여야 한다.
class Teacher extends People{
	Teacher(int a, String b){
		super(a, b);
	}
	void work() {
		System.out.println("수업합니다.");
	}
}
