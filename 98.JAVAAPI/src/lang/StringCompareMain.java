package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		/*
		 * String객체의생성
		 * 	1. 생성자호출(명시적생성)
		 * 	2. ""로생성  (암시적생성)
		 */
		String name1=new String("KIM");
		String name2=new String("KIM");
		String name3="KIM";
		String name4="KIM";
		
		
		
		System.out.println("----------------String객체내용비교는 equals메쏘드를 사용하여야합니다----------------");
		/*
		 << public boolean equals(String otherString) >>
		 */
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열이동일하다");
		}
		if(name1.equals(name3)) {
			System.out.println("name1객체의 문자열과 name3객체의 문자열이동일하다");
		}
		if(name3.equals(name4)) {
			System.out.println("name3객체의 문자열과 name4객체의 문자열이동일하다");
		}
		if(name1.equals("KIM")) {
			System.out.println("name1객체의 문자열과 \"KIM\"객체의 문자열이동일하다");
		}
		if("KIM".equals("KIM")) {
			System.out.println("\"KIM\"객체의 문자열과 \"KIM\"객체의 문자열이동일하다");
		}
	}

}
