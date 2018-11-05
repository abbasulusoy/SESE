package tuwien.at.sese.hotelreservation.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * The Class Customer.
 */
@Entity
@Table(name = "customer")
public class Customer extends Person {


    @Column
    private String customerNumber;

    @Column
    private String firmenname;
    @Column
    private String webadresse;
    
    @Embedded
    private Address billAddress;
    
    @ManyToMany(
            targetEntity = Reservation.class,
            cascade = {CascadeType.ALL}
    )
    @JoinTable(
            name = "CUSTOMERS_RESERVATIONS",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "reservation_id")
    )
    private Collection<Reservation> reservations = new ArrayList<>();

    /**
     * Gets the customer number.
     *
     * @return the customer number
     */
	public String getCustomerNumber() {
		return customerNumber;
	}

    /**
     * Sets the customer number.
     *
     * @param customerNumber the new customer number
     */
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

    /**
     * Gets the firmenname.
     *
     * @return the firmenname
     */
	public String getFirmenname() {
		return firmenname;
	}

    /**
     * Sets the firmenname.
     *
     * @param firmenname the new firmenname
     */
	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}

    /**
     * Gets the webadresse.
     *
     * @return the webadresse
     */
	public String getWebadresse() {
		return webadresse;
	}

    /**
     * Sets the webadresse.
     *
     * @param webadresse the new webadresse
     */
	public void setWebadresse(String webadresse) {
		this.webadresse = webadresse;
	}

    /**
     * Gets the bill address.
     *
     * @return the bill address
     */
	public Address getBillAddress() {
		return billAddress;
	}

    /**
     * Sets the bill address.
     *
     * @param billAddress the new bill address
     */
	public void setBillAddress(Address billAddress) {
		this.billAddress = billAddress;
	}

    /**
     * Gets the reservations.
     *
     * @return the reservations
     */
	public Collection<Reservation> getReservations() {
		return reservations;
	}

    /**
     * Sets the reservations.
     *
     * @param reservations the new reservations
     */
	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}
}
