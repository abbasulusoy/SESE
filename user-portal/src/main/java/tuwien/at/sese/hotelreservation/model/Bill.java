package tuwien.at.sese.hotelreservation.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * The Class Bill.
 */
@Entity
public class Bill extends EntityId {

	@Column
    private String rabatt;
    @Column
	private String duration;
    @Column
    private Date billDate;

    /**
     *     private Room room;
     * TODO Address.
     *
     *
     */

    /**
     * @return the rabatt
     */
	public String getRabatt() {
		return rabatt;
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
     * Gets the duration.
     *
     * @return the duration
     */
	public String getDuration() {
		return duration;
	}

    /**
     * Sets the duration.
     *
     * @param duration the new duration
     */
	public void setDuration(String duration) {
		this.duration = duration;
	}

    /**
     * Gets the bill date.
     *
     * @return the bill date
     */
	public Date getBillDate() {
		return billDate;
	}

    /**
     * Sets the bill date.
     *
     * @param billDate the new bill date
     */
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
    
}
