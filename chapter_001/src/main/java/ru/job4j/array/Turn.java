package ru.job4j.array;
/**
*Class для трансформации массива.
*@author akulabuhov
*@since 01.08.2017
*@version 1
*/
public class Turn {
	/**
	* Метод возвращающий видоизмененный массив.
	* @param array - трансформируемый массив.
	* @return выводим массив.
	*/
	public int[] back(int[] array) {

		int buffer = 0;

		for (int i = 0; i < array.length / 2; i++) {
			buffer = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = buffer;
		}
		return array;
	}
}