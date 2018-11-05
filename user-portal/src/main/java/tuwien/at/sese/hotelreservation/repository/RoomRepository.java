package tuwien.at.sese.hotelreservation.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import tuwien.at.sese.hotelreservation.model.Room;

/**
 * The Interface RoomRepository.
 */
public interface RoomRepository extends Repository<Room, Integer> {

    /**
     * Delete.
     *
     * @param room the room
     */
    void delete(Room room);

    /**
     * Find all.
     *
     * @return the list
     */
    List<Room> findAll();

    /**
     * Find one.
     *
     * @param id the id
     * @return the room
     */
    Room findOne(int id);

    /**
     * Save.
     *
     * @param room the room
     * @return the room
     */
    Room save(Room room);
}
