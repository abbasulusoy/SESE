package tuwien.at.sese.hotelreservation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * @author Abbas ULUSOY
 *
 */
@Entity
public class Newsletter extends EntityId {

    @Column
    private String salutation;

    @Column
    private String name;

    /**
    private Address address;
**/
    @Column
    private String subject;

    @Column
    private String text;

    public String getSalutation() {
        return salutation;
    }

    public String getName() {
        return name;
    }
/**
    public Address getAddress() {
        return address;
    }
    **/

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
    public void setAddress(Address address) {
        this.address = address;
    }
    **/

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setText(String text) {
        this.text = text;
    }

}
