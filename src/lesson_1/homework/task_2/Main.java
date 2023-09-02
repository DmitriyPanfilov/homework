package lesson_1.homework.task_2;

public class Main {
    public static void main(String []arg){
        // Создание объектов
        Rectangle rectangle = new Rectangle(); // Создание объекта по умолчанию
        Rectangle rectangle1 = new Rectangle(25,40);

        // Использование методов и вывод информации
        rectangle.calculateArea();
        rectangle1.calculatePerimeter();
    }

}
