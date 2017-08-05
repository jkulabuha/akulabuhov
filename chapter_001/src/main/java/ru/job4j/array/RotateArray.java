package ru.job4j.array;
/**
*Class для поворота массива на 90 градусов.
*@author akulabuhov
*@since 05.08.2017
*@version 1
*/
public class RotateArray {
	/**
	* Метод возвращающий видоизмененный массив.
	* @param array - трансформируемый массив.
	* @return выводим массив.
	*/
		public int[][] rotate(int[][] array) {
			int tmp;
			for (int i = 0; i < array.length / 2; i++) {
				for (int j = i; j < array.length - 1 - i; j++) {
					tmp = array[i][j];
					array[i][j] = array[array.length - j - 1][i];
					array[array.length - j - 1][i] = array[array.length - i - 1][array.length - j - 1];
					array[array.length - i - 1][array.length - j - 1] = array[j][array.length - i - 1];
					array[j][array.length - i - 1] = tmp;
				}
			}
			return array;
		}
}