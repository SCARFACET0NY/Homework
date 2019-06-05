package com.anton;

import org.hamcrest.text.IsEqualIgnoringCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class AppTest {

    @Rule
    public Timeout timeout = Timeout.seconds(5);

    @Test
    public void negateTest() {
        assertTrue(App.negate(false));
    }

    @Test
    public void negateTestWithMatcher() {
        assertThat(true, not(App.negate(true)));
    }


    @Test
    public void concatenateTest() {
        assertEquals("Hello world!", App.concatenate("Hello", " world!"));
    }

    @Test
    public void concatenateTestWithMatcher() {
        assertThat("matcher equals", new IsEqualIgnoringCase(App.concatenate("Matcher", " Equals")));
    }

    @Test
    public void powerTest() {
        assertEquals(8, App.power(2, 3));
    }

    @Test
    public void powerTestWitchMatcher() {
        assertThat(36, is(App.power(6, 2)));
    }
}
