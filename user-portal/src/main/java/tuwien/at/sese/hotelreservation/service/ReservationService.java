package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Reservation;

/**
 * The interface ReservationService.
 */
public interface ReservationService {

    /**
     * Creates the.
     *
     * @param reservation the reservation
     * @return the reservation
     */
    Reservation create(Reservation reservation);

    /**
     * Delete.
     *
     * @param id the id
     * @return the reservation
     */
    Reservation delete(Long id);

    /**
     * Find all.
     *
     * @return the list
     */
    List<Reservation> findAll();

    /**
     * Find by id.
     *
     * @param id the id
     * @return the reservation
     */
    Reservation findById(Long id);

    /**
     * Update.
     *
     * @param reservation the reservation
     * @return the reservation
     */
    Reservation update(Reservation reservation);
}
