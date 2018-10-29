package tuwien.at.sese.hotelreservation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
    @Column
    private Address billAddress;


}
