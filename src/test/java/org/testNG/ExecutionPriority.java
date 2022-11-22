package org.testNG;

import org.testng.annotations.Test;

public class ExecutionPriority 
{
  @Test (priority=3)
  public void TestMethod1() 				//3rd Execution
  {
	  System.out.println("Hey Baby 1");
  }
  @Test(priority=2)
  public void tEstMethod2() 				//2nd Execution
  {
	  System.out.println("Hey Baby 2");
  }
  @Test(priority=1)
  public void testMethod3() 				//1st Execution
  {
	  System.out.println("Hey Baby 3");
  }
}
