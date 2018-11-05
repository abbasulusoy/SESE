package tuwien.at.sese.hotelreservation.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import tuwien.at.sese.hotelreservation.model.Bill;


public interface BillRepository extends Repository<Bill, Integer> {

    void delete(Bill bill);

    List<Bill> findAll();

    Bill findOne(int id);

    Bill save(Bill bill);
}
