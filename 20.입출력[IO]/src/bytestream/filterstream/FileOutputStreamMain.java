package bytestream.filterstream;

import java.io.FileOutputStream;
/*
 * 
 */
public class FileOutputStreamMain {

	public static void main(String[] args)throws Exception {
		
		
		FileOutputStream fos=new FileOutputStream("fileOut.dat");
		/*
		public abstract void write(int b)throws IOException
		 * 
		 */
		/*
		 *65 -->000000000000000000000000001000001
		 *66 -->000000000000000000000000001000010
		 *67 -->000000000000000000000000001000011
		 */
		fos.write(65);
		fos.write(66);
		fos.write(0b000000000000000000000000001000011);
		fos.write(0b011111111111111111111111111111111);
		
		for(int i=0;i<256;i++);
		
		fos.write(0-255);
		
		fos.close();
		System.out.println("FileOutputStream.write()-->fileOut.dat");
	}

}
