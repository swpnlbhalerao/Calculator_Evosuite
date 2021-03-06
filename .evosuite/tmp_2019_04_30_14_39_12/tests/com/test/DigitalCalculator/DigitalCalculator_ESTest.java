/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 30 09:14:04 GMT 2019
 */

package com.test.DigitalCalculator;

import org.junit.Test;
import static org.junit.Assert.*;
import com.test.DigitalCalculator.DigitalCalculator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DigitalCalculator_ESTest extends DigitalCalculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DigitalCalculator digitalCalculator0 = new DigitalCalculator();
      double double0 = digitalCalculator0.calculateLog(0.0, 1272.28851544846);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DigitalCalculator digitalCalculator0 = new DigitalCalculator();
      double double0 = digitalCalculator0.calculateLog((-1772.0), 1.0);
      assertEquals((-1772.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DigitalCalculator digitalCalculator0 = new DigitalCalculator();
      double double0 = digitalCalculator0.calculateLog(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }
}
