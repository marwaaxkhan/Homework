package hw7Q3Encapsulation01;
/*paste the question between package and class by multiple line comment). Create a package name "hw7Q3Encapsulation01" in the HW project. Inside the package, a) Create a class, Employee. declare some private variable----> Name, age, sex, usCitizen. How can you access those variables by getter and setter method? Please execute those variables and print Employee info. Paste the GitHub link below.*/

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeName("Marwa");
		employee.setEmployeeage(27);
		employee.setEmployeesex('F');
		employee.setUsCitizen(true);

		System.out.println(" Name: " + employee.getEmployeeName() + " \n Age: " + employee.getEmployeeage()
				+ " \n Sex: " + employee.getEmployeesex() + " \n USCitizen: " + employee.isUsCitizen());

	}

}