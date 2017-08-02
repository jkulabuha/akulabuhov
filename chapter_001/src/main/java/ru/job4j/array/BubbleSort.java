package ru.job4j.array;
/**
*Class для сортировки массива методом пузырька.
*@author akulabuhov
*@since 02.08.2017
*@version 1
*/
public class BubbleSort {
	/**
	* Метод возвращающий отсортированный массив.
	* @param array - сортируемый массив.
	* @return выводим массив.
	*/
	public int[] sort(int[] array) {

	int buffer = 0;

	for (boolean check = true; check;) {
		check = false;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				buffer = array[i];
				array[i] = array[i + 1];
				array[i + 1] = buffer;
				check = true;
			}
		}
	}
	return array;
	}
}