package tuwien.at.sese.hotelreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tuwien.at.sese.hotelreservation.model.Reservation;
import tuwien.at.sese.hotelreservation.service.ReservationService;

/**
 * The Class ReservationController.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/reservations"})
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    /**
     * Creates the.
     *
     * @param reservation the reservation
     * @return the reservation
     */
    @PostMapping
    public Reservation create(@RequestBody Reservation reservation){
        return reservationService.create(reservation);
    }

    /**
     * Find one.
     *
     * @param id the id
     * @return the reservation
     */
    @GetMapping(path = {"/{id}"})
    public Reservation findOne(@PathVariable("id") int id){
        return reservationService.findById(id);
    }

    /**
     * Update.
     *
     * @param id the id
     * @param reservation the reservation
     * @return the reservation
     */
    @PutMapping(path = {"/{id}"})
    public Reservation update(@PathVariable("id") int id, @RequestBody Reservation reservation){
        reservation.setId(id);
        return reservationService.update(reservation);
    }

    /**
     * Delete.
     *
     * @param id the id
     * @return the reservation
     */
    @DeleteMapping(path ={"/{id}"})
    public Reservation delete(@PathVariable("id") int id) {
        return reservationService.delete(id);
    }

    /**
     * Find all.
     *
     * @return the list
     */
    @GetMapping
    public List<Reservation> findAll(){
        return reservationService.findAll();
    }
}