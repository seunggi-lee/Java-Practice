package classpart;

public class Student {
		
		int studentID;
		String studentName;
		int grade;
		String address;
		
//		public Student() {	} // 생성하지 않으면 자동으로 생긴다.(매개변수가 없는 생성자 자동 생성)

//		public Student(int id, String name) {
//			studentID = id;
//			studentName = name;
//		}
		public void showStudentInfor() {
			System.out.println(studentName + ", " + address);
		}
//		public static void main(String[] args) {
//			Student studentLee = new Student();
//			studentLee.studentName = "이순신";
//			studentLee.address = "서울시 서초구 서초동";
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
			studentLee.studentName= "이순신";
			studentLee.studentID = 100;
			studentLee.address = "서울시 영등포구 여의도동";
			
			Student studentkim = new Student();
			studentkim.studentName= "김유신";
			studentkim.studentID = 101;
			studentkim.address = "미국 산호세";
			
			studentLee.showStudentInfor();
			studentkim.showStudentInfor();
		}
}
