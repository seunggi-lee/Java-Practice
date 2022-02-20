package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
//		try(FileInputStream fis = new FileInputStream("reader.txt")){
		try(InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))){ //InputStreamReader는 보조 스트림
			
			int i = 0;
			while((i = irs.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch (IOException e) {
			System.out.println(e);
		}
		Socket socket = new Socket();
		try {
			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
