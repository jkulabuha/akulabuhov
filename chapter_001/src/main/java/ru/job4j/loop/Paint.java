package ru.job4j.loop;
/**
*Class для построения пирамиды.
*@author akulabuhov
*@since 30.07.2017
*@version 1
*/
public class Paint {
	/**
	* Метод возвращающий строку заданного формата.
	* @param h - высота пирамиды.
	* @return выводим пирамиду.
	*/
	public String piramid(int h) {
		/**
		* новая пирамида.
		*/
		Paint newpiramid = new Paint();
		return newpiramid.toString(h);
	}

	/**
	* Метод возвращающий пирамиду заданного формата.
	* @param h - высота пирамиды.
	* @return выводим пирамиду.
	*/
	public String toString(int h) {
		/**
		* Буфер хранящий пирамиду.
		*/
		StringBuffer piramid = new StringBuffer();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h * 2 - 1; j++) {
				if (j > ((h * 2 - 1) / 2 + i) || j < ((h * 2 - 1) / 2 + 2 - i)) {
						piramid.append(" ");
					} else {
						piramid.append("^");
					}
			}
			if (i < h) {
				piramid.append(System.getProperty("line.separator"));
			}
		}
		return piramid.toString();
	}
}