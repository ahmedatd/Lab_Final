import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.*
;
class CalculatorTest {

	@Test
	void findMax_test_1() {
		int num1 = -10;
		int num2 = -20;
		int num3 = -30;
		Calculator cal = new Calculator();
		int result = cal.findMax(num1,num2,num3);
		int expectedResult = 0;
		assertEquals(expectedResult, result,"Not working for negative numbers. As max field inside method has 0 value be default. So it will always return 0 for negative numbers.");
		
	}
	
	@Test
	void findMax_test_2() {
		int num1 = 10;
		int num2 = 0;
		int num3 = 30;
		Calculator cal = new Calculator();
		int result = cal.findMax(num1,num2,num3);
		int expectedResult = 30;
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void findMax_test_3() {
		int num1 = -9;
		int num2 = 0;
		int num3 = 0;
		Calculator cal = new Calculator();
		int result = cal.findMax(num1,num2,num3);
		int expectedResult = 0;
		Boolean isMatched = (result == expectedResult);
		assertTrue(isMatched);
	}
	
	@Test
	void square_test_1() {
		
		int num = 5;
		Calculator cal = new Calculator();
		int result = cal.square(num);
		int expectedResult = 25;
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void square_test_2() {
		
		int num = 2;
		Calculator cal = new Calculator();
		int result = cal.square(num);
		int expectedResult = 4;
		assertEquals(expectedResult, result);
		
	}

	@Test
	void square_test_3() {
		
		int num = 6;
		Calculator cal = new Calculator();
		int result = cal.square(num);
		int expectedResult = 12;
		assertFalse(result == expectedResult);
		
	}
	
	@Test
	void cube_test_1() {
		
		int num = -2;
		Calculator cal = new Calculator();
		int result = cal.cube(num);
		int expectedResult = -8;
		assertEquals(expectedResult, result);
	}
	
	@Test
	void cube_test_2() {
		
		int num = 3;
		Calculator cal = new Calculator();
		int result = cal.cube(num);
		int expectedResult = 27;
		assertEquals(expectedResult, result);
	}
	
	@Test
	void cube_test_3() {
		
		int num = 0;
		Calculator cal = new Calculator();
		int result = cal.cube(num);
		int expectedResult = 1000;
		assertNotEquals(expectedResult, result);
	}
	
}
