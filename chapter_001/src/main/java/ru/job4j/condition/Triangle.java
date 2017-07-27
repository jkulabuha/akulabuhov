 package ru.job4j.condition;
 /**
*Class Класс для вычисления площади треугольника.
*@author akulabuhov
*@since 27.07.2017
*@version 1
*/
public class Triangle {
	/**
	* первая точка треугольника.
	*/
	private Point a;
	/**
	* вторая точка треугольника.
	*/
	private Point b;
	/**
	* третья точка треугольника.
	*/
	private Point c;
 	/**
	* Конструктор класса Triangle.
	* @param a - переменная задающая точку а.
	* @param b - переменная задающая точку b.
	* @param c - переменная задающая точку с.
	*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
  }
 	/**
	* @return Метод для вычисления площади треугольника если площадь равна 0, треугольник не существует .
	*/
	public double area() {
	return Math.abs(((this.a.getX() - this.c.getX()) * (this.b.getY() - this.c.getY()) - (this.b.getX() - this.c.getX()) * (this.a.getY() - this.c.getY())) / 2);
  }
}