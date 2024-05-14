package exam;

public class Sample3 {
	public static void main(String[] args) {
		Child child=new Child(656);
	}//main end
}//class end

class Parent{
	int number;
	Parent(){
		System.out.println("부모의 일반생성자");
	}//Parent end
	Parent(int para){
		//setNumber(para);
		number=para;
		System.out.println("number를 초기화하는 부모의 생성자");
	}
	void setNumber(int para_number) {
		this.number=para_number;
	}//void setNumber end
}//class end

class Child extends Parent{
	Child(){
		System.out.println("자식의 일반생성자");
	}
	Child(int para){
		super(para);
		System.out.println("자식의 부모생성자 특정 생성처리");
	}
}//class Child end
