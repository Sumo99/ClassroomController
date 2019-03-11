/**
 * 
 */
package classroomController;

/**
 * @author carlosfmeneses
 * ClassController.java 
 * created 3/8/2019 | updated 3/10/2019
 */

class ClassController {

	/**
	 * @param args
	 */
	Classroom currentClassroom = new Classroom(0, 0);

	public static void main(String[] args) {
		EasyReader kboard = new EasyReader();
		System.out.println("kboard instantiated " + kboard);
		
		System.out.print("Enter input file name: ");
		
		int n = kboard.readInt();
		System.out.println("fileName instantiated " + n);

		System.out.println("Hello World!");

	}

}
