package ru.job4j.loop;
/**
*Class Класс для подсчета суммы чётных чисел в диапазоне.
*@author akulabuhov
*@since 30.07.2017
*@version 1
*/
public class Counter {
	/**
	* Метод возвращающий сумму чётных чисел в диапазоне.
	* @param start - начало диапазона.
	* @param finish - конец диапазона.
	* @return summa - возвращаем наибольшую переменную.
	*/
	public int add(int start, int finish) {
		/**
		* Переменная хранящая результат сложения четных чисел в диапазоне.
		*/
		int summa = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				summa += i;
			}
		}
		return summa;
	}
}