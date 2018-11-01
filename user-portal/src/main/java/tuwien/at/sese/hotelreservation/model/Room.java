package tuwien.at.sese.hotelreservation.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Room extends EntityId {

	private String name;
	private String number;
	private int maxOccupancy;
	private int child;
	private double priceEZ;
	
	@OneToMany(targetEntity = Reservation.class, mappedBy = "room")
    private Collection<Reservation> reservations= new ArrayList<>();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMaxOccupancy() {
		return maxOccupancy;
	}

	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}

	public int getChild() {
		return child;
	}

	public void setChild(int child) {
		this.child = child;
	}

	public double getPriceEZ() {
		return priceEZ;
	}

	public void setPriceEZ(double priceEZ) {
		this.priceEZ = priceEZ;
	}

	public double getPriceDZ() {
		return priceEZ * 2;
	}

	public double getPriceTreeOccupancy() {
		return (priceEZ * 3) - ((priceEZ * 100) / 20);
	}

	public double getPriceEZMitOneChild() {
		return priceEZ + ((priceEZ * 100) / 25);
	}

	public double getPriceEZMitTwoChild() {
		return priceEZ + child * ((priceEZ * 100) / 25);
	}

	public double getPriceDZMitChild() {
		return getPriceDZ() + child * ((getPriceDZ() * 100) / 25);
	}
	
}
