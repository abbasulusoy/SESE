package tuwien.at.sese.hotelreservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuwien.at.sese.hotelreservation.model.Statistik;
import tuwien.at.sese.hotelreservation.repository.StatistikRepository;
import tuwien.at.sese.hotelreservation.service.StatistikService;

/**
 * @author Abbas ULUSOY 
 *
 */
@Service
public class StatistikServiceImpl implements StatistikService {

    @Autowired
    private StatistikRepository repository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Statistik create(Statistik statistik) {
        return repository.save(statistik);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Statistik delete(Long id) {
        Statistik statistik = findById(id);
        if (statistik != null) {
            repository.delete(statistik);
        }
        return statistik;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Statistik> findAll() {
        return repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Statistik findById(Long id) {
        return repository.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Statistik update(Statistik statistik) {
        return repository.save(statistik);
    }
}
