package com.cyrilschumacher.controller;

import com.cyrilschumacher.model.MainModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main controller.
 *
 * @author Cyril Schumacher
 * @version 1.0
 * @since 2014-01-22
 */
@RestController
@RequestMapping("/")
public class MainController {

    //<editor-fold desc="Methods section.">

    //<editor-fold desc="Assertions.">

    /**
     * Asserts that the model (and its properties) are not null.
     *
     * @param model The model.
     */
    private void assertModel(MainModel model) {
        if ((model == null) || (model.getFirstname() == null) || (model.getLastname() == null)) {
            throw new IllegalArgumentException();
        }
    }

    //</editor-fold>

    /**
     * Creates a custom entity.
     *
     * @param model The model.
     */
    @RequestMapping(method = RequestMethod.POST)
    public void create(MainModel model) {
        // It doesn't work.
        assertModel(model);
    }

    /**
     * Deletes a custom entity.
     *
     * @param model The model.
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(MainModel model) {
        // It's work.
        assertModel(model);
    }

    /**
     * Deletes a custom entity.
     *
     * @param body The body.
     */
    @RequestMapping(value = "with_body/", method = RequestMethod.DELETE)
    public void delete(@RequestBody String body) {
        // It's work.
    }

    //</editor-fold>

}
