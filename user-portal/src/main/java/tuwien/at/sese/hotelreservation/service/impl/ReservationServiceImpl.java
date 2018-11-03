package tuwien.at.sese.hotelreservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuwien.at.sese.hotelreservation.model.Reservation;
import tuwien.at.sese.hotelreservation.reprository.ReservationRepository;
import tuwien.at.sese.hotelreservation.reprository.ReservationRepository;
import tuwien.at.sese.hotelreservation.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository repository;

    @Override
    public Reservation create(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public Reservation delete(int id) {
        Reservation Reservation = findById(id);
        if(Reservation != null){
            repository.delete(Reservation);
        }
        return Reservation;
    }

    @Override
    public List<Reservation> findAll() {
        return repository.findAll();
    }

    @Override
    public Reservation findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return repository.save(reservation);
    }
}
