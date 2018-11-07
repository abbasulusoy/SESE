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

import tuwien.at.sese.hotelreservation.model.Statistik;
import tuwien.at.sese.hotelreservation.service.StatistikService;

@CrossOrigin(origins = "http://localhost:4200",  maxAge = 3600)
@RestController
@RequestMapping({ "/statistiks" })
public class StatistikController {

    @Autowired
    private StatistikService statistikService;

    /**
     * Creates the.
     *
     * @param statistik the statistik
     * @return the statistik
     */
    @PostMapping
    public Statistik create(@RequestBody Statistik statistik) {
        return statistikService.create(statistik);
    }

    /**
     * Find one.
     *
     * @param id the id
     * @return the statistik
     */
    @GetMapping(path = {"/{id}"})
    public Statistik findOne(@PathVariable("id") Long id) {
        return statistikService.findById(id);
    }

    /**
     * Update.
     *
     * @param id the id
     * @param statistik the statistik
     * @return the statistik
     */
    @PutMapping(path = {"/{id}"})
    public Statistik update(@PathVariable("id") Long id, @RequestBody Statistik statistik) {
        statistik.setId(id);
        return statistikService.update(statistik);
    }

    /**
     * Delete.
     *
     * @param id the id
     * @return the statistik
     */
    @DeleteMapping(path ={"/{id}"})
    public Statistik delete(@PathVariable("id") Long id) {
        return statistikService.delete(id);
    }

    /**
     * Find all.
     *
     * @return the list
     */
    @GetMapping
    public List<Statistik> findAll() {
        return statistikService.findAll();
    }
}