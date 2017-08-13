package ru.job4j.proffession;
/**
*Class для создания дочернего класса Учитель.
*@author akulabuhov
*@since 12.08.2017
*@version 1
*/
public class Teacher extends Proffession {
    /**
	* Конструктор класса.
	* @param name - имя .
	* @param age - возраст.
	*/
    public Teacher(String name, int age) {
        setAge(age);
        setName(name);
    }
	/**
	* Выводим зарплату учителя.
	* @param salary - зарплата.
	* @return  - Какая зарплата у учителя.
	*/
    public String salaryTeacher(int salary) {
        return ("Teacher " + this.getName() + " imeet zarplatu " + salary);
    }
}
