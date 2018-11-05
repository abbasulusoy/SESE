package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Newsletter;

/**
 * The Interface NewsletterService.
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
    Newsletter delete(int id);

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
    Newsletter findById(int id);

    /**
     * Update.
     *
     * @param newsletter the newsletter
     * @return the newsletter
     */
    Newsletter update(Newsletter newsletter);
}
