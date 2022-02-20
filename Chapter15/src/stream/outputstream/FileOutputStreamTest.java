package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		} 
		
		try(FileOutputStream fos = new FileOutputStream("output3.txt", false)){// 뒤 값을 true로 하면 어펜드를 하고 명시하지 않으면 false값
//			fos.write(65);
//			fos.write(66);
//			fos.write(67);
//			fos.write(bs);
			fos.write(bs, 2, 10);
			
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
