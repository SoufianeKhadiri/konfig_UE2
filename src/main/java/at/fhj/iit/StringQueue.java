package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  public  StringQueue(){

  }
  public StringQueue(int maxsize) {
    maxSize = maxSize;
  }

  // this method is correct
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }
// here are some editing
  @Override
  public String poll() {

    String element = peek();

    if (elements.size() == 0) {
      // making change element must return null wen the queue empty
       element = null;
    }else {
      element = ""; // wen the queue not empty we delete it with a empty String

    }

    return element;
  }
// here some changes
  @Override
  public String remove() {
    String element = poll();
    element = "";
    if (elements.size() == 0)// i changed just the if statement to printing the exception
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
// here some changes
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null; //  element must null when elements.size < 0 (empty queue )


    return element;
  }
// some changes
  @Override
  public String element() {
    String element = peek();
    if (elements.size() == 0)// changing just the if statement
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
// a main method to testing
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