package ru.job4j.array;
/**
*Class для сляния двух сортированных массивов.
*@author akulabuhov
*@since 08.08.2017
*@version 1
*/
public class TwoSortedInOne {
	/**
	* Метод возвращающий результат сляния.
	* @param a - первый массив.
	* @param b - второй массив.
	* @return выводим третий массив, получившийся после слияния.
	*/
	public int[] sortInOne(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int j = 0, k = 0;
		for (int i = 0; i < a.length || j < b.length;) {
			if (j >= b.length) {
			c[k++] = a[i++];
			}	else if (i >= a.length) {
					c[k++] = b[j++];
					}	else if (a[i] <= b[j]) {
						c[k++] = a[i++];
						}	else {
						c[k++] = b[j++];
						}
		}
		return c;
	}

}