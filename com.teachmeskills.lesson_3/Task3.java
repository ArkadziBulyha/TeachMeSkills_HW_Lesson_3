public class Task3 {
    public static void main(String[] args) {

        int[] mass1 = new int[]{2, 6, 8, 13, 7};
        int[] mass2 = new int[]{2, 6, 8, 13, 7};

        int summMass1 = 0;
        int summMass2 = 0;

        double averMass1 = 0;
        double averMass2 = 0;

        for (int item : mass1) {
            summMass1 = summMass1 + item;
            System.out.print(item + " ");
        }
        averMass1 = (double) summMass1 / (double) mass1.length;
        System.out.println("\nCреднее значение: " + averMass1);

        for (int item : mass2) {
            summMass2 = summMass2 + item;
            System.out.print(item + " ");
        }
        averMass2 = (double) summMass2 / (double) mass2.length;
        System.out.println("\nCреднее значение: " + averMass2);

        if (averMass1 > averMass2) {
            System.out.println("Cреднее арифметическое значение больше у первого массива");
        }else if (averMass1 < averMass2){
            System.out.println("Cреднее арифметическое значение больше у второго массива");
        }else {
            System.out.println("Cреднее арифметическое значение у обоих массивов одинаковое");
        }
    }
}
