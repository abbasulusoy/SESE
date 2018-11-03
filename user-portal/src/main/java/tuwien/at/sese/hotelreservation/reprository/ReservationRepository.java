package tuwien.at.sese.hotelreservation.reprository;

import java.util.List;

import org.springframework.data.repository.Repository;

import tuwien.at.sese.hotelreservation.model.Reservation;

public interface ReservationRepository extends Repository<Reservation, Integer> {

    void delete(Reservation reservation);

    List<Reservation> findAll();

    Reservation findOne(int id);

    Reservation save(Reservation reservation);
}
