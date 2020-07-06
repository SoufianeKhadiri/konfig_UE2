#What is a queue?
A queue is another common data structure that places elements in a sequence, similar to a stack. A queue uses the FIFO method (First In First Out), by which the first element that is enqueued will be the first one to be dequeued.
#Queue Testing with Junit 

Here is what we need to test:

- A queue is empty on construction
- A queue has size 0 on construction
- After n enqueues to an empty queue, n > 0, the queue is not empty and its size is n
- If one enqueues x then dequeues, the value dequeued is x.
- If one enqueues x then peeks, the value returned is x, but the size stays the same
- If the size is n, then after n dequeues, the stack is empty and has a size 0
- If one enqueues the values 1 through 50, in order, into an empty queue, then if 50 dequeues are done the values dequeues are 1 through 50.
- Dequeueing from an empty queue does throw a NoSuchElementException
- Peeking into an empty queue does throw a NoSuchElementException
- For bounded queues only, pushing onto a full stack does throw an IllegalStateException
  source (https://cs.lmu.edu/~ray/notes/queues/)