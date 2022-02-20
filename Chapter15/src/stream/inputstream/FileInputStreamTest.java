package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
//		FileInputStream fis = null;
		FileReader fis = null; // ���ϸ����� ������ ���ڴ����� �б� ������ �ѱ۵� ��ȯ ����
		int i =0;
		try {
		fis = new FileReader("input.txt");
		
//		System.out.println((char)fis.read());// ���� ��
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
		
		while((i = fis.read()) != -1) { // �ݺ����� �뤩�ؼ� �б�
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
