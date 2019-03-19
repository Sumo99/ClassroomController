/**
 * 
 */
package classroomController;

import java.util.Scanner;

/**
 * @author carlosfmeneses
 * ClassController.java 
 * created 3/11/2019 | updated 3/19/2019
 */

class Reader {
	static private Scanner myScanner = new Scanner(System.in);
	static private String myString = "test";
	static private int myInt = 0;

	/**
	 * @param args
	 */
	Reader() {
	}

	/**
	 * @return the myString
	 */
	static public String getMyString() {
		myString = myScanner.nextLine();
		return myString;
	}

	/**
	 * @return the myInt
	 */
	static public int getMyInt() {
		try (Scanner myScanner = new Scanner(System.in)) {
			if (myScanner.hasNextInt()) {
				myInt = myScanner.nextInt();
			} else {
				System.out.println("Invalid entry. Please enter a number: ");
			}
		}
		return myInt;
}

	/**
	 * @param myString the myString to set
	 */
	// public void setMyString(String myString) {
	//	this.myString = myString;
	//}

}
