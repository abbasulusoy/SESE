package tuwien.at.sese.hotelreservation.reprository;

import java.util.List;

import org.springframework.data.repository.Repository;

import tuwien.at.sese.hotelreservation.model.Newsletter;

/**
 * The Interface NewsletterRepository.
 */
public interface NewsletterRepository extends Repository<Newsletter, Integer> {

    /**
     * Delete.
     *
     * @param newsletter the newsletter
     */
    void delete(Newsletter newsletter);

    /**
     * Find all.
     *
     * @return the list
     */
    List<Newsletter> findAll();

    /**
     * Find one.
     *
     * @param id the id
     * @return the newsletter
     */
    Newsletter findOne(int id);

    /**
     * Save.
     *
     * @param newsletter the newsletter
     * @return the newsletter
     */
    Newsletter save(Newsletter newsletter);
}
