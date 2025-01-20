import java.util.Scanner;
class two{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number: ");
int num = sc.nextInt();
if(num % 2 == 0){
    System.out.println("It is even number");
}
else{
    System.out .println("It is odd number");
}

}
}