
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		
		/*
		AcademyMember[] members=new AcademyMember[7];
		members[0] =new AcademyStudents(0,null,null); 
		*/
		
		AcademyMember[] members= {
				new AcademyStudent(0,"KIM","JAVA"),
				new AcademyStudent(0,"LIM","DESIGN"),
				new AcademyStudent(0,"MIM","ANDROID"),
				new AcademyStudent(0,"OIM","ANDROID"),
				new AcademyStudent(0,"PIM","JAVA"),
				new AcademyStudent(0,"QIM","ACCOUNTING"),
				new AcademyStudent(0,"RIM","MARKETING")
		};
		
		AcademyMember[] receiveMembers=members;
		
		System.out.println("----AcademyMember전체출력----");
		for(int i=0;i<receiveMembers.length;i++) {
			/*
			 * AcademyStudent,AcademyGangsa,AcademyStaff에서 재정의된 print메쏘드호출
			 */
			receiveMembers[i].print();
		}
		
		System.out.println("--------instanceof-----");
		/*
		 * 연산자--> instanceof
		 * 	- 형태 : 참조변수 instanceof 클래스이름
		 *  - 연산결과: true or false
		 *  - ex> boolean b = receiveMembers[0] instanceof AcademyStudent;
		 */
		AcademyMember am=new AcademyGangsa(90,"김학생","정보처리");
		if(am instanceof AcademyStudent) {
			AcademyStudent tempStudent = (AcademyStudent)am;
			String tempBan=tempStudent.getBan();
			System.out.println("학생반:"+tempBan);
		}

		System.out.println("------------------AcademyMember배열에있는 객체들중에서 AcademyStudents객체들만출력------");
		for(int i=0;i<receiveMembers.length;i++) {
			if(receiveMembers[i] instanceof AcademyStudent) {
				receiveMembers[i].print();
				AcademyGangsa tempStudent=(AcademyGangsa)receiveMembers[i];
//				System.out.println("학생반:"+tempStudent.getBan());
			}
		}
			
	}

}
