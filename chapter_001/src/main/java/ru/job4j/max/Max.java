package ru.job4j.max;
/**
*Class Класс для вычисления максимума из двух чисел.
*@author akulabuhov
*@since 24.07.2017
*@version 2
*/
public class Max {
	/**
	* Метод возвращающий большее из двух переменных.
	* @param first - первая переменная.
	* @param second - вторая переменная.
	* @return - возвращаем наибольшую переменную.
	*/
	public int max(int first, int second) {
		return (first >= second) ? first : second;
	}
		/**
	* Метод возвращающий большее из трех переменных.
	* @param first - первая переменная.
	* @param second - вторая переменная.
	* @param third - третья переменная.
	* @return - возвращаем наибольшую переменную.
	*/
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}