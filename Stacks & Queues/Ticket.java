/**
 * This class describes the Ticket data structure.
 *
 * @author Adam Stebbing
 *
 */

public class Ticket {

	private int id;

	public Ticket(){
		this.id = AmusementPark.ticketNumber;
		AmusementPark.ticketNumber++;
	}

	/**
	 * Simple getter for ID of ticket.
	 *
	 * @return int id
	 */
	public int getId(){
		return this.id;
	}

	@Override
	public String toString(){
		return "" + this.id;
	}
}
