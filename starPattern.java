import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        
        int i, j;
        Scanner scan12 = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = scan12.nextInt();

        for(i=0; i<=row-1; i++){
            for(j=0; j<=i; j++){
                System.out.println("*" + " ");
            }
            System.out.println();
        }

        for(i=row-1; i>=0; i--){
            for(j=0; j<=i-1; j++){
            System.out.println("*" + " ");
            }
            System.out.println();
        }
    }
    
}
