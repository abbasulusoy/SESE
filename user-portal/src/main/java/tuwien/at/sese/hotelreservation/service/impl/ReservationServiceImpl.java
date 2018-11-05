package tuwien.at.sese.hotelreservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuwien.at.sese.hotelreservation.model.Reservation;
import tuwien.at.sese.hotelreservation.reprository.ReservationRepository;
import tuwien.at.sese.hotelreservation.service.ReservationService;

/**
 * @author Abbas ULUSOY
 *
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository repository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation create(Reservation reservation) {
        return repository.save(reservation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation delete(int id) {
        Reservation reservation = findById(id);
        if(reservation != null){
            repository.delete(reservation);
        }
        return reservation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Reservation> findAll() {
        return repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation findById(int id) {
        return repository.findOne(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation update(Reservation reservation) {
        return repository.save(reservation);
    }
}
