package org.carlos.Buffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Buffer {
  private Queue<Object> buffer;
  private int capacity;
  int numberOfPut = 0;
  int numberOfGet = 0;

  /**
   * Constructor
   * 
   * @param bufferSize
   */
  public Buffer(int bSize) {
    capacity = bSize;
    buffer = new LinkedList<Object>();
  }

  public void put(Object element) {
    if (buffer.size() == capacity)
      System.exit(-1);;

    System.out.println("Element inserted");

    buffer.add(element);
    numberOfPut++;
  }

  public Object getObtainValueOfBuffer() throws Exception {
    if (buffer.isEmpty())
      throw new BufferException("Error: Buffer is Empty");

    Object value = buffer.remove();
    System.out.println("Element extracted");

    numberOfGet++;
    return value;
  }

  public int getNumberOfElements() {
    return buffer.size();
  }

  public int getNumberOfHoles() {
    return capacity - buffer.size();
  }

  public int getCapacity() {
    return capacity;
  }

  public double getNumberOfOperations() {
    return numberOfPut + numberOfGet;
  }
}
