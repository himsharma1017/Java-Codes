import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number whose Multplication table you want to print.");
        int input = scan.nextInt();
        
        System.out.println(" ");
        for(int i=1; i<=10; i++){
            int res = input*i;
            System.out.println(input+ "*" + i + " = " + res);
        }
    }
    
}
