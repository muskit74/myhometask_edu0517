/*
Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):
1
1+2=3
1+2+3=6
...
Пример вывода:
1
3
6
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 5 строк.
•	Число в каждой новой строке должно быть больше предыдущего.
•	Выводимый текст должен соответствовать заданию.*/
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + i + 1;
            System.out.println(sum);
        }
    }
}

/* решение через массив
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
            System.out.println(sum);
        }
    }
}*/
