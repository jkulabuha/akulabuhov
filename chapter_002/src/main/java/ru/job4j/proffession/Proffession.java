package ru.job4j.proffession;
/**
*Class для создания родительского класса.
*@author akulabuhov
*@since 12.08.2017
*@version 1
*/
public class Proffession {
	/**
	*Имя рабочего.
	*/
   private String name;
   	/**
	*Стаж рабочего.
	*/
   private int stage;
   	/**
	*Возраст рабочего.
	*/
   private int age;
	/**
	* сеттер имени.
	* @param name имя.
	*/
   public void setName(String name) {
       this.name = name;
    }
	/**
	* геттер имени.
	* @return имя.
	*/
    public  String  getName() {
       return name;
    }
	/**
	* сеттер имени.
	* @param age имя.
	*/
    public  void setAge(int age) {
       this.age = age;
    }
	/**
	* геттер имени.
	* @return имя.
	*/
    public int getAge() {
       return age;
    }
	/**
	* сеттер имени.
	* @param stage имя.
	*/
    public void setStage(int stage) {
       this.stage = stage;
    }
	/**
	* геттер имени.
	* @return имя.
	*/
    public int getStage() {
       return stage;
    }
}
