package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowException ex = new ThrowException();
		try{
			ex.loadClass("b.txt", "java.lang.String");
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (Exception e) {//런타임 관련된 것은 가장 마지막에 사용해야함
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
