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
	static private String myString;
	static private int myInt;

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
		while (!myScanner.hasNextInt()) {
			System.out.print("Invalid quantity. Please enter a number: ");
			myString = myScanner.nextLine();
		}
		myInt = myScanner.nextInt();
		return myInt;
}

	/**
	 * @param myString the myString to set
	 */
	// public void setMyString(String myString) {
	//	this.myString = myString;
	//}

}
