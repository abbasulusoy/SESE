package tuwien.at.sese.hotelreservation.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class Reservation.
 */
@Entity
@Table(name = "reservation")
public class Reservation extends EntityId {

	@ManyToMany(mappedBy = "reservations", targetEntity = Customer.class)
	private List<Customer> customers = new ArrayList<>();
	
	@ManyToOne(targetEntity = Room.class)
    @JoinColumn(name = "room")
	private Room room;
	
	@Column
	private String rabatt;
	
	@Column
	private Date beginnDate;
	
	@Column
	private Date endDate;
	
	@Column
	private int duration;

    /**
     * Gets the customers.
     *
     * @return the customers
     */
	public List<Customer> getCustomers() {
		return customers;
	}

    /**
     * Gets the room.
     *
     * @return the room
     */
	public Room getRoom() {
		return room;
	}

    /**
     * Gets the rabatt.
     *
     * @return the rabatt
     */
	public String getRabatt() {
		return rabatt;
	}

	

    /**
     * Gets the duration.
     *
     * @return the duration
     */
	public int getDuration() {
		return duration;
	}

    /**
     * Sets the customers.
     *
     * @param customers the new customers
     */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

    /**
     * Sets the room.
     *
     * @param room the new room
     */
	public void setRoom(Room room) {
		this.room = room;
	}

    /**
     * Sets the rabatt.
     *
     * @param rabatt the new rabatt
     */
	public void setRabatt(String rabatt) {
		this.rabatt = rabatt;
	}

	
    /**
     * Gets the beginn date.
     *
     * @return the beginn date
     */
	public Date getBeginnDate() {
		return beginnDate;
	}

    /**
     * Sets the beginn date.
     *
     * @param beginnDate the new beginn date
     */
	public void setBeginnDate(Date beginnDate) {
		this.beginnDate = beginnDate;
	}

    /**
     * Gets the end date.
     *
     * @return the end date
     */
	public Date getEndDate() {
		return endDate;
	}

    /**
     * Sets the end date.
     *
     * @param endDate the new end date
     */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    /**
     * Sets the duration.
     *
     * @param duration the new duration
     */
	public void setDuration(int duration) {
		this.duration = duration;
	}

}