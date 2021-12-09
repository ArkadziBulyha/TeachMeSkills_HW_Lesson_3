import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int sizeMass = 0;
        int sizeMass2 = 0;

        do {
            System.out.print("Введите размер массива (от 6 и до 10 включительно): ");
            sizeMass = new Scanner(System.in).nextInt();
        } while (sizeMass < 6 || sizeMass > 10);

        Random random = new Random();

        int[] mass = new int[sizeMass];

        for (int i = 0; i < sizeMass; i++) {
            mass[i] = random.nextInt(0,100);
            if (mass[i]%2 == 0){
                sizeMass2++;
            }
        }

        int[] mass2 = new int[sizeMass2];

        for (int i = 0, j = 0; i < sizeMass; i++){
            if (mass[i]%2 == 0){
                mass2[j] = mass[i];

                System.out.print(mass2[j] + " ");
                j++;
            }
        }

    }
}
