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
	private Scanner myScanner = new Scanner(System.in);
	private String myString;

	/**
	 * @param args
	 */
	Reader() {
		setMyString(myScanner.nextLine());
	}

	/**
	 * @return the myString
	 */
	public String getMyString() {
		return myString;
	}

	/**
	 * @param myString the myString to set
	 */
	public void setMyString(String myString) {
		this.myString = myString;
	}

}
