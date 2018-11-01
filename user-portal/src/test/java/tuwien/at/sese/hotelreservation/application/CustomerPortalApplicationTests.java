package tuwien.at.sese.hotelreservation.application;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import junit.framework.Assert;
import tuwien.at.sese.hotelreservation.model.Address;
import tuwien.at.sese.hotelreservation.model.Customer;
import tuwien.at.sese.hotelreservation.model.Reservation;
import tuwien.at.sese.hotelreservation.model.Room;
import tuwien.at.sese.hotelreservation.reprository.CustomerRepository;
import tuwien.at.sese.hotelreservation.service.CustomerService;
import tuwien.at.sese.hotelreservation.service.impl.CustomerServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories(basePackages="tuwien.at.sese.hotelreservation.reprository")
public class CustomerPortalApplicationTests {

	

	@Autowired
	private CustomerRepository customerRepository;


	@Test
	public void contextLoads() {
	}

	@Rollback(false) 
	@Test
	public void whenFindByName_thenReturnCustomer() {
		// given
		Customer alex = new Customer();
		alex.setEmail("abbasulusoy@hotmail.com");
		alex.setFirstName("Abbas ULUSoY");
		alex.setLastName("lastName");
		Address billAddress = new Address();
		billAddress.setStrasse("Adagasse");
		billAddress.setHausnr("2b/35");
		billAddress.setTuerNr("35");
		alex.setBillAddress(billAddress);
		Reservation reservation = new Reservation();
		reservation.setBeginnDate(new Date(1000));
		reservation.setEndDate(new Date(1200));
		reservation.getCustomers().add(alex);
		
		Room room = new Room();
		room.setName("alex");
		room.setNumber("100");
		room.setChild(1);
		room.setMaxOccupancy(2);
		room.setPriceEZ(100.00);
		
		//reservation.setRoom(room);
		alex.getReservations().add(reservation);

		customerRepository.save(alex);

		// when
		List<Customer> founds = customerRepository.findAll();

		// then

		Assert.assertTrue("not empty", !founds.isEmpty());
	}

}
