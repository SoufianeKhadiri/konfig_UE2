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

    StringQueue sq = new StringQueue() ;



    @BeforeEach
    public void setUp()throws Exception{
        sq = new StringQueue();
    }


    @Test
    /**
     * @DisplayName("Testing StringQueue offer method")
     * @return
     */
    public void offer(){
        Boolean result =  sq.offer("a");
        assertEquals(true,result);
    }

    @Test
    /**
     * @DisplayName("Testing StringQueue poll method")
     * @return
     */
    public void poll(){
        String result = sq.poll();
        assertEquals(null,result);
    }

    @Test
    /**
     * @DisplayName("Testing StringQueue remove method")
     * @return
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
     * @DisplayName("Testing StringQueue peek method")
     * @return
     */
    public void peek(){
        String result =  sq.peek();
        assertEquals(null,result);
    }

    @Test
    /**
     * @DisplayName("Testing StringQueue element method")
     * @return
     */
    public void element(){
        try {
            String result = sq.element();

        } catch (Exception ex) {
            assertEquals("there's no element any more",ex.getMessage());
        }
    }


}

