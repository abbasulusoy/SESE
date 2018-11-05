package tuwien.at.sese.hotelreservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuwien.at.sese.hotelreservation.model.Newsletter;
import tuwien.at.sese.hotelreservation.reprository.NewsletterRepository;
import tuwien.at.sese.hotelreservation.service.NewsletterService;

/**
 * @author Abbas ULUSOY 
 * Newsletter crud operation and list 
 */
@Service
public class NewsletterServiceImpl implements NewsletterService {

    @Autowired
    private NewsletterRepository repository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Newsletter create(Newsletter newsletter) {
        return repository.save(newsletter);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Newsletter delete(int id) {
        Newsletter newsletter = findById(id);
        if (newsletter != null) {
            repository.delete(newsletter);
        }
        return newsletter;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Newsletter> findAll() {
        return repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Newsletter findById(int id) {
        return repository.findOne(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Newsletter update(Newsletter newsletter) {
        return repository.save(newsletter);
    }
}
