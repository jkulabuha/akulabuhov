package ru.job4j.loop;

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
public class FactorialTest {
	/**
	* Test factorial.
	*/
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial test1 = new Factorial();
		int result = test1.calc(5);
		assertThat(result, is(120));
    }
	/**
	* Test factorial.
	*/
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial test1 = new Factorial();
		int result = test1.calc(0);
		assertThat(result, is(1));
    }
}