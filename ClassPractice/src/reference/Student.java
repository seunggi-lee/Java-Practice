package reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
	}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {
		korea.setScore(score);
		korea.setSubjectName(name);
	}
	
	public void setMath(String name, int score) {
		math.setScore(score);
		math.setSubjectName(name);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}
