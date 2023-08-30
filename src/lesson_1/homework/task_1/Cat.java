package lesson_1.homework.task_1;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

// Базовый класс для кота
class Cat {
    private String name;
    private int age;

    // Конструктор класса Cat
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    // Геттер для получения имени кота
    public String getName(){
        return  name;
    }
    // Сеттер для установки имени кота
    public void setName(String name){
        this.name = name;
    }
    // Геттер для получения возраста кота
    public int getAge(){
        return age;
    }
    // Сеттер для установки возраста кота
    public void  setAge(int age){
        if(age > 0) {
            this.age = age;
        }
    }
    // Метод вывод приветствия
    public void greet(){
        System.out.printf("Мау! Меня зовут %s. Мне %s год(лет) ",name, age);
    }
}
