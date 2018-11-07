package tuwien.at.sese.hotelreservation.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import tuwien.at.sese.hotelreservation.model.Bill;

public interface BillRepository extends Repository<Bill, Long> {

    void delete(Bill bill);

    List<Bill> findAll();

    Bill findById(Long id);

    Bill save(Bill bill);
}
