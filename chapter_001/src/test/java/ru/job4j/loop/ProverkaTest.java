package ru.job4j.array;

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
public class ProverkaTest {
	/**
	* Test proverka.
	*/
    @Test
    public void whenFirstWordInqludeSecond() {
		Proverka test = new Proverka();
		boolean result = test.contains("GeorgPetr", "et");
		assertThat(result, is(true));
	}
}