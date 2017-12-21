package com.gsk.sandpit.bean;

import javax.faces.bean.ManagedBean;

/**
 * Managed Bean that is to be accessed from the user page.
 */
@ManagedBean
public class UserBean {
    
    private String firstName;
    private String lastName;
    
    /**
     * Default constructor to populate the bean.
     */
/*    public UserBean() {
        firstName = "Mark";
        lastName = "Bailey";
    }
*/
    /**
     * Getter for the first name.
     * 
     * @return the first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for the first name.
     * 
     * @param firstName the first name to be set.
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for the last name.
     * 
     * @return the last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for the last name.
     * 
     * @param lastName the last name.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Displays the formatted first and last name for display.
     * 
     * @return formatted first and last name for display
     */
    public String showGreeting() {
        StringBuilder greeting = new StringBuilder();
        greeting.append(firstName);
        greeting.append(" ");
        greeting.append(lastName);
        return greeting.toString();
    }
}
