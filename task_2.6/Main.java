/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            int j = 0;
            for (int count = 0; count < 10; count++) {
                j = j + i;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
