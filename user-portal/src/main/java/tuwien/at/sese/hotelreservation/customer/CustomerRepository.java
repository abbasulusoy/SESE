package tuwien.at.sese.hotelreservation.customer;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface CustomerRepository extends Repository<Customer, Integer> {

    void delete(Customer customer);

    List<Customer> findAll();

    Customer findOne(int id);

    Customer save(Customer customer);
}
