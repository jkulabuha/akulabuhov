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
public class CounterTest {
	/**
	* Test counter.
	*/
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter test = new Counter();
		int result = test.add(1, 10);
		assertThat(result, is(30));
	}
}