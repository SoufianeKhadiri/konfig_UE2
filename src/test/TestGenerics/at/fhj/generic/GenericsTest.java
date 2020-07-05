package at.fhj.generic;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericsTest<MyType> {


    Generics generics = new Generics();

    @Test
    public void offer(){
        Boolean result =  generics.offer((MyType) "a");
        assertEquals(true,result);
    }

    @Test
    public void poll(){
        MyType result = (MyType) generics.poll();
        assertEquals(null,result);
    }

    @Test
    public void remove() {
        try {
            MyType result = (MyType) generics.remove();

        } catch (Exception ex) {
            assertEquals("there's no element any more",ex.getMessage());
        }
    }

    @Test
    public void peek(){
        MyType result = (MyType) generics.peek();
        assertEquals(null,result);
    }

    @Test
    public void element(){
        try {
            MyType result = (MyType) generics.element();

        } catch (Exception ex) {
            assertEquals("there's no element any more",ex.getMessage());
        }
    }
}