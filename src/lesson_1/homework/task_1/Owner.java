package lesson_1.homework.task_1;

import java.sql.SQLOutput;

class Owner extends Cat{

    public String  nams;
    // Конструктор класса Owner
    public Owner(String name, int age, String nams) {
        super(name, age);
        this.nams = nams;
    }
    @Override
    public void greet(){
        super.greet(); // Вызов метода базового класса
        System.out.printf("Мой владелец %s",nams);
    }
}
