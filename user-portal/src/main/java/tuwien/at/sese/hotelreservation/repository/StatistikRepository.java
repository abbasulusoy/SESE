package tuwien.at.sese.hotelreservation.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import tuwien.at.sese.hotelreservation.model.Statistik;

/**
 * The Interface StatistikRepository.
 */
public interface StatistikRepository extends Repository<Statistik, Long> {

    /**
     * Delete.
     *
     * @param statistik the statistik
     */
    void delete(Statistik statistik);

    /**
     * Find all.
     *
     * @return the list
     */
    List<Statistik> findAll();

    /**
     * Find one.
     *
     * @param id the id
     * @return the statistik
     */
    Statistik findById(Long id);

    /**
     * Save.
     *
     * @param statistik the statistik
     * @return the statistik
     */
    Statistik save(Statistik statistik);
}
