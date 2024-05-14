package cla;

public class Sample1 {
	public static void main(String[] args) {
		Car c=new Car();
		c.run(6);
	}
}
//Object Oriented : 객체지향
class Car{
	//클래스는 필드(Field), 메서드(Method), 생성자(Constructor)를 가질 수 있다.
	//필드 : 객체가 데이터를 저장하는 공간, 통상적으로 변수로 만들어지고, 속성을 저장한다. 
	//속성(attribute)사물의 성질, 특징. 실체의 본질적인 성질. 그것이 없다면 실체를 생각할 수 없는 것.
	int number;
	//메서드 : 객체가 수행할 수 있는 동작, 호출이 이루어질 때 수행됨
		//리턴타입 : 동작수행시 반환하는 값, void는 없고 나머지는 return뒤에 특정해줘야함
		//매개변수 : 동작을 시킬때 줘야되는 값을 담을 변수, 
	void run(int a) {
		System.out.println(number+"번 차량이 주행합니다.");
	}
	//생성자 : 객체를 조립하는 동작
		//객체가 조립될 때 반드시 단 한번 수행된다. *x5,000,000
		//리턴타입이 적혀있지 않고 이름이 클래스와 똑같은 메서드처럼 생겼다.
		//따로 작성하지 않아도 자동으로 보이지 않게 제작되어 있음
		//다른 동작을 수행하고자 한다면 한번 적어서 내용을 넣어줘야함.
	Car(){
		//필드의 내용을 변경하는 등 특정한 동작을 하기 위해서는 한번 적어줄 필요가 있다.
		number=1234;
	}
	//생성자 오버로드 *x5,000,000
	//메서드는 이름바꿔서 쓰면 되지만 생성자는 이름을 바꿀 수가 없다.
	Car(int a){
		number=a;
	}
}