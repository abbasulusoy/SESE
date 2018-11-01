package tuwien.at.sese.hotelreservation.reprository;

import java.util.List;

import org.springframework.data.repository.Repository;

import tuwien.at.sese.hotelreservation.model.Customer;


public interface CustomerRepository extends Repository<Customer, Integer> {

    void delete(Customer customer);

    List<Customer> findAll();

    Customer findOne(int id);

    Customer save(Customer customer);
}
