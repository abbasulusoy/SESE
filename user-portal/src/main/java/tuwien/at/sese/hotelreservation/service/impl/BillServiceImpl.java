package tuwien.at.sese.hotelreservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuwien.at.sese.hotelreservation.model.Bill;
import tuwien.at.sese.hotelreservation.repository.BillRepository;
import tuwien.at.sese.hotelreservation.service.BillService;

/**
 * @author Abbas ULUSOY 
 *
 */
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository repository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Bill create(Bill Bill) {
        return repository.save(Bill);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bill delete(Long id) {
        Bill Bill = findById(id);
        if (Bill != null) {
            repository.delete(Bill);
        }
        return Bill;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Bill> findAll() {
        return repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bill findById(Long id) {
        return repository.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bill update(Bill bill) {
        return repository.save(bill);
    }
}
