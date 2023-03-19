import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
         
        Scanner scanned = new Scanner(System.in);
        System.out.println("Enter the number you want to check whether it is Prime Number or not.");
        int select = scanned.nextInt();
        scanned.close();

        System.out.println();

        if(select%2==0){
            System.out.println("The Number " + select + " is NOT a Prime Number.");
        }
        else{
            System.out.println("The Number " + select + " is a Prime Number.");
        }
    }
    
}
