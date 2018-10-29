package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Customer;

public interface CustomerService {

    Customer create(Customer customer);

    Customer delete(int id);

    List<Customer> findAll();

    Customer findById(int id);

    Customer update(Customer customer);
}
