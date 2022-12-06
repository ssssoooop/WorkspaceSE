package characterstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WebServerDataReadMain {

	public static void main(String[] args) throws Exception{
		/****************html(text)***************/
		URL urlStr=new URL("https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE53eid?ver=6394");
		InputStream in=urlStr.openStream();
		FileOutputStream fout=new FileOutputStream("image.gif");
		while(true) {
			int readByte=in.read();
			if(readByte==-1)break;
			System.out.println((char)readByte);
		}
	}

}
