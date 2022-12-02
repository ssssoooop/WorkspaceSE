package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMembers=new BookMember(0,"KANG","010-2222-3333");
		/*
		 * 책객체들생성
		 */
		Book[] books= {
				new Book(1111,"책1","시","좋은책1"),
				new Book(2222,"책2","소설","좋은책2"),
				new Book(3333,"책3","IT","좋은책3")
						};
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		
		
	}
}
