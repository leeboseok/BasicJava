package exam;

public class Sample2 {
	public static void main(String[] args) {
		Student s=new Student("이보석",100,80,90);
		System.out.println(s);
		
	}//main end
}//class end
class Student{
	
	String name;
	int mathGrade;
	int englishGrade;
	int koreanGrade;
	//객체를 만들때는 생성자 중 하나만 선택해서 조립하게 된다.
	Student(String str, int m, int e, int k){
		name=str;	
		mathGrade=m;	
		englishGrade=e;	
		koreanGrade=k;
	}//Student end
	//오버라이드 : 기존에 있던 기능을 재정의해서 사용하는 기법
	//클래스 내부에 toString()을 재정의하면 객체를 출력시 주소가 아니라 해당 내용을 출력한다.
	public String toString() {
		return "이름: "+name+"\t"+"수학: "+mathGrade+"\t"+"영어: "+englishGrade+"\t"+"국어: "+koreanGrade;
	}
}//class end