package generic;

import java.util.ArrayList;

public class ArrayListStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("---------String----------");
		ArrayList<String> nameList=new ArrayList<String>();
		System.out.println("---------1.add--------");
		nameList.add("KIM");
		nameList.add("KIM");
		nameList.add("KIM");
		nameList.add("KIM");
		nameList.add("KIM");
		nameList.add("KIM");
		nameList.add("KIM");
		nameList.add(new String("KIM"));
		System.out.println(nameList);
		System.out.println("--------2.get--------");
		System.out.println(nameList.get(1));
		System.out.println(nameList.get(3));
		System.out.println(nameList.get(5));
		System.out.println("--------3.remove(index)---------");
		nameList.remove(1);
		System.out.println(nameList);
		System.out.println("-------3.remove(element)--------");
		nameList.remove(new String("LIM"));
		System.out.println(nameList);
		/*
		 << boolean java.util.ArrayList.remove(Object o) >>
		 * Removes the first occurrence of the specified element from this
		 */
		nameList.remove("KIM");
		System.out.println(nameList);
		System.out.println("-------------Wrapper-------------");
		ArrayList<Integer> scoreList=new ArrayList<Integer>();
		scoreList.add(90);
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(78);
		scoreList.add(86);
		scoreList.add(12);
		scoreList.add(new Integer(90));
		scoreList.add(new Integer(100));
		System.out.println(scoreList);
		System.out.println("-------------1.get--------------");
		int score1=scoreList.get(2);
		System.out.println(score1);
		int score2=scoreList.get(scoreList.size()-1);
		System.out.println("-------------2.set--------------");
		scoreList.set(2,99);
		System.out.println(scoreList);
		System.out.println("-------------3.remove-----------");
		/*
		 * << Integer java.util.ArrayList.remove(int index) >>
		 */
		scoreList.remove(5);
		/*
		 * << Integer java.util.ArrayList.remove(Object element) >>
		 Removes the first occurrence of the specified element from this
		 */
		scoreList.remove(new Integer(90));
		System.out.println(scoreList);
		
		if("KIM".equals("KIM")) {
			System.out.println("\"KIM\"객체의 문자열과 \"KIM\" 객체의 문자열이동일하다");
		}
		
		/*
		 * - (앞쪽문자열유니코드숫자 - 뒤쪽문자열유니코드숫자) 의 결과를 반환한다.
		 */
		int uniCodeGap = "aaa".compareTo("aaa");
		System.out.println(uniCodeGap);
		uniCodeGap = "aaa".compareTo("aab");
		System.out.println(uniCodeGap);
		uniCodeGap = "aaa".compareTo("aaa");
		System.out.println(uniCodeGap);
		String irum1="aaa";
		String irum2="aab";
		if(irum2.compareTo(irum2) > 0) {
			System.out.println("irum1,irum2 교환(오름차순)");
		}
		
		
		
		
	}

}
