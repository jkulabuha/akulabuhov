package ru.job4j.condition;
/**
*Class Класс для описания точки всистеме координат.
*@author akulabuhov
*@since 25.07.2017
*@version 1
*/

public class Point {
	/**
	* Переменная задающая координату x.
	*/
	private int x;
	/**
	* Переменная задающая координату y.
	*/
	private int y;
	/**
	* Конструктор класса Point.
	* @param x - переменная задающая координату x.
	* @param y - переменная задающая координату y.
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	* @return  Метод для получения x координаты.
	*/
	public int getX() {
		return this.x;
	}
	/**
	* @return Метод для получения y координаты.
	*/
	public int getY() {
		return this.y;
	}
	/**
	* Метод определяющий находится ли точка на фукнции y(x) = a * x + b.
	* @param a - переменная функции.
	* @param b - переменная функции.
	* @return возвращает true если точка принадлежит или false если не принадлежит.
	*/
	public boolean is(int a, int b) {
		return this.y == a * this.x + b ? true : false;
	}
}