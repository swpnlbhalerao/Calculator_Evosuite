/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 30 09:12:47 GMT 2019
 */

package com.test.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.test.util.RecursionFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecursionFunction_ESTest extends RecursionFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RecursionFunction recursionFunction0 = new RecursionFunction();
      recursionFunction0.factorial(0);
      int int0 = recursionFunction0.factorial(0);
      int int1 = 840;
      int int2 = recursionFunction0.factorial(840);
      recursionFunction0.factorial(840);
      int int3 = (-3773);
      recursionFunction0.factorial(int3);
      recursionFunction0.factorial(int2);
      recursionFunction0.factorial(int0);
      recursionFunction0.factorial(int0);
      int int4 = 1873;
      int int5 = recursionFunction0.factorial(int4);
      recursionFunction0.factorial(int1);
      recursionFunction0.factorial(int5);
      int int6 = 0;
      recursionFunction0.factorial(int6);
      int int7 = 0;
      recursionFunction0.factorial(int7);
      recursionFunction0.factorial(int3);
      int int8 = 0;
      recursionFunction0.factorial(int8);
      int int9 = 1990;
      recursionFunction0.factorial(int9);
      recursionFunction0.factorial(int1);
  }
}
