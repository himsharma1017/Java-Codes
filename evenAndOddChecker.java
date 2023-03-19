import java.util.Scanner;

public class evenAndOddChecker {
    public static void main(String[] args) {
        char input11;
        do{
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Number.");
        int input = scan.nextInt();
        System.out.println(" ");
        scan.close();

        if(input%2==0){
            System.out.println("The Entered Number " + input + " is EVEN Number.");
        }
        else{
            System.out.println("The Entered Number " + input + " is ODD Number.");
        }
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Do you want to Continue ? Press Y for yes or N for No.");
        input11 = scan1.next().charAt(0);
        scan1.close();
        }
        while((input11 =='y' || input11 =='Y'));
    }   
}
