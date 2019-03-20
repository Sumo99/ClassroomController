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
	 * Create the reader class
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
	 * @return the myInt, and loop until the user enters a valid number.
	 */
	static public int getMyInt() {
         Scanner sc = new Scanner(System.in); // init the scanner
         System.out.println("Enter a number of student in your classroom ");
         while (!sc.hasNextInt()){
            System.out.println("Enter a valid number");
            sc.next();
         } 
         int myInt = sc.nextInt();
         return myInt;
         }

	/**
	 * @param myString the myString to set
	 */
	// public void setMyString(String myString) {
	//	this.myString = myString;
	//}

}
