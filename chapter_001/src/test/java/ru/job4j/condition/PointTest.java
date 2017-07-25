package ru.job4j.condition;

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
public class PointTest {
	/**
	* Test add.
	*/
    @Test
    public void whenFalse() {
        Point point = new Point(1, 1);
        boolean result = point.is(2, 1);
        boolean expected = false;
        assertThat(result, is(expected));
    }
	/**
	* Test add.
	*/
    @Test
    public void whenTrue() {
        Point point = new Point(1, 1);
        boolean result = point.is(1, 0);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}