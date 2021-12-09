public class Task5 {
    public static void main(String[] args) {

        int[] mass = new int[]{4, 8, 15, 16, 23, 42, 54, 45, 53, 69, 1};

        for(int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
            if(i%2 != 0){
                mass[i] = 0;
            }
        }
        System.out.println();
        for (int item : mass){
            System.out.print(item + " ");
        }
    }
}
