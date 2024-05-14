package cla;

public class Sample3 {
	public static void main(String[] args) {
		Client c;
		c=new Client();
		c.id="test";
		c.pw="1111";
		c.name="홍길동";
		String msg="이것도 영화라고 만들었냐";
		int score=1;
		int number=4567;	//영화 고유 일련번호
		String data=c.datgul(score, msg, number);
		System.out.println("데이터베이스에 "+data+"를 입력했습니다.");
	}//main
}//class
class Client{
	String id;
	String pw;
	String name;
	String datgul(String dat, int star, int number) {
		System.out.println("다음 영화에 댓글이 달렸습니다."+number);
		System.out.println("글쓴이: "+id+", 댓글내용: "+dat+", 평점"+star);
		return dat+", "+star;
	}//void
	//매개변수의 순서 또는 수를 다르게 새서 다른 메서드처럼 쓰는 방법 : 메서드 오버로드
	String datgul(int star, String dat, int number) {
		System.out.println("다음 음식점에 댓글이 달렸습니다."+number);
		System.out.println("글쓴이: "+id+", 댓글내용: "+dat+", 평점"+star);
		return dat+", "+star;
	}
}//class Client
