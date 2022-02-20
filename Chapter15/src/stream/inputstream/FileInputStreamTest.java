package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
//		FileInputStream fis = null;
		FileReader fis = null; // 파일리더로 읽으면 문자단위로 읽기 때문에 한글도 반환 가능
		int i =0;
		try {
		fis = new FileReader("input.txt");
		
//		System.out.println((char)fis.read());// 한줄 씩
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
		
		while((i = fis.read()) != -1) { // 반복문을 통ㄹ해서 읽기
			System.out.println((char)i);
		}
		
		
		}catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
			fis.close();
			}catch (IOException e) {
				// TODO: handle exception
				System.out.println(e);
			}catch (NullPointerException e) {
				 System.out.println(e);
			}catch (Exception e) {
				 System.out.println(e);
			}
		}
		System.out.println("end");
		
	}

}
