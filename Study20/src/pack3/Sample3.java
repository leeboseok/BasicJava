package pack3;

public class Sample3 {
	public static void main(String[] args) {
		
		Product p;
		p = new Product();
		p.setName("컴퓨터");
		p.setPrice(-1000000);
		System.out.println(p.getName());
	}
}
class Product{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private int price;
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("잘못된 물건값을 입력하셨습니다. 0으로 초기화 합니다.");
		}else {
			this.price=price;
		}
		this.price=price;
	}
}