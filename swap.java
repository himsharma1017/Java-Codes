import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your First Number.");
        int input1 = scan1.nextInt();

        System.out.println(" ");

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter your Second Number.");
        int input2 = scan2.nextInt();

        System.out.println(" ");

        int temp;
        temp = input1;
        input1 = input2;
        input2 = temp;

        System.out.println("The values after being swapped are, First Number is : " + input1 + " while the Second Number is : " + input2);

    }
    
}
