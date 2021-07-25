package hw6Q4Abstraction01;
/*Create an interface "University". Declare some methods inside the interface named--> classSize, field, and teacher.*/

public interface University {
	public void classSize();

	public abstract void field();

	public void teacher();

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

}