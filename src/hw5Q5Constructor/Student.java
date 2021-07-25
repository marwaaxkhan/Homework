package hw5Q5Constructor;

public class Student {

	public String StudentName;
	public int studentID;
	public char sex;
	public boolean programmer;
	public float grade;

	public Student() {
		System.out.println("This is from defult Constructor of Student class");
	}

	public Student(String studentName, int studentID, char sex, boolean programmmer, float grade) {

		this.StudentName = studentName;
		this.studentID = studentID;
		this.sex = sex;
		this.programmer = programmmer;
		this.grade = grade;
		System.out.println("Student Name Is:" + studentName + "\nStudent Id Is :" + studentID + "\nsex:" + sex
				+ "\nIs Student A Programmer:" + programmer + "\nStudent Grade Is:" + grade);

	}

	public void student() {
		System.out.println();
	}

	public void student(String studentName, int studentID, char sex, boolean programmer, float grade) {
		this.StudentName = studentName;
		this.studentID = studentID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;
		System.out.println("Student Name Is;" + studentName + "\nstudent Id Is:" + studentID + "\nsex:" + sex
				+ "\nIs Student A programmer:" + programmer + "\nstudent Student Grade Is:" + grade);

	}

}