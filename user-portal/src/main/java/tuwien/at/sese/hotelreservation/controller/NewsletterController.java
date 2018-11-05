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

import tuwien.at.sese.hotelreservation.model.Newsletter;
import tuwien.at.sese.hotelreservation.service.NewsletterService;

/**
 * The Class NewsletterController.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/Newsletters" })
public class NewsletterController {

    @Autowired
    private NewsletterService NewsletterService;

    /**
     * Creates the.
     *
     * @param Newsletter the newsletter
     * @return the newsletter
     */
    @PostMapping
    public Newsletter create(@RequestBody Newsletter Newsletter) {
        return NewsletterService.create(Newsletter);
    }

    /**
     * Find one.
     *
     * @param id the id
     * @return the newsletter
     */
    @GetMapping(path = {"/{id}"})
    public Newsletter findOne(@PathVariable("id") int id) {
        return NewsletterService.findById(id);
    }

    /**
     * Update.
     *
     * @param id the id
     * @param Newsletter the newsletter
     * @return the newsletter
     */
    @PutMapping(path = {"/{id}"})
    public Newsletter update(@PathVariable("id") int id, @RequestBody Newsletter Newsletter) {
        Newsletter.setId(id);
        return NewsletterService.update(Newsletter);
    }

    /**
     * Delete.
     *
     * @param id the id
     * @return the newsletter
     */
    @DeleteMapping(path ={"/{id}"})
    public Newsletter delete(@PathVariable("id") int id) {
        return NewsletterService.delete(id);
    }

    /**
     * Find all.
     *
     * @return the list
     */
    @GetMapping
    public List<Newsletter> findAll() {
        return NewsletterService.findAll();
    }
}