package tuwien.at.sese.hotelreservation.application;

import java.sql.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import tuwien.at.sese.hotelreservation.application.utils.ITUtil;
import tuwien.at.sese.hotelreservation.model.Customer;
import tuwien.at.sese.hotelreservation.model.Reservation;
import tuwien.at.sese.hotelreservation.model.Room;
import tuwien.at.sese.hotelreservation.repository.CustomerRepository;
import tuwien.at.sese.hotelreservation.repository.ReservationRepository;
import tuwien.at.sese.hotelreservation.repository.RoomRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories(basePackages = "tuwien.at.sese.hotelreservation.reprository")
public class CustomerPortalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ReservationRepository reservationRepository;

	@Autowired
	private RoomRepository roomRepository;

	@Test
	public void contextLoads() {
	}

	@Rollback(false)
	@Test
	public void whenFindByName_thenReturnCustomer() {
		// given
		Customer alex = ITUtil.createDummyCustomer();
		Reservation reservation = new Reservation();
		reservation.setBeginnDate(new Date(1000));
		reservation.setEndDate(new Date(1200));
		reservation.getCustomers().add(alex);

		Room room = new Room();
		room.setName("alex");
		room.setNumber("100");
		room.setMaxOccupancy(2);
		room.setPriceEZ(100.00);

		// reservation.setRoom(room);
		alex.getReservations().add(reservation);

		customerRepository.save(alex);

		// when
		List<Customer> founds = customerRepository.findAll();

		// then
		Assert.assertTrue("not empty", !founds.isEmpty());
	}

	@Test
	public void createReservation() {
		Reservation reservation = ITUtil.createDummyReservation();
		// create
		reservationRepository.save(reservation);

		// when
		List<Reservation> founds = reservationRepository.findAll();
		// then
		Assert.assertTrue("not empty", !founds.isEmpty());

	}

	@Test
	public void createRoom() {
		Room room = ITUtil.createDummyRoom();
		// create
		roomRepository.save(room);

		// when
		List<Room> founds = roomRepository.findAll();
		// then
		Assert.assertTrue("not empty", !founds.isEmpty());

	}
	
	@Test
	public void createRooms() {
		List<Room> rooms = ITUtil.createDummyRooms();
		// create
		rooms.forEach(room -> roomRepository.save(room));

		// when
		List<Room> founds = roomRepository.findAll();
		// then
		Assert.assertTrue("not empty", !founds.isEmpty());

	}

}
