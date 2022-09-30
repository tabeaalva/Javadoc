/**
 * Represents a ship with its data
 * @author tabea
 * @version 1.0
 *
 */
public class Ship {

	private int nr;
	private String name;
	private int time;

	/**
	 * creates a ship object
	 * @param nr number
	 * @param name name
	 */
	public Ship(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}

	
	/**
	 * get the number of the ship
	 * @return the nr
	 */
	public int getNr() {
		return nr;
	}


	/**
	 * set the number of the ship
	 * @param nr the nr to set
	 */
	public void setNr(int nr) {
		this.nr = nr;
	}



	/**
	 * get the name of the ship
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * set a name of the ship
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * calculates the race time for this ship
	 * @see #time
	 */
	public void race() {
		int min = 300;
		int max = 600;
		this.time = (int) (Math.random() * (max - min + 1)) + min;
	}
	
	/**
	 * get the race time of the ship
	 * @return time in seconds
	 */
	public int getTime() {
		return time;
	}
	
}