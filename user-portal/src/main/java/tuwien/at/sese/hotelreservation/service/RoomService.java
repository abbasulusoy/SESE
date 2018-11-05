package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Room;

/**
 * The Interface RoomService.
 */
public interface RoomService {

    /**
     * Creates the.
     *
     * @param Room the room
     * @return the room
     */
    Room create(Room Room);

    /**
     * Delete.
     *
     * @param id the id
     * @return the room
     * 
     */
    Room delete(int id);

    /**
     * Find all.
     *
     * @return the list
     */
    List<Room> findAll();

    /**
     * Find by id.
     *
     * @param id the id
     * @return the room
     */
    Room findById(int id);

    /**
     * Update.
     *
     * @param room the room
     * @return the room
     */
    Room update(Room room);
}
