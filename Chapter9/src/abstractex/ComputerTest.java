package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer(); // �߻� Ŭ������ ��ü ���� �Ұ�
		Computer c2 = new DeskTop(); // ����
		//Computer c3 = new NoteBook(); // �߻� Ŭ����
		
		Computer c4 = new MyNoteBook(); // ���� 
		c2.display();
		c4.display();
	}

}
