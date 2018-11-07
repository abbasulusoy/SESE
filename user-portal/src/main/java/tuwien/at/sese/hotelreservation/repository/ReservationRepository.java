package tuwien.at.sese.hotelreservation.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import tuwien.at.sese.hotelreservation.model.Reservation;

/**
 * The Interface ReservationRepository.
 */
public interface ReservationRepository extends Repository<Reservation, Long> {

    /**
     * Delete.
     *
     * @param reservation the reservation
     */
    void delete(Reservation reservation);

    /**
     * Find all.
     *
     * @return the list
     */
    List<Reservation> findAll();

    /**
     * Find one.
     *
     * @param id the id
     * @return the reservation
     */
    Reservation findById(Long id);

    /**
     * Save.
     *
     * @param reservation the reservation
     * @return the reservation
     */
    Reservation save(Reservation reservation);
}
