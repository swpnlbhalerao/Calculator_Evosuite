/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 30 09:10:51 GMT 2019
 */

package com.test.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.test.util.StreamApi;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StreamApi_ESTest extends StreamApi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(1429);
      linkedList0.add(integer0);
      long long0 = streamApi0.mapOddCount(linkedList0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1726));
      linkedList0.offer(integer0);
      long long0 = streamApi0.evenCount(linkedList0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      // Undeclared exception!
      try { 
        streamApi0.mapOddCount((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.test.util.StreamApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      // Undeclared exception!
      try { 
        streamApi0.funcProg1((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.test.util.StreamApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      List<Integer> list0 = linkedList0.subList(0, 0);
      linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        streamApi0.evenCount(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      // Undeclared exception!
      try { 
        streamApi0.evenCount(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.test.util.StreamApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("S;@W+G");
      boolean boolean0 = streamApi0.funcProg1(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("%Cs3");
      boolean boolean0 = streamApi0.funcProg1(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      long long0 = streamApi0.evenCount(linkedList0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StreamApi streamApi0 = new StreamApi();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      long long0 = streamApi0.mapOddCount(linkedList0);
      assertEquals(0L, long0);
  }
}
