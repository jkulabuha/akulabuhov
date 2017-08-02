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
public class TurnTest {
	/**
	* Test turn.
	*/
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultArray = turn.back(array);
		int[] expectArray =  new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }
	/**
	* Test turn.
	*/
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		int[] array = new int[] {1, 2, 3, 4, 5};
        int[] resultArray = turn.back(array);
		int[] expectArray =  new int[] {5, 4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }
}