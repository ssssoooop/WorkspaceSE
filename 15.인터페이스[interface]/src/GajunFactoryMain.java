
public class GajunFactoryMain {

	public static void main(String[] args) {
		System.out.println("---가전제품공장---");
		GajunTV tv1=new GajunTV();
		GajunTV tv2=new GajunTV();
		GajunTV tv3=new GajunTV();
		
		GajunAudio audio1=new GajunAudio();
		GajunAudio audio2=new GajunAudio();
		
		GajunSmartPhone phone1=new GajunSmartPhone();
		GajunSmartPhone phone2=new GajunSmartPhone();
		
		GajunOnOff gajun1 = tv1;
		
		GajunOnOff[] gajunArray=new GajunOnOff[7]; 
		gajunArray[0]=gajun1;
		gajunArray[1]=tv1;
		gajunArray[2]=tv2;
		gajunArray[3]=audio1;
		gajunArray[4]=audio2;
		gajunArray[5]=phone1;
		gajunArray[6]=phone2;
		
		System.out.println("-----가젖제품검사소-----");
		/*
		 * 난 절대로 자식클래스타입을 사용안할래요
		 * 난 부모타입[GajunVolume,GajunOnOff]만 사용할래요
		 * 그래야 가전제품검사프로그램을 한번만들어서 변경없이
		 * 계속사용할수있으니까요--
		 */
		GajunOnOff[] revGajunArray = gajunArray;
		for(int i=0;i<revGajunArray.length;i++) {
			System.out.println("----------검사시----------");
			revGajunArray[i].on();
			GajunVolume tempGajun=(GajunVolume)revGajunArray[i];
			tempGajun.volumeUp();
			tempGajun.volumeDown();
			revGajunArray[i].off();
			System.out.println("--------검사끝출고-------");
		}
		
		/*
		 * GajunGumsa gajunGumsa=new GajunGumsa();
		 * gajunGumsa.setGAjuns(gajunArray);
		 * gajumGumsa.gumsa();\
		 * 
		 */
	}

}
