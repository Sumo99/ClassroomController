/**
 * 
 */
package classroomController;

/**
 * @author carlosfmeneses
 * ClassController.java 
 * created 3/10/2019 | updated 3/10/2019
 */

class Classroom {
	private int studentQuantity;
	private int lightQuantity;
	
	Classroom (int studentInitiate, int lightInitiate) {
		studentQuantity = studentInitiate;
		lightQuantity = lightInitiate;
	}

	/**
	 * @return the studentQuantity
	 */
	public int getStudentQuantity() {
		return studentQuantity;
	}

	/**
	 * @param studentQuantity the studentQuantity to set
	 */
	public void setStudentQuantity(int studentQuantity) {
		this.studentQuantity = studentQuantity;
	}

	/**
	 * @return the lightQuantity
	 */
	public int getLightQuantity() {
		return lightQuantity;
	}

	/**
	 * @param lightQuantity the lightQuantity to set
	 */
	public void setLightQuantity(int lightQuantity) {
		this.lightQuantity = lightQuantity;
	}

}
