package tuwien.at.sese.hotelreservation.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * Represents an address corresponding to the DB-entities like Adresse
 * 
 * @author Abbas ULUSOY
 *
 */
@Embeddable
public class Address {

    /** The bedeutung is not final because it has a setter. */

    private String postlandschl;
    private String postleitzahl;
    private String bezirk;
    private String strasse;
    private String hausnr;
    private String tuerNr;

    public String getPostlandschl() {
        return postlandschl;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public String getBezirk() {
        return bezirk;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setPostlandschl(String postlandschl) {
        this.postlandschl = postlandschl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public void setBezirk(String bezirk) {
        this.bezirk = bezirk;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }
    
    

    public String getTuerNr() {
		return tuerNr;
	}

	public void setTuerNr(String tuerNr) {
		this.tuerNr = tuerNr;
	}

	/**
     * {@inheritDoc}
     *
     * All parameters which contain "real address information" are concatenated to a string.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(postlandschl).append(",");
        sb.append(postleitzahl).append(",");
        sb.append(strasse).append(",");
        sb.append(hausnr).append(",");
        sb.append(tuerNr).append(",");
        return sb.toString();
    }
}
