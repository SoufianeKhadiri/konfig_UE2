#Queue Implementation Code-Snipet
```java
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
      }}
```
#Queue Testing Implementation Code-Snipet
```java
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
```