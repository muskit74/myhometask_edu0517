/* Задача наполнить корабельный бассейн. Нужно посчитать,
сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя.
Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length, width, depths;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину бассейна в метрах: ");
        length = scanner.nextInt();
        System.out.print("Введите ширину бассейна в метрах: ");
        width = scanner.nextInt();
        System.out.print("Введите глубину бассейна в метрах: ");
        depths = scanner.nextInt();
        System.out.println("Для наполнения бассейна необходимо: "+ (length*width*depths*1000)+ " литров воды");
    }
}
