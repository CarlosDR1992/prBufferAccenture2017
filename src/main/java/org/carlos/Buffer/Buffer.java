package org.carlos.Buffer;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
  private Queue<Object> bufferQueue;
  private int capacity;
  long numberOfPutOperations = 0;
  long numberOfGetOperations = 0;

  /**
   * Constructor
   * 
   * @param bufferSize
   */
  public Buffer(int bSize) {
    capacity = bSize;
    bufferQueue = new LinkedList<Object>();
  }

  public void putValueOfBuffer(Object element) {
    if (bufferQueue.size() == capacity)
      

    System.err.println("Element inserted");

    bufferQueue.add(element);
    numberOfPutOperations++;
  }

  public Object getObtainValueOfBuffer() throws BufferException {
    if (bufferQueue.isEmpty())
      throw new BufferException("Error: Buffer is Empty");

    Object value = bufferQueue.remove();
    System.err.println("Element extracted");

    numberOfGetOperations++;
    return value;
  }

  public int getNumberOfElements() {
    return bufferQueue.size();
  }

  public int getNumberOfHoles() {
    return capacity - bufferQueue.size();
  }

  public int getCapacity() {
    return capacity;
  }

  public double getNumberOfOperations() {
    return numberOfGetOperations + numberOfGetOperations;
  }
}
