package ru.job4j.proffession;
/**
*Class для создания дочернего класса Инженер.
*@author akulabuhov
*@since 12.08.2017
*@version 1
*/
public class Engineer extends Proffession {
	/**
	* Конструктор класса.
	* @param name - имя .
	* @param age - возраст.
	*/
    public Engineer(String name, int age) {
        setAge(age);
        setName(name);
    }
	/**
	* Выводим уровень инженера.
	* @param level - уровень.
	* @return  - Уровень инженера.
	*/
    public String levelEngeneer(int level) {
        return ("Engeneer " + this.getName() + " imeet uroven " + level);
    }
}
