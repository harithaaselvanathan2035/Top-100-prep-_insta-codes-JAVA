import java.util.Scanner;
class one{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number: ");
    int res = sc.nextInt();

    if(res > 0){
        System.out.println("It is positive");
    }

    else if(res<0){
        System.out.println("It is negative");
    }

    else{
        System.out.println("zero");
    }

}
}