import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        
        Scanner scan9 = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int inpt = scan9.nextInt();
        scan9.close();
        System.out.println();

        Scanner scan8 = new Scanner(System.in);
        System.out.println("Enter the Second Number : ");
        int inpt1 = scan8.nextInt();
        scan8.close();   
        System.out.println(); 
        
        Scanner scan7 = new Scanner(System.in);
        System.out.println("Enter the Third Number : ");
        int inpt2 = scan7.nextInt();
        scan7.close();
        System.out.println();

        if(inpt>inpt1 && inpt>inpt2){
            System.out.println(" The greatest among all the three Numbers is : " + inpt);
             break;
        }    

        else if(inpt1>inpt && inpt1>inpt2){
            System.out.println(" The greatest among all the three Numbers is : " + inpt1);
            break;
        } 
        
        else if(inpt2>inpt && inpt2>inpt1){
            System.out.println(" The greatest among all the three Numbers is : " + inpt2);
            break;
        }
    

        int average = (inpt+inpt1+inpt2)/3;
        System.out.println(" The average of all 3 Numbers is " + average);

    }
    
}
