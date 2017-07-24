package ru.job4j.calculator;
/**
*Class Класс для вычисления арифитических операций.
*@author akulabuhov
*@since 24.07.2017
*@version 1
*/
public class Calculator {
	/**
	* Переменная хранящая результат арифметических операций.
	*/
	private double result;
	/**
	* Метод выполняющий операцию сложения.
	* @param first - первая переменная для операции.
	* @param second - вторая переменная для операции.
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	* Метод выполняющий операцию деления.
	* @param first - первая переменная для операции.
	* @param second - вторая переменная для операции.
	*/
	public void subtract(double first, double second) {
		this.result = first - second;
	}
	/**
	* Метод выполняющий операцию вычитания.
	* @param first - первая переменная для операции.
	* @param second - вторая переменная для операции.
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
	* Метод выполняющий операцию умножения.
	* @param first - первая переменная для операции.
	* @param second - вторая переменная для операции.
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	* @return Метод возвращающий результат арифметической операции.
	*/
	public double getResult() {
		return this.result;
	}
}