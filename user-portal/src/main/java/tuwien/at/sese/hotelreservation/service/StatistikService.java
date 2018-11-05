package tuwien.at.sese.hotelreservation.service;

import java.util.List;

import tuwien.at.sese.hotelreservation.model.Statistik;

/**
 * The Interface StatistikService.
 */
public interface StatistikService {

    /**
     * Creates the.
     *
     * @param statistik the statistik
     * @return the statistik
     */
    Statistik create(Statistik statistik);

    /**
     * Delete.
     *
     * @param id the id
     * @return the statistik
     */
    Statistik delete(int id);

    /**
     * Find all.
     *
     * @return the list
     */
    List<Statistik> findAll();

    /**
     * Find by id.
     *
     * @param id the id
     * @return the statistik
     */
    Statistik findById(int id);

    /**
     * Update.
     *
     * @param statistik the statistik
     * @return the statistik
     */
    Statistik update(Statistik statistik);
}
