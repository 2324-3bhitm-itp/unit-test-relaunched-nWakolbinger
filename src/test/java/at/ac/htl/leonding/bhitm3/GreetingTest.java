package at.ac.htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GreetingTest {
    Greeter greeter;
    @Before
    public void setup() {
        greeter = new Greeter();
    }
    @Test
    public void given_new_app_when_asking_greeting_it_should_be_hello() {
        assertEquals("Hello!", greeter.getGreeting());
    }
}
