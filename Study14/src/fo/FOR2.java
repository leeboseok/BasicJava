package fo;

public class FOR2 {
	public static void main(String[] args) {
		//중첩 for문
		int a=0;
		int b=0;
		for(a=0; a<2; a++) {
			System.out.println("a반복문이 시작");
			for(b=0; b<3; b++) {
				System.out.println("____b반복문이 시작");
				System.out.println("____반복중..."+a+",b="+b);
				System.out.println("____b반복문이 종료");
			}//for2
			System.out.println("a반복문이 종료");
		}//for1
		System.out.println("종효 후 a="+a+",b="+b);
	}//main
}//class
