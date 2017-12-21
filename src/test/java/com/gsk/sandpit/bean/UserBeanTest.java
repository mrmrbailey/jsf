package com.gsk.sandpit.bean;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TestName;

/**
 * Test for the UserBean
 */
public class UserBeanTest {
    
    @Rule
    public final TestName testName = new TestName();
    
    private static final Logger logger = Logger.getLogger(UserBeanTest.class.getName());
    
    /**
     * Test of showGreeting method, of class UserBean.
     */
    @Test
    public void testShowGreeting() {
        logger.log(Level.INFO, testName.getMethodName());

        String firstName = "a";
        String lastName = "b";
        String expResult = "a b";

        UserBean instance = new UserBean();
        instance.setFirstName(firstName);
        instance.setLastName(lastName);
        
        String result = instance.showGreeting();
        assertEquals(expResult, result);
    }
    
}
