package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 
 * this implementation of the queue data structure works only for the String type.
 * for a universal implementation please refer to at.fhj.generic Generics.java and its interface IGenerics.java
 * this class had to be debugged first, see more specific notes down below
 *
 */
public class StringQueue implements IQueue {

  // attributes	
  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  // constructors
  public  StringQueue(){

  }
  public StringQueue(int maxsize) {
    maxSize = maxSize;
  }

  // methods
  // this method was correct
  /**
   * @param obj
   * adds a string to queue, else (if queue is full) returns false
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }
  
// had to be debugged
  @Override
  /**
   * this returns the first element and "gets it out" of the queue (deletes it)
   * if queue is empty, null is returned
   */
  public String poll() {

    String element = peek();

    if (elements.size() == 0) {
      // making change element must return null when the queue empty
       element = null;
    }else {
      element = ""; // when the queue not empty we delete it with a empty String

    }

    return element;
  }
  
//had to be debugged
  @Override
  /**
   * same as the above, but a NoSuchElementException is returned instead of null, when queue is empty
   */
  public String remove() {
    String element = poll();
    element = "";
    if (elements.size() == 0)// i changed just the if statement to printing the exception
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
  
//had to be debugged
  @Override
  /**
   * just returns the first element if there is one, else null is returned
   */
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null; //  (empty queue )


    return element;
  }
  
//had to be debugged
  @Override
  /**
   * same as above, but instead of null, the NoSuchElementException is returned
   */
  public String element() {
    String element = peek();
    if (elements.size() == 0)// changing just the if statement
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
  
// a main method for testing
//  public static void main (String []args ){
//   StringQueue sq = new StringQueue(5);
////
//    sq.offer("b");
//    sq.offer("c");
//    sq.offer("d");
//    sq.offer("e");
//    sq.offer("f");
//    sq.offer("g");
//
//    System.out.println(sq.element());






//  }
}