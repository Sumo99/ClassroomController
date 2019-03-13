/**
 * 
 */
package classroomController;

/**
 * @author carlosfmeneses
 * ClassController.java 
 * created 3/10/2019 | updated 3/12/2019
 */

class Classroom {
	private int studentsMax;
	private int studentQuantity;

	private int lightsMax;
	private int lightsQuantity;

	Classroom(int studentsMaxInitiate, int studentInitiate, int lightsMaxInitiate, int lightInitiate) {
		studentsMax = studentsMaxInitiate;
		studentQuantity = studentInitiate;
		lightsMax = lightsMaxInitiate;
		lightsQuantity = lightInitiate;
	}

	/**
	 * @return the studentQuantity
	 */
	public int getStudentsQuantity() {
		return studentQuantity;
	}

	/**
	 * @param studentQuantity the studentQuantity to set
	 */
	public void setStudentsQuantity(int studentQuantity) {
		if (studentQuantity < 0) {
			this.studentQuantity = 0;
		} else if (studentQuantity > studentsMax) {
			this.studentQuantity = studentsMax;
		} else {
			this.studentQuantity = studentQuantity;
		}
	}

	/**
	 * @return the lightQuantity
	 */
	public int getLightsQuantity() {
		return lightsQuantity;
	}

	/**
	 * @param lightQuantity the lightQuantity to set
	 */
	public void setLightsQuantity(int lightsQuantity) {
		if (lightsQuantity < 0) {
			this.lightsQuantity = 0;
		} else if (lightsQuantity > lightsMax) {
			this.lightsQuantity = lightsMax;
		} else {
			this.lightsQuantity = lightsQuantity;
		}
	}

}
