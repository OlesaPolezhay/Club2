import java.util.Scanner;

public class Club2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;
        int j = 1;

        for(int i = 0; i < n ; i ++){
            System.out.print(j + " ");
            sum += j;
            j +=2;
        }

        System.out.println("\nSum = " + sum);
    }
}
