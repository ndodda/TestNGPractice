package com.nlsinc.testnghomework.testcases;

import static org.testng.Assert.*;
import org.testng.TestNG;
import org.testng.annotations.*;


public class MathOperationsTests {
	
	public static void main(String[] args){
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] {MathOperationsTests.class});
		testng.run();
	}
	
	@Test (dataProviderClass = MathOperationsData.class, dataProvider = "BinaryData", groups = "BinaryTests1", priority = 1)
	public void addTest(int a, int b, int sumExpected){
		assertEquals(MathOperations.add(a, b), sumExpected);
	}

	@Test (dataProviderClass = MathOperationsData.class, dataProvider = "BinaryData", groups = "BinaryTests1", priority = 2)
	public void subtractTest(int a, int b, int diffExpected){
		assertEquals(MathOperations.subtract(a, b), diffExpected);
	}
	
	@Test (dataProviderClass = MathOperationsData.class, dataProvider = "BinaryData", groups = "BinaryTests2", dependsOnGroups = "BinaryTests1", priority = 1)
	public void multiplyTest(int a, int b, int productExpected){
		assertEquals(MathOperations.multiply(a, b), productExpected);
	}
	
	@Test (dataProviderClass = MathOperationsData.class, dataProvider = "BinaryData", groups = "BinaryTests2", dependsOnGroups = "BinaryTests1", priority = 2)
	public void divideTest(int a, int b, int quotientExpected){
		assertEquals(MathOperations.divide(a, b), quotientExpected);
	}
}
