package wrapper;

public class WrapperClass유용한메쏘드 {

	public static void main(String[] args) {
		System.out.println("int --> String");
		int y = 2147483627;
		String yStr1 = Integer.toString(y);
		System.out.println(yStr1);
		String yStr2 = y + "";
		System.out.println(yStr2);
		String yStr3=Integer.toBinaryString(y);
		System.out.println(yStr3);
		String yStr4=Integer.toHexString(y);
		System.out.println(yStr4);
		System.out.println("String--> int,double,boolean");
		int i1=Integer.parseInt("2147483647");
		System.out.println(i1);
		double d1=Double.parseDouble("3.14159");
		System.out.println(d1+1);
		boolean b1=Boolean.parseBoolean("true");
		System.out.println(b1);

		System.out.println("------------Character----------");
		Character wc1=new Character('김');
		Character wc2='김';
		/*char c1=wc1.charCount();
		char c2=wc2;
		if(wc1==wc2) {
			System.out.println("wc1==wc2 주소동일");
		}else {
			System.out.println("wc1!=wc2");
		}*/
		/*
		 * Wrapper 객체의 값비교는 equals메쏘드를 사용해야한다.
		 */
		if(wc1.equals(wc2)) {
			System.out.println("wc1객체의 char값과 wc2객체의 charr값이 동일하다");
		}
		
		String strs="Hello Java!!^%$#)_++12232343 김경호 제임스";
		
		for(int i=0;i<strs.length();i++) {
			char tempChar=strs.charAt(i);
			int type=Character.getType(tempChar);
			System.out.println(type);
			if(type==Character.UPPERCASE_LETTER) {
				System.out.println("UPPERCASE_LETTER:"+tempChar);
			}
			if(type==Character.LOWERCASE_LETTER) {
				System.out.println("LOWERCASE_LETTER:"+tempChar);
				
			}
			if(type==Character.DECIMAL_DIGIT_NUMBER) {
				System.out.println("DECIMAL_DIGIT_NUMBER:"+tempChar);
				
			}
			if(type==Character.SPACE_SEPARATOR) {
				System.out.println("SPACE_SEPARATOR:"+tempChar);
				
			}
		}
		
		
		
	}

}
