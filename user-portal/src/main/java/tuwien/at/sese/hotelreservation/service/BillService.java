package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Bill;

/**
 * crud operation for bills
 *
 */
public interface BillService {

    /**
     * @param bill
     * @return created bill
     */
    Bill create(Bill bill);

    /**
     * @param id
     * @return deleted bill
     */
    Bill delete(int id);

    /**
     * @return all bills
     */
    List<Bill> findAll();

    /**
     * @param id
     * @return found bill
     */
    Bill findById(int id);

    /**
     * @param bill
     * @return updated bill
     */
    Bill update(Bill bill);
}
