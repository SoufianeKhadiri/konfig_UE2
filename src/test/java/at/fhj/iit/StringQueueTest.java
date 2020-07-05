package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 
 * this is a test for the StringQueue.java class
 * it is designed to test the methods of the aforementioned class to find bugs more easily
 * all methods with the @test annotation will be run, and a report will be displayed if the methods pass or fail the tests.
 *
 */
class StringQueueTest {

    private StringQueue sq = new StringQueue();


    @Test
    /**
     * tests the offer method
     */
    public void offer(){
        Boolean result =  sq.offer("a");
        assertEquals(true,result);
    }

    @Test
    /**
     * tests the poll method
     */
    public void poll(){
        String result = sq.poll();
        assertEquals(null,result);
    }

    @Test
    /**
     * tests the remove method
     */
    public void remove() {
        try {
            String result = sq.remove();

        } catch (Exception ex) {
            assertEquals("there's no element any more",ex.getMessage());
        }
    }

    @Test
    /**
     * tests the peek method
     */
    public void peek(){
        String result =  sq.peek();
        assertEquals(null,result);
    }

    @Test
    /**
     * tests the element method
     */
    public void element(){
        try {
            String result = sq.element();

        } catch (Exception ex) {
            assertEquals("there's no element any more",ex.getMessage());
        }
    }


}

