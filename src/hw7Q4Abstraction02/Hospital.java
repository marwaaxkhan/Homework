package hw7Q4Abstraction02;
/*b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. */

/*Create one default and one static method morgue and pharmacy inside interface "Hospital"*/

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public abstract void cafeteria();

	public void morgue();

	public static void pharmacy() {

	}
// 'public Hospital(){}' We Cannot Create Constructor InSide Interface Because
// Interface Cannot Be Instantiated ( Cannot Create Object )
	/*
	 * How many keywords are used for the inheritance in Java? 1 Key Words "Extends"
	 * how many keywords are used for the inheritance in Interface, answer by Java
	 * comments? // 1 Key Words "Extends" if you can use the keyword 'implements' in
	 * Interface, please use it. Use all the interfaces No We Cannot Use Implements
	 * Keyword In Interface -- University, Hospital, and College to answer questions
	 */

}