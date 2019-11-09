package junit.tutorial;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {

	@Test
	public void multiplyで3と4の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertEquals(expected,actual);
//		assertThat(actual,is(expected));
	}
	@Test
	public void multiplyで5と7の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(5, 7);
		assertEquals(expected,actual);
		//assertThat(actual,is(expected));
	}
	@Test
	public void divideで3と2の除算結果が取得できる() {
		Calculator calc = new Calculator();
		float expected = 1.5f; //期待値
		float actual   = calc.divide(3, 2); //実測値
		assertEquals(expected,actual,0f);
		//assertThat(expected,is(actual));
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void divideの第二引数に0を指定した場合にはIllegalArgumentExceptionを送出する() {
		Calculator calc = new Calculator();
		calc.divide(5, 0);
	}

}
