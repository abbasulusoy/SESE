package tuwien.at.sese.hotelreservation.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

    private List<Customer> customers = new ArrayList<>();
    private Room room;
    private String rabatt;
    private Date beginn;
    private Date end;
    private int duration;

    public List<Customer> getCustomers() {
        return customers;
    }

    public Room getRoom() {
        return room;
    }

    public String getRabatt() {
        return rabatt;
    }

    public Date getBeginn() {
        return beginn;
    }

    public Date getEnd() {
        return end;
    }

    public int getDuration() {
        return duration;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setRabatt(String rabatt) {
        this.rabatt = rabatt;
    }

    public void setBeginn(Date beginn) {
        this.beginn = beginn;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}