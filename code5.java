
import java.util.Scanner;

class five{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num for a : ");
        int a = sc.nextInt();
        System.out.println("Enter the num for b : ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println("A is greatest");
        }
        else{
            System.out.println("B is greatest");
        }

    }
}