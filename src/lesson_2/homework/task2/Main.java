package lesson_2.homework.task2;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        double sum = rectangle.calculateArea(2,6);
        double hye = rectangle.calculatePerimeter(67,7);
        System.out.println(sum);
        System.out.println(hye);

        }
    }

