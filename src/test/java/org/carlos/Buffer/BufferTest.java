package org.carlos.Buffer;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BufferTest {
  private static final double DELTA = 0;
  private Buffer<Object> buffer;
  

  @Before
  public void init() {
    buffer = new Buffer<Object>(0);
    
  }

  @Test
  public void checkIsBufferIsEmpty() throws BufferException {
    long capacity = buffer.getCapacity();
    long expectedValue = 0;

    assertEquals(expectedValue, capacity);
  }

  @Test
  public void checkIsBufferIsHole() throws BufferException {
    long holes = buffer.getNumberOfHoles();
    assertEquals(holes, buffer.getCapacity(), DELTA);
  }
  
  @Test
  public void checkIsBufferIsPutOperation() {
    long holes = buffer.getNumberOfElements();
    assertEquals(holes, buffer.getCapacity(), DELTA);
  }
  
  @Test
  public void checkIsBufferGetOperations() {
    double holes = buffer.getNumberOfOperations();
    assertEquals(holes, buffer.getCapacity(), DELTA);
  }
  
  @Test
  public void checkIsBufferIsObtainValue() throws BufferException {
    buffer.putValueOfBuffer(0);
    Object holes = buffer.getObtainValueOfBuffer();
    assertEquals(holes, buffer.getCapacity());
  }
}
