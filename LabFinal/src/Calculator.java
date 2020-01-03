/**
 *  Calculator - This is calculator class. This class performs the basic operation of finding maximum number, finding square and finding the cube.
 *  @author Ahmed Ali
 */
public class Calculator {
	
	/**
	 * findMax(int num1, int num2, int num3) - This method find the maximum number among three numbers and return the result.
	 * @param num1 - This is first number. It has integer type.
	 * @param num2 - This is second number. It has integer type.
	 * @param num3 - This is the third number. It has integer type.
	 * @return The max number is returned. It has integer type.
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
			max = arr[i];
		}
		return max;
	}
	
	/**
	 * square(int num) - This is square method. It finds the square of given number. Given Number has to be greator than 1 and less than 10 otherwise IllegalArgumentException is thrown. 
	 * @param num - The number whose square is to be find. It has integer type.
	 * @return The square of the number is returned. Integer type.
	 * @throws IllegalArgumentException - Exception is thrown when the number is less than 1 and greator than 9.
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
			result = num * num;
		} else {
			throw new IllegalArgumentException();
		}
		return result;
	}
	
	/**
	 * cube(int num) - This method finds the cube of given number.
	 * @param num - Cube of this number is find.
	 * @return - Cube value is returned - Integer type.
	 */
	public int cube(int num) {
		return num * num * num;
	}
		
}
