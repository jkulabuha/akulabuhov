package ru.job4j.proffession;
/**
*Class для создания дочернего класса Доктор.
*@author akulabuhov
*@since 12.08.2017
*@version 1
*/
public class Doctor extends Proffession {
	/**
	* Конструктор класса.
	* @param name - имя.
	* @param age - возраст.
	*/
    public Doctor(String name, int age) {
        setAge(age);
        setName(name);
    }
	/**
	* Лечим пациента.
	* @param patient - имя.
	* @return  - Кого лечит доктор.
	*/
    public String treatPatient(String patient) {
        return ("Doctor " + this.getName() + " heal " + patient);
    }

}
