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
    private Room room;
   
     * TODO Address 
     */
	public String getRabatt() {
		return rabatt;
	}
	public void setRabatt(String rabatt) {
		this.rabatt = rabatt;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
    
}
