package hw6Q4Abstraction01;

/*e) Create another Abstract Class EngineeringSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. Print something inside the non abstract or implemented method .*/

public abstract class EngineeringSchool {

	public EngineeringSchool() {// Constructor Created

	}

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is From ComputerLab Method");

		/*
		 * Can you create a Constructor inside Abstract Class? Yes If yes, create
		 * default Constructor on each Abstract Class. If no, comment out the created
		 * constructor and answer why not? Now, answer how many keywords are used for
		 * the inheritance of Abstract Class? One Key Word "Extends" Can an Abstract
		 * Class inherit other Abstract Class or a regular class or interface? Abstract
		 * Class Can Inherit One Abstract Class And One Regular Class But Cannot Inherit
		 * An Interface How many inheritances is possible by an Abstract Class? One
		 * Abstract Class And One Regular Class Use the all of above Abstract Classes
		 * (3) to answer my questions
		 */

	}

}