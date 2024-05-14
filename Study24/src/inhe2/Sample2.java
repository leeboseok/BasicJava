package inhe2;

public class Sample2 {
	public static void main(String[] args) {
		GrandParent c=new Child();
		c.run();
		c.abs();
	}
}
//추상 클래스 : 객체로 조립할 수 없다.
//필드, 메서드, 생성자를 가질 수 있지만 자기가 직접 객체를 만들 수 없어 직접 사용은 불가능
//추상 클래스는 추상 메서드를 가질 수 있다.
//추상 메서드 : {}부분을 가지지 못하는 메서드
//abstract 리턴타입 이름(); 이렇게 제작한다.
//추상클래스가 추상메서드를 가진경우 
//추상클래스를 상속받은 일반클래스들은 반드시 추상메서드의 몸통을 구현(implement)하여야 한다.
abstract class GrandParent{
	int money;
	void run() {
		System.out.println("할아버지의 메서드");
	}
	abstract void abs(); //상속을 통해서 강제함.
}
abstract class Parent extends GrandParent{
	String house;
	void run() {
		System.out.println("아버지가 오버라이드한 메서드");
	}
	//추상메서드에서 abstract를 제거하고 {}를 달아주면 내용을 구현하게 된다.
	void abs() {
		System.out.println("할아버지의 추상메서드를 아버지가 구현함");
	}
}
class Child extends Parent{
	boolean computer;
	void abs() {
		System.out.println("할아버지의 추상메서드를 아버지가 구현한걸 오버라이드함"); 
		//할아버지의 돈을 갖고싶으면 이 메소드는 무조건 있어야함
	}
}
