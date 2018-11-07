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

import tuwien.at.sese.hotelreservation.model.Customer;
import tuwien.at.sese.hotelreservation.service.CustomerService;

/**
 * Customers
 *
 */
@CrossOrigin(origins = "http://localhost:4200",  maxAge = 3600)
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * @param customer
     * @return Customer
     */
    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return customerService.create(customer);
    }

    /**
     * Find one.
     *
     * @param id the id
     * @return the customer
     */
    
    @GetMapping(path = {"/{id}"})
    public Customer findOne(@PathVariable("id") Long id){
        return customerService.findById(id);
    }

    /**
     * Update.
     *
     * @param id the id
     * @param customer the customer
     * @return the customer
     */
    @PutMapping(path = {"/{id}"})
    public Customer update(@PathVariable("id") Long id, @RequestBody Customer customer){
        customer.setId(id);
        return customerService.update(customer);
    }

    /**
     * Delete.
     *
     * @param id the id
     * @return the customer
     */
    @DeleteMapping(path ={"/{id}"})
    public Customer delete(@PathVariable("id") Long id) {
        return customerService.delete(id);
    }

    /**
     * Find all.
     *
     * @return the list
     */
    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }
}
