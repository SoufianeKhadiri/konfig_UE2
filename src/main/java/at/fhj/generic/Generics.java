package at.fhj.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Generics <MyType> implements IGeneric<MyType>{
    List<MyType> elements = new ArrayList<MyType>();
    private int maxSize = 5;

    public Generics(int maxsize) {
        maxSize = maxSize;
    }

    public Generics() {

    }

    @Override
    public boolean offer(MyType obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    @Override
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
    public MyType remove() {
        MyType element = poll();
        element = (MyType) "";
        if (elements.size() == 0)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    public MyType peek() {
        MyType element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null; //  element must null when elements.size < 0 (empty queue )


        return element;
    }

    @Override
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
