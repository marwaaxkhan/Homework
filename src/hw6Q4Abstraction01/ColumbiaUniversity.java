package hw6Q4Abstraction01;
/*iii) Create a regular Class ColumbiaUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. if any of them is not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?*/

public class ColumbiaUniversity {
	public ColumbiaUniversity() {// Constructor Created

	}

// public abstract void chemistry(){} We Cannot Create Abstract Method Inside A
// Regular Class
	public void biology() {
		System.out.println("This Is From Biology Method");

	}

}