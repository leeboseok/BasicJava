package test;

public class Test1 {
	public static void main(String[] args) {
		
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}//for
		String star="*";
		for(int i=0; i<5; i++) {
			System.out.println(star);
			star+="*";
		}//for2
		for(int i=2; i<10; i++) {
			System.out.println("<< "+i+"단 >>");
			for(int a=1; a<10; a++) {
				System.out.println(i+"*"+a+"="+(i*a));
			}//in the for3 
			System.out.println();
		}//for3
		for(int i=2; i<10; i++) {
			System.out.print("["+i+"단]"+"\t");
		
			}
		System.out.println();
		for(int k=2; k<10; k++) {
			System.out.print(k+"*"+"1"+"="+(k*1)+"\t");
		}
		System.out.println();
		for(int j=2; j<10; j++) {
			System.out.print(j+"*"+"2"+"="+(j*2)+"\t");
		}
		System.out.println();
		for(int j=2; j<10; j++) {
			System.out.print(j+"*"+"3"+"="+(j*3)+"\t");
		}
		System.out.println();
		for(int j=2; j<10; j++) {
			System.out.print(j+"*"+"4"+"="+(j*4)+"\t");
		}
		System.out.println();
		for(int j=2; j<10; j++) {
			System.out.print(j+"*"+"5"+"="+(j*5)+"\t");
		}
		System.out.println();
		for(int j=2; j<10; j++) {
			System.out.print(j+"*"+"6"+"="+(j*6)+"\t");
		}
		System.out.println();
		for(int j=2; j<10; j++) {
			System.out.print(j+"*"+"7"+"="+(j*7)+"\t");
		}
		System.out.println();
		for(int j=2; j<10; j++) {
			System.out.print(j+"*"+"8"+"="+(j*8)+"\t");
		}
		System.out.println();
		for(int j=2; j<10; j++) {
			System.out.print(j+"*"+"9"+"="+(j*9)+"\t");
		}
	}//main
}//class
