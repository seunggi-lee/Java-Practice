package classpart;

public class Student {
		
		int studentID;
		String studentName;
		int grade;
		String address;
		
//		public Student() {	} // �������� ������ �ڵ����� �����.(�Ű������� ���� ������ �ڵ� ����)

//		public Student(int id, String name) {
//			studentID = id;
//			studentName = name;
//		}
		public void showStudentInfor() {
			System.out.println(studentName + ", " + address);
		}
//		public static void main(String[] args) {
//			Student studentLee = new Student();
//			studentLee.studentName = "�̼���";
//			studentLee.address = "����� ���ʱ� ���ʵ�";
//			
//			studentLee.showStudentInfor();
//		}
		
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String name) {
			studentName = name;
		}
		public static void main(String[] args) {
			Student studentLee = new Student();
			studentLee.studentName= "�̼���";
			studentLee.studentID = 100;
			studentLee.address = "����� �������� ���ǵ���";
			
			Student studentkim = new Student();
			studentkim.studentName= "������";
			studentkim.studentID = 101;
			studentkim.address = "�̱� ��ȣ��";
			
			studentLee.showStudentInfor();
			studentkim.showStudentInfor();
		}
}
