package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Reservation;

public interface ReservationService {

    Reservation create(Reservation reservation);

    Reservation delete(int id);

    List<Reservation> findAll();

    Reservation findById(int id);

    Reservation update(Reservation reservation);
}
