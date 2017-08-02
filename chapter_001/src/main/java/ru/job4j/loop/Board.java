package ru.job4j.loop;
/**
*Class для построения доски.
*@author akulabuhov
*@since 30.07.2017
*@version 1
*/
public class Board {
	/**
	* Метод возвращающий строку заданного формата.
	* @param width - ширина доски.
	* @param height - высота доски.
	* @return выводим доску.
	*/
	public String paint(int width, int height) {
		/**
		* новая доска.
		*/
		StringBuilder newboard = new StringBuilder();
		return newboard.toString(width, height);
		}
}
/**
*Class для построения "строк" на доске.
*@author akulabuhov
*@since 30.07.2017
*@version 1
*/
class StringBuilder {
	/**
	* Метод возвращающий строку заданного формата.
	* @param width - ширина доски.
	* @param height - высота доски.
	* @return выводим доску.
	*/
	public String toString(int width, int height) {
		/**
		* Буфер хранящий символы строки.
		*/
		StringBuffer board = new StringBuffer();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
					board.append("x");
					} else {
						board.append(" ");
					}
			}
		board.append(System.getProperty("line.separator"));
		}
		return board.toString();
	}
}