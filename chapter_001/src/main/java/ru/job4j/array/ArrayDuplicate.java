package ru.job4j.array;
import java.util.Arrays;
/**
*Class для удаления дубликатов из массива.
*@author akulabuhov
*@since 05.08.2017
*@version 1
*/
public class ArrayDuplicate {
	/**
	* Метод возвращающий видоизмененный массив.
	* @param array - трансформируемый массив.
	* @return выводим массив.
	*/
	public String[] remove(String[] array) {
		int tmpkol = 0;
		String tmpeq = null;
		for (int i = 0; i < array.length - tmpkol; i++) {
			tmpeq = array[i];
			for (int j = i + 1; j < array.length - tmpkol; j++) {
				if (tmpeq.equals(array[j])) {
					tmpkol++;
					for (int h = j; h < array.length - 1; h++) {
						array[h] = array[h + 1];
					}
					array[array.length - 1] = tmpeq;
									}
			}
		}
		return Arrays.copyOf(array, (array.length - tmpkol));
	}
}