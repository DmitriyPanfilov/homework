package lesson_1.homework.task_1;

public class Main {
    public static void main(String[] args){
        // Создание объектов класса Cat, Owner
        Cat cat1 = new Cat("Кекс", 8);
        Owner owner =new Owner("Сосиска",1, "Боб");

        // Использование методов и вывод информации
        cat1.greet();
        System.out.println();
        owner.greet();

    }
}
