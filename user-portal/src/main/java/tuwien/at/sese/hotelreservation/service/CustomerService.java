package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Customer;

/**
 * @author Abbas ULUSOY
 * crud operation for customers
 *
 */
public interface CustomerService {

    /**
     * @param customer
     * @return created customer
     */
    Customer create(Customer customer);

    /**
     * @param id
     * @return deleted customer
     */
    Customer delete(Long id);

    /**
     * @return list of customer 
     */
    List<Customer> findAll();

    /**
     * @param id
     * @return found customer
     */
    Customer findById(Long id);

    /**
     * @param customer
     * @return update customer
     */
    Customer update(Customer customer);
}
