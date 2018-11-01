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

	public List<Customer> getCustomers() {
		return customers;
	}

	public Room getRoom() {
		return room;
	}

	public String getRabatt() {
		return rabatt;
	}

	

	public int getDuration() {
		return duration;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void setRabatt(String rabatt) {
		this.rabatt = rabatt;
	}

	
	public Date getBeginnDate() {
		return beginnDate;
	}

	public void setBeginnDate(Date beginnDate) {
		this.beginnDate = beginnDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}