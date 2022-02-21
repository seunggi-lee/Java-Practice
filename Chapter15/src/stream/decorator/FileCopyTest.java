package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest { //실행 파일 카피하는 것

	public static void main(String[] args) {
		long miliseconds = 0;
		int len = 0;
		try(FileInputStream fis = new FileInputStream("a.exe");
				FileOutputStream fos = new FileOutputStream("b.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);// 버퍼를 이용하면 속도가 더 빠름
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
