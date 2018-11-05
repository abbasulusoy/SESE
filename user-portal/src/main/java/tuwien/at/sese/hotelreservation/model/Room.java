package tuwien.at.sese.hotelreservation.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * The Class Room.
 */
@Entity
public class Room extends EntityId {

	private String name;
	private String number;
	private int maxOccupancy;
	private int child;
	private double priceEZ;
	
	@OneToMany(targetEntity = Reservation.class, mappedBy = "room")
    private Collection<Reservation> reservations= new ArrayList<>();
	
	
    /**
     * Gets the name.
     *
     * @return the name
     */
	public String getName() {
		return name;
	}

    /**
     * Sets the name.
     *
     * @param name the new name
     */
	public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets the number.
     *
     * @return the number
     */
	public String getNumber() {
		return number;
	}

    /**
     * Sets the number.
     *
     * @param number the new number
     */
	public void setNumber(String number) {
		this.number = number;
	}

    /**
     * Gets the max occupancy.
     *
     * @return the max occupancy
     */
	public int getMaxOccupancy() {
		return maxOccupancy;
	}

    /**
     * Sets the max occupancy.
     *
     * @param maxOccupancy the new max occupancy
     */
	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}

    /**
     * Gets the child.
     *
     * @return the child
     */
	public int getChild() {
		return child;
	}

    /**
     * Sets the child.
     *
     * @param child the new child
     */
	public void setChild(int child) {
		this.child = child;
	}

    /**
     * Gets the price EZ.
     *
     * @return the price EZ
     */
	public double getPriceEZ() {
		return priceEZ;
	}

    /**
     * Sets the price EZ.
     *
     * @param priceEZ the new price EZ
     */
	public void setPriceEZ(double priceEZ) {
		this.priceEZ = priceEZ;
	}

    /**
     * Gets the price DZ.
     *
     * @return the price DZ
     */
	public double getPriceDZ() {
		return priceEZ * 2;
	}

    /**
     * Gets the price tree occupancy.
     *
     * @return the price tree occupancy
     */
	public double getPriceTreeOccupancy() {
		return (priceEZ * 3) - ((priceEZ * 100) / 20);
	}

    /**
     * Gets the price EZ mit one child.
     *
     * @return the price EZ mit one child
     */
	public double getPriceEZMitOneChild() {
		return priceEZ + ((priceEZ * 100) / 25);
	}

    /**
     * Gets the price EZ mit two child.
     *
     * @return the price EZ mit two child
     */
	public double getPriceEZMitTwoChild() {
		return priceEZ + child * ((priceEZ * 100) / 25);
	}

    /**
     * Gets the price DZ mit child.
     *
     * @return the price DZ mit child
     */
	public double getPriceDZMitChild() {
		return getPriceDZ() + child * ((getPriceDZ() * 100) / 25);
	}
	
}
