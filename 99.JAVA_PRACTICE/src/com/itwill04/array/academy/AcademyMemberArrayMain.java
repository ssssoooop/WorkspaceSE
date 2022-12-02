package com.itwill04.array.academy;

public class AcademyMemberArrayMain {

		public static void main(String[] args) {
			AcademyMember[] members={
					new AcademyStudent(1, "KIM", "자바"),
					new AcademyStudent(2, "LEE", "리눅스"),
					new AcademyStudent(3, "KIM", "자바"),
					new AcademyStudent(4, "LEE", "IOT"),
					new AcademyGangsa(5, "CHOI", "파이썬"),
					new AcademyGangsa(6, "KIM", "자바"),
					new AcademyGangsa(7, "DIM", "자바"),
					
					new AcademyStaff(8, "AIM", "영업"),
					new AcademyStaff(9, "QIM", "생산")
			};
			
			AcademyMember[] receiveMembers=members;
		System.out.println("1.AcademyMember 전체출력");
		for(int i=0; i<receiveMembers.length;i++) {
			receiveMembers[i].print();
		}
		
		
		System.out.println("2.번호 1   번 AcademyMember 한명 출력");
		
		for(int i=0; i<receiveMembers.length;i++) {
			if(receiveMembers[i].getNo()==1) {
				receiveMembers[i].print();
			}
		}
			
						
		System.out.println("2.번호 2   번 AcademyMember 한명 출력");
		for(int i=0; i<receiveMembers.length;i++) {
			if(receiveMembers[i].getNo()==2) {
				receiveMembers[i].print();
			}
		}
		
		System.out.println("2.이름 KIM 인 AcademyMember 들   출력");
		for(int i=0; i<receiveMembers.length;i++) {
			if(receiveMembers[i].getName()=="KIM") {
				receiveMembers[i].print();
			}
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		for(int i=0;i<receiveMembers.length;i++) {
			if(receiveMembers[i] instanceof AcademyStudent) {
				receiveMembers[i].print();
				AcademyMember tempStudents=(AcademyMember)receiveMembers[i];
			}
		}
		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for(int i=0;i<receiveMembers.length;i++) {
			if(receiveMembers[i] instanceof AcademyGangsa) {
				receiveMembers[i].print();
				AcademyMember tempGangsas=(AcademyMember)receiveMembers[i];
			}
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for(int i=0;i<receiveMembers.length;i++) {
			if(receiveMembers[i] instanceof AcademyStaff) {
				receiveMembers[i].print();
				AcademyMember tempStaffs=(AcademyMember)receiveMembers[i];
			}
		}
		System.out.println("4.AcademyMember 중에서 자바 반  인 AcademyStudent 들 출력");
		for(int i=0;i<receiveMembers.length;i++) {
			if(receiveMembers[i] instanceof AcademyStudent) {
					if(receiveMembers[i].getBan().equals("자바")){
						receiveMembers[i].print();
					}
					
				}
			}
		
		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		for(int i=0;i<receiveMembers.length;i++) {
			if(receiveMembers[i] instanceof AcademyGangsa) {
					if(receiveMembers[i].getSubject().equals("자바")){
						receiveMembers[i].print();
					}
					
				}
			}
		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");
		for(int i=0;i<receiveMembers.length;i++) {
			if(receiveMembers[i] instanceof AcademyStaff) {
					if(receiveMembers[i].getDepart().equals("영업")){
						receiveMembers[i].print();
					}
				}
			}
		}
		
}
