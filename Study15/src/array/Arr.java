package array;

public class Arr {
	public static void main(String[] args) {
		//배열 : array, 여러개의 값을 저장할 수 있는 규격
		//타입[] 이름=new 타입[칸수];
		//배열은 몇칸으로 만들지 먼저 지정해 주어야 한다.
		//*X5,000,000 배열의 번호(index)는 0번부터 시작하기 때문에 칸수-1까지만 있다.
		//배열 칸수는 배열이름.length를 통해 확인할 수 있다.
		int[] a; //숫자가 여러개 들어갈 수 있는 상자 하나 만들어줘 
		a=new int[3]; //숫자가 3까지 들어갈 수 있는.
		a[0]=12;
		a[1]=25;
		a[2]=30;
		int[] b= {100,80,60,10,50,25}; //값이 특정된 상태로 배열을 바로 초기화하는 방법
		System.out.println("a배열칸수는 "+a.length);
		System.out.println("b배열칸수는 "+b.length);
		
		//*x5,000,000 배열 내부의 데이터를 전부 출력하는 반복문
		for(int i=0; i<a.length; i++) { //이런 경우 i는 a.length보다 작다고 해야한다. // i는 a.length보다 작거나 같다고 하면 안됨.
			System.out.println(a[i]);
		}
		
		for(int j=0; j<b.length; j++) {
			System.out.println("b["+j+"]="+b[j]);
		}
		System.out.println(a);
	}
}
