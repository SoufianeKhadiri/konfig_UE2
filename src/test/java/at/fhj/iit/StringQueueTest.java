package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;
import java.util.NoSuchElementException;

class StringQueueTest {

    private StringQueue sq = new StringQueue();


    @Before
    public void setUp()throws Exception{

    }

    @After
    public void tearDown()throws Exception{

    }
    @Test
    public void offer(){
        Boolean result =  sq.offer("a");
        assertEquals(true,result);
    }

    @Test
    public void poll(){
        String result = sq.poll();
        assertEquals(null,result);
    }

    @Test
    public void remove() {
        try {
            String result = sq.remove();

        } catch (Exception ex) {
            assertEquals("there's no element any more",ex.getMessage());
        }
    }

    @Test
    public void peek(){
        String result =  sq.peek();
        assertEquals(null,result);
    }

    @Test
    public void element(){
        try {
            String result = sq.element();

        } catch (Exception ex) {
            assertEquals("there's no element any more",ex.getMessage());
        }
    }


}

