package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer(); // 추상 클래스는 객체 생성 불가
		Computer c2 = new DeskTop(); // 가능
		//Computer c3 = new NoteBook(); // 추상 클래스
		
		Computer c4 = new MyNoteBook(); // 가능 
		c2.display();
		c4.display();
	}

}
