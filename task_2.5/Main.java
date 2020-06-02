/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        String [] arr = {"Мама", "Мыла", "Раму"};
        System.out.println(arr[0]+arr[1]+arr[2]);
        System.out.println(arr[0]+arr[2]+arr[1]);
        System.out.println(arr[1]+arr[0]+arr[2]);
        System.out.println(arr[1]+arr[2]+arr[0]);
        System.out.println(arr[2]+arr[0]+arr[1]);
        System.out.println(arr[2]+arr[1]+arr[0]);
    }
}
