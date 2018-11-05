package tuwien.at.sese.hotelreservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuwien.at.sese.hotelreservation.model.Room;
import tuwien.at.sese.hotelreservation.reprository.RoomRepository;
import tuwien.at.sese.hotelreservation.service.RoomService;

/**
 * @author Abbas ULUSOY
 *
 */
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository repository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Room create(Room room) {
        return repository.save(room);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Room delete(int id) {
        Room room = findById(id);
        if (room != null) {
            repository.delete(room);
        }
        return room;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Room> findAll() {
        return repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Room findById(int id) {
        return repository.findOne(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Room update(Room room) {
        return repository.save(room);
    }
}
