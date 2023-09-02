package lesson_1.homework.task_2;

import java.net.Socket;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

class Rectangle {

    private Integer width = 10;

    private Integer height = 10;


    // Конструктор класса Прямоугольник
    public Rectangle(Integer width,Integer height) {
        this.width = width;
        this.height = height;
    }
    // Конструктор класса Прямоугольник по умолчанию
    public Rectangle() {

    }

    // Геттер для получения ширины треугольника
    public Integer getWidth(){
        return width;
    }
    // Сеттер для установки ширины треугольника
    public void setWidth(Integer width){
        this.width = width;
    }

    // Геттер для получения высоты треугольника
    public Integer getHeight(){
        return height;
    }
    // Сеттер для установки высоты треугольника
    public void setHeight(Integer height){
        this.height = height;
    }
    // Метод вычисления площади
    public void calculateArea(){
       int i = width * height;
        System.out.println(i);
    }
    // Метод вычисления периметра
    public void calculatePerimeter(){
        int i = 2 * (width + height);
        System.out.println(i);
    }
}
