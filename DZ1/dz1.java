import javax.print.event.PrintEvent;

// решение ДЗ к семинар 1
// Задание: написать программу расчитывающую "треугольное" число

import java.util.Scanner;

public class dz1 {
    private static Scanner input = new Scanner(System.in); 

    public static void main(String[] args) {
        int number = getUser("Введите номер треугольного числа: ");
        int numberTriangle = triangle(number);
        printTrangle(numberTriangle, "Треугольное число под № " + number + " = ");        
    }

    // запрос данных у пользователя
    static int getUser(String text){
        System.out.print(text);
        return input.nextInt();
    }


    // считаем треугольное число
    static int triangle(int number) {
        if (number == 1){
            return 1;
        }
        else{
            return (number + triangle(number-1));
        }
    }


    // выводим результат
    static String printTrangle(int number, String text){
        System.out.println(text + number);
        return null;
    }
    
}