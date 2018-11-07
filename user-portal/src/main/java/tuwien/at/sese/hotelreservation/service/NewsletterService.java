package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Newsletter;

/**
 * The interface NewsletterService.
 */
public interface NewsletterService {

    /**
     * Creates the.
     *
     * @param newsletter the newsletter
     * @return the newsletter
     */
    Newsletter create(Newsletter newsletter);

    /**
     * Delete.
     *
     * @param id the id
     * @return the newsletter
     */
    Newsletter delete(Long id);

    /**
     * Find all.
     *
     * @return the list
     */
    List<Newsletter> findAll();

    /**
     * Find by id.
     *
     * @param id the id
     * @return the newsletter
     */
    Newsletter findById(Long id);

    /**
     * Update.
     *
     * @param newsletter the newsletter
     * @return the newsletter
     */
    Newsletter update(Newsletter newsletter);
}
