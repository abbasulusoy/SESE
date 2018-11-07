package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Room;

/**
 * The interface RoomService.
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
    Room delete(Long id);

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
    Room findById(Long id);

    /**
     * Update.
     *
     * @param room the room
     * @return the room
     */
    Room update(Room room);
}
