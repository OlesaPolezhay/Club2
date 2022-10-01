public class Club2_4 {
    public static void main(String[] args) {
        int []mas = new int[20];
        mas [0] = mas[1] = 1;
        for (int i = 2; i < 20; i++){
            mas[i] = mas[i-1] + mas[i -2];
        }

        int average = 0;

        for (int i =0; i < 20; i++){
            average += mas[i];
            System.out.print(mas[i] + " ");
        }

        System.out.println("\nEverage = " + (double)average/20);
    }
}
