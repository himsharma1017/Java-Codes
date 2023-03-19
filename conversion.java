import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {

        int result;
        Scanner scan67 = new Scanner(System.in);
        System.out.println("Enter the value which you want to convert into different distance units.");
        int input22 = scan67.nextInt();
        scan67.close();

        System.out.println("\n");
        
        System.out.println("Choose among the given options in which you want to convert your Value.");
        System.out.println("CM to M : 1\n");
        System.out.println("M to KM : 2\n");
        System.out.println("KM to M : 3\n");
        System.out.println("M to CM : 4\n");

        Scanner scan77 = new Scanner(System.in);
        System.out.println("Enter your desired option");
        int input44 = scan77.nextInt();
        scan77.close();

        switch(input44){
            case 1: result = input22/100;
                    System.out.println("The desired result is : " + result + " Metre.");
                    break;
             
            case 2: result = input22/1000; 
                    System.out.println("The desired result is : " + result + " KiloMetre.");
                    break;
            
            case 3:  result = input22*1000;
                    System.out.println("The desired result is : " + result + " Metre.");
                    break;

            case 4:  result = input22*100;
                    System.out.println("The desired result is : " + result + " CentiMetre.");
                    break;

            default: System.out.println("Invalid option selected from the Menu");
                    break;
     
        }               

    }
        
}
