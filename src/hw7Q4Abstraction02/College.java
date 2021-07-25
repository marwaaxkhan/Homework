package hw7Q4Abstraction02;
/*c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub.*/

/*Create also one default and one static method dorm and studyRoom inside interface "College"*/

public interface College {
	public abstract void commonRoom();

	public void laboratory();

	public void languageClub();

	public void dorm();

	public static void studyRoom() {

	}
// 'public College(){}' We Cannot Create Constructor InSide Interface Because
// Interface Cannot Be Instantiated ( Cannot Create Object )

	/*
	 * How many keywords are used for the inheritance in Java? 1 Key Words "Extends"
	 * how many keywords are used for the inheritance in Interface, answer by Java
	 * comments? // 1 Key Words "Extends" if you can use the keyword 'implements' in
	 * Interface, please use it. Use all the interfaces No We Cannot Use Implements
	 * Keyword In Interface -- University, Hospital, and College to answer questions
	 */

}