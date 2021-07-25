package hw7Q3Encapsulation01;
/*paste the question between package and class by multiple line comment). Create a package name "hw7Q3Encapsulation01" in the HW project. Inside the package, a) Create a class, Employee. declare some private variable----> Name, age, sex, usCitizen. How can you access those variables by getter and setter method? Please execute those variables and print Employee info. Paste the GitHub link below.*/

public class Employee {
	private String EmployeeName;
	private int employeeage;
	private char employeesex;
	private boolean usCitizen;

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.EmployeeName = employeeName;
	}

	public int getEmployeeage() {
		return employeeage;
	}

	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}

	public char getEmployeesex() {
		return employeesex;
	}

	public void setEmployeesex(char employeesex) {
		this.employeesex = employeesex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}