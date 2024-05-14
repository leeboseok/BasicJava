package collection;

import java.util.*;		//자바 컬렉션도 util안에 들어 있다.

public class Sample1 {
	public static void main(String[] args) {
		//컬렉션
		//자료구조를 이용할 수 있도록 구현된 일종의 프레임워크 -> 사용방법이 딱 정해져 있다.
		//자버 컬렉션은 interface로 구성되어 있어 바로 객체로 조립하여 사용할 수는 없다.
		
		//자바 컬렉션의 종류
		//List : 순서가 엄격히 존재하는 자료형, index가 검색 기준이자 순서
		//		Vector, Stack, LinkedList, *ArrayList 등이 있음
		//Set : 순서가 존재하지 않는 자료형, 자료의 구별이 불가능하기 때문에 중복데이터를 허락하지 않는다.
		//		*HashSet, SortedSet, TreeSet 등이 있음
		//Map : 검색어와 데이터가 한 쌍으로 이루어진 자료형, 데이터는 중복이 가능하지만 검색어는 중복이 불가
		//		*HashMap, SortedMap, TreeMap 등이 있음.
		
		//HashSet 데이터를 짧은 순으로 정렬해 놓는다.
		//읽어 내는 속도를 빠르게 하지만
		//순서가 엉키어 버리고
		//뒤에 오는 데이터는 시간이 조금 손해가 있다.
		
		List L=new ArrayList(); //컬렉션은 interface라서 컬렉션이 구현된 클래스를 이용해서 객체를 만들어야 한다.
		//List.add(자료) : 해당 자료를 리스트에 추가함. 가장 마지막 번호에 추가됨
		//List.add(index, 자료) : 해당 index에 자료를 추가함. 뒤 자료부터는 하나씩 index가 밀림
		//List.get(index) : index에 해당하는 자료를 확인
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(3); // 중복이 허용된다.
		L.add("A"); // 문자도 들어간다 //기본타입은 다 들어간다. //매개변수 타입이 오브젝트 타입이라 모든 타입이 들어간다
					//다만 나올때 자신의 정보를 잃는다. //그래서 역캐스팅을 해줘야 한다.
		L.add(2, "B");//ArrayList는 중간에 데이터를 넣는 기능이 있다.
		
		System.out.println(L);
		System.out.println(L.size()); 
		//Array 에는 .length, List 에는 .size()가 쓰인다.
		//List는 배열과 달리 size()메서드로 크기를 확인해야 한다. .length를 사용할 수 없다. *X5,000,000
		System.out.println(L.get(4));
	}
}
