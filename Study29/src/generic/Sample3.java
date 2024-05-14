package generic;

public class Sample3 {
	public static void main(String[] args) {
		//제네릭 : 클래스의 특정 문자를 원하는 타입으로 변환하는 기법
		//자료형을 마음대로 조절할 수 있어서 편리하다
		Normal n=new Normal("스트링");
		String result=n.show();
		System.out.println(result);
		//n.a=15;	객체를 사용하는 입장에서는 class의 수정 없이 타입을 변경할 수 없다.
		Gene<Float> g=new Gene<Float>(5+3.0f);// 참조형, 기본형 다됨.
		//<>꺽쇄 안에 첫글자 대문자로 들어감 참조형, 기본형(String, Integer, Boolean, Long, Double, Byte, Char, float)
		Float result2=g.show();
		System.out.println(result2);
	}
}
class Normal{
	String a;
	Normal(String b){
		a=b;
	}
	String show() {
		return a;
	}
}
class Gene<T>{
	T a;
	Gene(T b){
		a=b;
	}
	T show() {
		return a;
	}
}

