import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class inventory{
    
    public static void main(String[] args) {
        
        String[] name = new String[] {"Phone", "TV", "Tablet", "Refrigerator", "AC"};

        for(int i=0; i<name.length; i++){
            System.out.println("The product available in the Store currently is : " + name[i]);
        }

        System.out.println("\n");

        int[] count = new int[] {1, 2, 3, 4, 5};
        for(int i=0; i<count.length; i++){
            System.out.println("The quantity of " + name[i] + " present in the Store is : " + count[i]);
        }

        System.out.println("\n");

        String[] specs = new String[] {"30 Megapixel Camera", "AI Enabled Remote", "Smart Gestures",
                          "Super Deep Freeze", "Suitable to every weather"};

        int[] cost = new int[] {100, 200, 300, 400, 500};

        // for(int i=0; i<name.length; i++){
        //     for(int j=0; j<specs.length; j++){
        //         for(int k=0; k<cost.length; k++){
        //             for(int l=0; l<count.length; l++){
        //              System.out.println("The feature of " + name[i] +  " is " + specs[j] +  " with the pricing " + cost[k] + " Rupees ,and only " + count[l] + " present in the Store.");
        //             }
        //         }  
        //     }
        // }

        String[] updatedSpecs = new String[5];
        Scanner modified = new Scanner(System.in);
        String updated ;

        updated = modified.nextLine();

        for(int i=0; i<name.length; i++){
         System.out.println("Enter the Latest feature of " + name[i] + " : " + updated);
        }    
    }
}