package tuwien.at.sese.hotelreservation.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import tuwien.at.sese.hotelreservation.utils.PasswordGenerator;

/**
 * The Class Person.
 */
@MappedSuperclass
public class Person extends EntityId {

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private Date birtdate;
    @Column
    private String notiz;
    @Column
    private String phone;
    @Column
    private String rabatt;
    @Column
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "person_type")
    private PersonType personType;

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the birtdate.
     *
     * @return the birtdate
     */
    public Date getBirtdate() {
        return birtdate;
    }

    /**
     * Gets the notiz.
     *
     * @return the notiz
     */
    public String getNotiz() {
        return notiz;
    }

    /**
     * Gets the phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
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
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the birtdate.
     *
     * @param birtdate the new birtdate
     */
    public void setBirtdate(Date birtdate) {
        this.birtdate = birtdate;
    }

    /**
     * @param notiz
     */
    public void setNotiz(String notiz) {
        this.notiz = notiz;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @param rabatt
     */
    public void setRabatt(String rabatt) {
        this.rabatt = rabatt;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        if (password == null) {
            PasswordGenerator gen = new PasswordGenerator();
            password = gen.generateRC();
        }
        this.password = password;

    }

    /**
     * Gets the person type.
     *
     * @return the person type
     */
    public PersonType getPersonType() {
        return personType;
    }

    /**
     * Sets the person type.
     *
     * @param personType the new person type
     */
    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

}
