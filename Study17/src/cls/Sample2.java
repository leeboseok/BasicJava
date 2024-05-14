package cls;

public class Sample2 {
	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product();
		System.out.println(p1.sale);
		System.out.println(p2.sale);
		
		//클래스는 설계도다
		//클래스는 필드, 메서드, 생성자를 가질 수 있다.
		//필드는 클래스 내부에 작성되어 조립된 객체가 가지는 속성을 저장할 수 있는 공간
		
	}
}

class Product{
	String name;	//상품명 			//문자 : null
	int price;		//가격 			//숫자 : 0
	boolean sale;	//판매개시여부 	//논리 : false
	int qty;		//재고량
	String text;	//상품설명
	String[] img;	//상품사진
}
class Shop{
	Product[] products;
}
