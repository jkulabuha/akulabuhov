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
public class RotateArrayTest {
	/**
	* Test turn.
	*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray turn = new RotateArray();
		int[][] array = {
			{1, 2},
			{3, 4}
		};
		int[][] resultArray = turn.rotate(array);
		int[][] expectArray = {
			{3, 1},
			{4, 2}
		};
		assertThat(resultArray, is(expectArray));
    }
	/**
	* Test turn.
	*/
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
		RotateArray turn = new RotateArray();
		int[][] array = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int[][] resultArray = turn.rotate(array);
		int[][] expectArray = {
			{7, 4, 1},
			{8, 5, 2},
			{9, 6, 3}
		};
		assertThat(resultArray, is(expectArray));
    }
}