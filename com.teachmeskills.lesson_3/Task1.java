import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] numMas = new int[]{4, 8, 15, 16, 23, 42, 4, 4, 6, 228, 3, 8};
        int count = 0;

        System.out.print("Введите число: ");
        int num = new Scanner(System.in).nextInt();

        for (int i = 0; i < numMas.length; i++) {
            if (numMas[i] == num) {
                count++;
            }
        }

        int[] numMas2 = new int[numMas.length - count];

        if (count == 0) {
            System.out.println("\nЧисло " + num + " не входит в массив");
        } else {
            for (int i = 0, j = 0; i < numMas.length; i++) {
                if (numMas[i] != num) {
                    numMas2[j] = numMas[i];
                    System.out.print(numMas2[j] + " ");
                    j++;
                }
            }
            System.out.println("\nРазмерность нового массива = " + numMas2.length);
        }
    }
}
