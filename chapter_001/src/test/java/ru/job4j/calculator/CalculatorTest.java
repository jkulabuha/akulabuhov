package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
	/**
	*Test.
	*
	*@author akulabuhov (mailto:jkulabuha@yandex.ru)
	*@version $ld$
	*@since 0.1
	*/
public class CalculatorTest {
	/**
	* Test add.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Test subtract.
	*/
	@Test
    public void whenSubOneMinusOneThenNull() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }
	/**
	* Test div.
	*/
	@Test
    public void whenDivOneDivOneThenOne() {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
	/**
	* Test multiple.
	*/
	@Test
    public void whenMultOneMultOneThenOne() {
        Calculator calc = new Calculator();
        calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}