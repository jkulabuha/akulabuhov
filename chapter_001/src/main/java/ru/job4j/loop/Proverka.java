package ru.job4j.array;

/**
*Class для проверки что одно слово находится в другом.
*@author akulabuhov
*@since 07.08.2017
*@version 1
*/
public class Proverka {
	/**
	* Метод возвращающий результат проверки.
	* @param origin - проверяемое слово.
	* @param sub - слово для поиска.
	* @return выводим массив.
	*/
	boolean contains(String origin, String sub) {
		boolean flag = false;
		char[] test = origin.toCharArray();
		char[] test2 = sub.toCharArray();
		for (int i = 0; i <= test.length - test2.length; i++) {
			int n = 0;
			for (int j = 0; j < test2.length; j++) {
				if (test[i + j] == (test2[j])) {
					n++;
				}
			}
			if (n == test2.length) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}