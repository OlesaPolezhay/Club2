public class Club2_3 {
    public static void main(String[] args) {
        int a = 1;
        boolean check = true;
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                check = false;
            }
        }

        if(check){
            System.out.println("Число просте");
        }
        else {
            System.out.println("Число не просте");
        }
    }
}
