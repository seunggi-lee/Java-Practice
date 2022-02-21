package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest { //���� ���� ī���ϴ� ��

	public static void main(String[] args) {
		long miliseconds = 0;
		int len = 0;
		try(FileInputStream fis = new FileInputStream("a.exe");
				FileOutputStream fos = new FileOutputStream("b.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);// ���۸� �̿��ϸ� �ӵ��� �� ����
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
			
			miliseconds = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
				len++;
			}
			miliseconds = System.currentTimeMillis() - miliseconds;
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(len);
		System.out.println(miliseconds);
	}

}
