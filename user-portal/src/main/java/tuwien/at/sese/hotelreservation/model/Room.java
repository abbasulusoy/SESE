package tuwien.at.sese.hotelreservation.model;


public class Room {

    private String name;
    private String number;
    /**
     * max belegung
     */
    private int maxOccupancy;
    private int child;

    private double priceEZ;
    private double priceDZ;
    private double priceTreeOccupancy;
    private double priceEZMitOneChild;
    private double priceEZMitTwoChild;
    private double priceDZMitChild;

}
