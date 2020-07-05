package at.fhj.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @param <MyType>
 * this implementation of the queue data structure works universally, (it's of generic type).
 * for the original implementation that only worked with Strings, which this class is based on, please refer to at.fhj.iit SringQueue.java and its interface IQueue.java
 * 
 */
public class Generics <MyType> implements IGeneric<MyType>{
	
	// attributes
    List<MyType> elements = new ArrayList<MyType>();
    private int maxSize = 5;
    
    // constructors
    public Generics(int maxsize) {
        maxSize = maxSize;
    }

    public Generics() {

    }

    // methods
    @Override
    /**
     *@param obj
     *adds a string to queue, else (if queue is full) returns false
     */
    public boolean offer(MyType obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    @Override
    /**
     * this returns the first element and "gets it out" of the queue (deletes it)
     * if queue is empty, null is returned
     */
    public MyType poll() {

        MyType element = peek();

        if (elements.size() == 0) {

            element = null;
        }else {
            element = (MyType) ""; // when the queue not empty we delete it with a empty String

        }

        return element;
    }

    @Override
    /**
     * same as the above, but a NoSuchElementException is returned instead of null, when queue is empty
     */
    public MyType remove() {
        MyType element = poll();
        element = (MyType) "";
        if (elements.size() == 0)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    /**
     * just returns the first element if there is one, else null is returned
     */
    public MyType peek() {
        MyType element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null; //  element must null when elements.size < 0 (empty queue )


        return element;
    }

    @Override
    /**
     * same as above, but instead of null, the NoSuchElementException is returned
     */
    public MyType element() {
        MyType element = peek();
        if (elements.size() == 0)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }


    // a main method to testing
//    public static void main (String []args ){
//
//        Generics<String> element = new Generics<String>();
//        element.offer("a");
//        element.offer("b");
//        element.offer("c");
//        element.offer("d");
//        element.offer("e");
//        element.offer("f");
//        element.offer("g");
//
//        System.out.println(element.element());


//    }

}
