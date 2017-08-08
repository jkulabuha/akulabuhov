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
public class TwoSortedInOneTest {
	/**
	* Test twoSorted.
	*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		TwoSortedInOne sorted = new TwoSortedInOne();
		int[] a = {1, 5, 8, 11, 21};
		int[] b = {2, 11, 14, 19, 20};
		int[] resultArray = sorted.sortInOne(a, b);
		int[] expectArray = {1, 2, 5, 8, 11, 11, 14, 19, 20, 21};
		assertThat(resultArray, is(expectArray));
    }
}