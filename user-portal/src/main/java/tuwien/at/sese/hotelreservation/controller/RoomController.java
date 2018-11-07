package tuwien.at.sese.hotelreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tuwien.at.sese.hotelreservation.model.Room;
import tuwien.at.sese.hotelreservation.service.RoomService;

/**
 * The Class RoomController.
 */
@CrossOrigin(origins = "http://localhost:4200",  maxAge = 3600)
@RestController
@RequestMapping({ "/rooms" })
public class RoomController {

    @Autowired
    private RoomService roomService;

    /**
     * Creates the.
     *
     * @param room the room
     * @return the room
     */
    @PostMapping
    public Room create(@RequestBody Room room) {
        return roomService.create(room);
    }

    /**
     * Find one.
     *
     * @param id the id
     * @return the room
     */
    @GetMapping(path = {"/{id}"})
    public Room findOne(@PathVariable("id") Long id) {
        return roomService.findById(id);
    }

    /**
     * Update.
     *
     * @param id the id
     * @param room the room
     * @return the room
     */
    @PutMapping(path = {"/{id}"})
    public Room update(@PathVariable("id") Long id, @RequestBody Room room) {
        room.setId(id);
        return roomService.update(room);
    }

    /**
     * Delete.
     *
     * @param id the id
     * @return the room
     */
    @DeleteMapping(path ={"/{id}"})
    public Room delete(@PathVariable("id") Long id) {
        return roomService.delete(id);
    }

    /**
     * Find all.
     *
     * @return the list
     */
    @GetMapping
    public List<Room> findAll() {
        return roomService.findAll();
    }
}