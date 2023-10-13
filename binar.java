import java.util.Arrays;
import java.util.Scanner;

public class binar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shirina = 30;

        int[] massiv = new int[shirina];

        System.out.println("Введите числа для массива:");

        for (int ch = 0; ch < shirina; ch++) {
            massiv[ch] = scanner.nextInt();
        }

        System.out.print("Введите число для поиска: ");
        int key = scanner.nextInt();

        int index = Arrays.binarySearch(massiv, key);

        if (index >= 0) {
            System.out.println("Число " + key + " найдено в массиве на позиции " + index);
        } else {
            System.out.println("Число " + key + " не найдено в массиве");
        }
    }
}