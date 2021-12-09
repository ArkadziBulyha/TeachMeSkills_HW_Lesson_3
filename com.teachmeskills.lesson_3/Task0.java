import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        int[] numMas = new int []{ 4, 8, 15, 16, 23, 42};
        int temp = 0;

        System.out.print("Введите число для проверки: ");
        int num = new Scanner(System.in).nextInt();

        for(int i = 0; i < numMas.length; i++){
            if(numMas[i] == num){
                System.out.println("Число " + num + " входит в массив");
                temp = 1;
            }
        }
        if(temp != 1){
            System.out.println("Число " + num + " не входит в массив");
        }
    }
}