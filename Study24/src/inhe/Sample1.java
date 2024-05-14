package inhe;

public class Sample1 {
	public static void main(String[] args) {
	
	
	}//main end
}//class end
//상속
//부모 클래스가 가진 필드, 메서드를 이어받아 사용하는 방법
//부모 클래스에 작성된 내용들은 자식 클래스가 사용할 수 있지만
//자식 클래스에 별도로 작성된 내용들은 부모 클래스가 사용할 수 없다.

//부모 크기의 변수에는 자식클래스로 만들어진 객체가 들어갈 수 있고, 이는 더 위 조상에게도 해당한다.
//extends를 적지 않은 모든 클래스는 Object클래스의 상속을 받는다.
//따라서 보든 클래스의 조상은 object이며 대부분의 데이터를 저장할 수 있는 규격
//자식클래스를 객체로 조립하면 부모의 생성자가 '먼저'실행된다.

//오버라이드 : 부모에게서 '상속받은 메서드'를 자식이 재정의하여 사용하는 기법
//부모의 메서드를 리턴타입까지 똑같이 작성한 이후 {}내부의 내용만 변경한다.
//조부모로부터 물려받은 메서드를 부모가 오버라이드 한 경우 자식은 오버라이드 된 결과물을 상속받는다.
class Parent{//기본적으로 오브젝트가 적혀있다.
	int field;
	void method() {
		System.out.println("Parent의 원본 메서드");
	}
	Parent(){
		System.out.println("Parent의 생성자 실행");
	}
}
class Child extends Parent{
	int number;
	void method() {
		System.out.println("Child가 재정의한 메서드");
	}
	Child(){
		System.out.println("Child의 생성자 실행");
	}
}
class Student extends Child{
	String study;
	void method() {
		System.out.println("Child가 재정의한 메서드를 Student가 재정의한 메서드");
	}
	Student(){
		System.out.println("Student의 생성자 실행");
	}
}
