import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.print("Хотите ввести размер массива вручную (Y): ");
        String choose = new Scanner(System.in).nextLine();

        int randSize = 0;

        if (choose.equals("Y") || choose.equals("y")) {
            System.out.print("Введите размер массива: ");
            randSize = new Scanner(System.in).nextInt();
        } else {
            Random random = new Random();
            randSize = random.nextInt(2, 21);
        }

        int maxRand = 21;

        int maxNum = 0;
        int minNum = maxRand;
        int sumNum = 0;
        int temp = 0;

        int[] mas = new int[randSize];

        System.out.print("Массив: ");
        for (int i = 0; i < randSize; i++) {
            mas[i] = (int) (Math.random() * maxRand);
            System.out.print(mas[i] + " ");
            sumNum = sumNum + mas[i];

            temp = mas[i];

            if (temp > maxNum) {
                maxNum = temp;
            }
            if (temp < minNum) {
                minNum = temp;
            }
        }
        System.out.println("\nМаксимальное число: " + maxNum);
        System.out.println("Минимальное число: " + minNum);
        System.out.println("Среднее значение массива: " + (double) sumNum / (double) mas.length);
    }
}