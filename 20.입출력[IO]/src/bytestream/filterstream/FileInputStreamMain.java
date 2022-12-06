package bytestream.filterstream;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamMain {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream(new File("src/bytestream.fileOut.dat"));
		
		int readByte = fis.read();
		System.out.println("1.byte:"+Integer.toBinaryString(readByte));
		readByte=fis.read();
		System.out.println("2.byte:"+Integer.toBinaryString(readByte));
		readByte=fis.read();
		System.out.println("3.byte:"+Integer.toBinaryString(readByte));
		readByte=fis.read();
		System.out.println("4.byte:"+Integer.toBinaryString(readByte));
		fis.close();
		System.out.println("fileInputStream.read()<------fileOut.dat");
		while(true) {
			readByte=fis.read();
			if(readByte==-1) {
				break;
			}
			System.out.println(Integer.toBinaryString(readByte));
		}
		
	}

}
