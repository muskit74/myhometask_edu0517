/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1;
        System.out.print("Введите число: ");
        num1 = scanner.nextInt();
        System.out.println("Ваш результат: "+ (num1+((num1*15)/100)));
    }
}
