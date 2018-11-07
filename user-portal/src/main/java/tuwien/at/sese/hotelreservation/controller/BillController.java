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

import tuwien.at.sese.hotelreservation.model.Bill;
import tuwien.at.sese.hotelreservation.service.BillService;

/**
 * Bill crud operations
 *
 */
@CrossOrigin(origins = "http://localhost:4200",  maxAge = 3600)
@RestController
@RequestMapping({ "/bills" })
public class BillController {

    @Autowired
    private BillService billService;

    /**
     * @param bill
     * @return created Bill
     */
    @PostMapping
    public Bill create(@RequestBody Bill bill) {
        return billService.create(bill);
    }

    /**
     * @param id
     * @return found Bill
     */
    @GetMapping(path = {"/{id}"})
    public Bill findOne(@PathVariable("id") Long id) {
        return billService.findById(id);
    }

    /**
     * @param id
     * @param bill
     * @return updated Bill
     */
    @PutMapping(path = {"/{id}"})
    public Bill update(@PathVariable("id") Long id, @RequestBody Bill bill) {
        bill.setId(id);
        return billService.update(bill);
    }

    /**
     * @param id
     * @return deleted Bill
     */
    @DeleteMapping(path ={"/{id}"})
    public Bill delete(@PathVariable("id") Long id) {
        return billService.delete(id);
    }

    /**
     * @return all Bills
     */
    @GetMapping
    public List<Bill> findAll() {
        return billService.findAll();
    }
}