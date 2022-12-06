package bytestream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriteReaderMain {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("fileWriter.txt");
		
		fw.write(44356);
		fw.write('A');
		fw.write('김');
		
		for(int i=0; i<65536; i++) {
			fw.write(i);
			if(i%100==0) {
				fw.write('\n');
			}
			fw.write('\n');
		}
	
	
	fw.write('\n');
	fw.write("문자열을 맘대로 막써요!!!!!!!");
	fw.write('\n');
	/*
	 * 버퍼에 있는 문자열을 출력스트림에 쓴다
	 */
	fw.flush();
	fw.close();
	System.out.println("FileWrite.write()---->fileWriter.txt");
	
	FileReader fr=new FileReader("fileWriter.txt");
	/*
	 public int read() throws IOException
	 */
	int readChar=fr.read();
	System.out.println("1.readChar:"+(char)readChar);
	readChar=fr.read();
	System.out.println("2.readChar:"+(char)readChar);
	readChar=fr.read();
	System.out.println("3.readChar:"+(char)readChar);
	int charCount=0;
	int lineCount=0;
	while(true) {
		readChar=fr.read();
		if(readChar==-1)break;
		charCount++;
		if(readChar=='\n') {
		lineCount++;
		}
		if(readChar=='인')
		System.out.println((char)readChar);
	}
	fr.close();
	System.out.println();
	System.out.println(charCount+"문자 읽음");
	System.out.println(charCount+"리턴 읽음");
	}
}
