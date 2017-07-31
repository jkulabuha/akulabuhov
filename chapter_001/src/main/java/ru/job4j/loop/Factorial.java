package ru.job4j.loop;
/**
*Class Класс для подсчета факториала.
*@author akulabuhov
*@since 30.07.2017
*@version 1
*/
public class Factorial {
	/**
	* Метод возвращающий факториал заданного числа.
	* @param n - число для которого требуется найти факториал.
	* @return factorial искомый факториал.
	*/
	public int calc(int n) {
		/**
		* Переменная хранящая факториал заданных чисел.
		*/
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}