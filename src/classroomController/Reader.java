/**
 * 
 */
package classroomController;

import java.util.Scanner;

/**
 * @author carlosfmeneses
 * ClassController.java 
 * created 3/11/2019 | updated 3/11/2019
 */

class Reader {
	static private Scanner myScanner = new Scanner(System.in);
	static private String myString = "test";

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
	 * @param myString the myString to set
	 */
	// public void setMyString(String myString) {
	//	this.myString = myString;
	//}

}
