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
public class ArrayDuplicateTest {
	/**
	* Test turn.
	*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
		String[] array = {"Вася", "Вася", "Петя", "Петя", "Вова", "Сашин", "Друг"};
        String[] resultArray = duplicate.remove(array);
		String[] expectArray = {"Вася", "Петя", "Вова", "Сашин", "Друг"};
        assertThat(resultArray, is(expectArray));
    }
}