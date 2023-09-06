package lesson_2.homework.task1;

// Базовый класс для кота
class Cat implements Iterfeis{
    private String name;
    private int age;

    // Конструктор класса Cat
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }

    // Метод вывод приветствия
    @Override
    public void greet(){
        System.out.printf("Мау! Меня зовут %s. Мне %s год(лет) ",name, age);
    }
}
