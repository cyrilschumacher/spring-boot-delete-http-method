package com.cyrilschumacher.model;

/**
 * Main model.
 *
 * @author Cyril Schumacher
 * @version 1.0
 * @since 2014-01-22
 */
public class MainModel {

    //<editor-fold desc="Fields section.">

    /**
     * First name.
     */
    public String firstname;

    /**
     * Last name.
     */
    public String lastname;

    //</editor-fold>

    //<editor-fold desc="Properties section.">

    /**
     * Gets the first name.
     *
     * @return The first name.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Gets the last name.
     *
     * @return The last name.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the first name.
     *
     * @param firstname The first name.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Sets the last name.
     *
     * @param lastname The last name.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //</editor-fold>

}
