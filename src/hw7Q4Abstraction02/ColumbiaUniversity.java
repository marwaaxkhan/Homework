package hw7Q4Abstraction02;
/*iii) Create a regular Class ColumbiaUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. if any of them is not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?*/

public class ColumbiaUniversity {
	public ColumbiaUniversity() {// Constructor Created

	}

// public abstract void chemistry(){} We Cannot Create Abstract Method Inside A
// Regular Class
	public void biology() {
		System.out.println("This Is From Biology Method");

	}

	/*
	 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity. how many keywords are used for the inheritance in Java
	 * for a regular Class? // One Key Word "Extends" Can an regular Class inherit
	 * other Abstract Class or a regular class or interface? // Yes A Regular Class
	 * Can Inherit Another Regular Class As Well As An Abstract Class But Cannot
	 * Inherit An Interface How many inheritances is possible by a regular Class? //
	 * One Regular Class And One Abstract Class Use the all of above regular Classes
	 * and use the keywords to answer my questions. You don't need to execute
	 * anything as the main method is absent.
	 */

}