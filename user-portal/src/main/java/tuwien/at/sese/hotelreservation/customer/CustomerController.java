package tuwien.at.sese.hotelreservation.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
//@RequestMapping({"/api"})
@RequestMapping({"/customers"})
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return customerService.create(customer);
    }

    @GetMapping(path = {"/{id}"})
    public Customer findOne(@PathVariable("id") int id){
        return customerService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Customer update(@PathVariable("id") int id, @RequestBody Customer customer){
        customer.setId(id);
        return customerService.update(customer);
    }

    @DeleteMapping(path ={"/{id}"})
    public Customer delete(@PathVariable("id") int id) {
        return customerService.delete(id);
    }

    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }
}
