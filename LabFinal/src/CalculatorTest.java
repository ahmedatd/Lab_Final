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
		int expectedResult = -10;
		
		assertEquals(expectedResult, result);
		
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
	void square_test_1() {
		
		int num = 5;
	
		Calculator cal = new Calculator();
		int result = cal.square(num);
		int expectedResult = 25;
		
		assertEquals(expectedResult, result);
		
	}

	
}
