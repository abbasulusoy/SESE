package tuwien.at.sese.hotelreservation.model;

import javax.persistence.Embeddable;

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

    /**
     * @return postlandschl
     */
    public String getPostlandschl() {
        return postlandschl;
    }

    /**
     * @return postleitzahl
     */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * @return bezirk
     */
    public String getBezirk() {
        return bezirk;
    }

    /**
     * @return strasse
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * @return hausnr
     */
    public String getHausnr() {
        return hausnr;
    }

    /**
     * @param postlandschl
     */
    public void setPostlandschl(String postlandschl) {
        this.postlandschl = postlandschl;
    }

    /**
     * @param postleitzahl
     */
    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    /**
     * @param bezirk
     */
    public void setBezirk(String bezirk) {
        this.bezirk = bezirk;
    }

    /**
     * @param strasse
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * @param hausnr
     */
    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }
    
    

    /**
     * @return tuerNr
     */
    public String getTuerNr() {
		return tuerNr;
	}

    /**
     * @param tuerNr
     */
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
