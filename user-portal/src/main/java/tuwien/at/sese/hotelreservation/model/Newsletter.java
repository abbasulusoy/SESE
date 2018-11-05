package tuwien.at.sese.hotelreservation.model;

import javax.persistence.Column;
import javax.persistence.Entity;

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

    /**
     * Gets the salutation.
     *
     * @return the salutation
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     *     public Address getAddress() {
     *         return address;
     *     }.
     *
     * @return the subject
     */

    public String getSubject() {
        return subject;
    }

    /**
     * Gets the text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the salutation.
     *
     * @param salutation the new salutation
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
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
     *     public void setAddress(Address address) {
     *         this.address = address;
     *     }
     *
     * @param subject the new subject
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Sets the text.
     *
     * @param text the new text
     */
    public void setText(String text) {
        this.text = text;
    }

}
