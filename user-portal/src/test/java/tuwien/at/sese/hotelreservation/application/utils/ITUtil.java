package tuwien.at.sese.hotelreservation.application.utils;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tuwien.at.sese.hotelreservation.model.Address;
import tuwien.at.sese.hotelreservation.model.Customer;
import tuwien.at.sese.hotelreservation.model.Reservation;
import tuwien.at.sese.hotelreservation.model.Room;

/**
 * The Class ITUTIL.
 */
public class ITUtil {

    /**
     * Creates the dummy customer.
     *
     * @return the customer
     */
    public static Customer createDummyCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("Abbas");
        customer.setLastName("Ulusoy");
        customer.setEmail("ab@c.com");
        customer.setFirmenname("Firme");
        customer.setCustomerNumber("0001");
        customer.setBillAddress(createDummyAddress());
        return customer;
    }

    /**
     * Creates the dummy address.
     *
     * @return the address
     */
    public static Address createDummyAddress() {
        Address address = new Address();
        address.setBezirk("1100");
        address.setHausnr("XXX Strasse");
        address.setHausnr("2");
        address.setPostleitzahl("1100");
        address.setTuerNr("34");
        return address;

    }

    /**
     * Creates the dummy reservation.
     *
     * @return the reservation
     */
    public static Reservation createDummyReservation() {
        Reservation reservation = new Reservation();
        Date date = new Date(System.currentTimeMillis());

        reservation.setBeginnDate(date);
        reservation.setEndDate(Date.valueOf(LocalDate.from(date.toInstant()).plusDays(7)));
        reservation.setCustomers(Arrays.asList(createDummyCustomer()));
        reservation.setRabatt("5");
        reservation.setRoom(createDummyRoom());

        return reservation;
    }

    /**
     * Creates the dummy room.
     *
     * @return the room
     */
    private static Room createDummyRoom() {
        Room room = new Room();
        room.setMaxOccupancy(4);
        room.setName("Room1");
        room.setNumber("100");
        room.setPriceEZ(100);
        return room;
    }

    /**
     * Creates the dummy rooms.
     *
     * @return the list
     */
    private static List<Room> createDummyRooms() {
        List<Room> rooms = new ArrayList<>();
        Room room = new Room();
        for (int i = 100; i < 150; i = i + 2) {
            room.setMaxOccupancy(4);
            room.setName("Room::" + i);
            room.setNumber("" + i);
            room.setPriceEZ(i);
            rooms.add(room);
        }
        return rooms;
    }

}
