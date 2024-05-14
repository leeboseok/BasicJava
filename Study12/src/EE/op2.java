package EE;

public class op2 {
	public static void main(String[] args) {
		//논리 연산자 :true, false를 가지고 true, false를 계산하는 연산자
		// 한개만 적으면 전혀 다른 연산자이니 주의 *x5,000,000
		// && : ~이고 ~이다, 앞과 뒤의 조건이 모두 true인 경우만 true
		// || : ~이거나 ~이다, 앞과 뒤의 조건 중 하나라도 true인 경우 true
		boolean result;
		result=true&&false;
		System.out.println(result);
		/*
		 true	&&	true	true	 // false가 하나라도 있으면 false
		 
		 true	&&	false	false
		 false  &&	true	false
		 false  &&	false	false
		 
		 true	||	true	true	 // true가 하나라도 있으면 true
		 true	||	false	true
		 false	||	true	true
		 
		 false	||	false	false
		 */
		
		String id="admin";
		String pw="1111";
		
		result=(id=="admin")&&(pw=="1111");
		System.out.println(result);
		
		int number=7;
		result=(number>3)&&(number<=6);
		System.out.println(result);
		
	}
}
