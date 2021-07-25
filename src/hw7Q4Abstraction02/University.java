package hw7Q4Abstraction02;
/*Create an interface "University". Declare some methods inside the interface named--> classSize, field, and teacher.*/

/*i) Create one default and one static method gymnasium and library inside interface "University"*/

public interface University {
	public void classSize();

	public abstract void field();

	public void teacher();

	public void gymnasium();

	public static void library() {

	}

	/*
	 * i) Can you create a Constructor inside the interface? If yes, create default
	 * Constructor on each interface. If no, comment out the 'created constructor'
	 * and answer why not?
	 * " We Cannot Create Constructor InSide Interface Because Interface Cannot Be Instantiated ( Cannot Create Object ) "
	 * 
	 * Now, answer how many keywords are used for the inheritance for Interface?
	 * " One KeyWord ( Extends ) "
	 * 
	 * 
	 * Can an interface inherit other Interface, or a regular class or abstract
	 * class? How many inheritance is possible? " Yes Interface can Inherit Multiple
	 * Interfaces But An Interface Cannot Inherit A Regular Class or An Abstract
	 * Class For that Matter Zero Regular Class Or Abstract Class Can Be Inherited "
	 * 
	 * Use the Interface -- "University" to answer my questions.
	 */
	/*
	 * How many keywords are used for the inheritance in Java? 1 Key Words "Extends"
	 * how many keywords are used for the inheritance in Interface, answer by Java
	 * comments? // 1 Key Words "Extends" if you can use the keyword 'implements' in
	 * Interface, please use it. Use all the interfaces No We Cannot Use Implements
	 * Keyword In Interface -- University, Hospital, and College to answer questions
	 */

}