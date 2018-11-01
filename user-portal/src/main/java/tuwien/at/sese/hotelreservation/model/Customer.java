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

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getFirmenname() {
		return firmenname;
	}

	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}

	public String getWebadresse() {
		return webadresse;
	}

	public void setWebadresse(String webadresse) {
		this.webadresse = webadresse;
	}

	public Address getBillAddress() {
		return billAddress;
	}

	public void setBillAddress(Address billAddress) {
		this.billAddress = billAddress;
	}

	public Collection<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}
}
