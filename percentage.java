import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the Total Marks of a Subject.");
        int total = scan1.nextInt();

        System.out.println(" ");

        System.out.println("Enter the Marks obtained by the Student");
        Scanner scan2 = new Scanner(System.in);
        int marks = scan2.nextInt();

        double percent = (marks*100)/total;
        System.out.println("The percentage obtained by the Student is : " + percent + " %");

        System.out.println(" ");

        // 31 - 59% - Grade F, GPA = 0.0
        // 60 - 69% - Grade D, GPA = 1.0
        // 70 - 79% - Grade C, GPA = 2.0
        // 80 - 89% - Grade B, GPA = 3.0
        // 90 - 100% - Grade A, GPA = 4.0

        if(percent>=31 && percent<=59){
            System.out.println("The Student has obtained Grade F and GPA = 0.0");
        }
        else if(percent>=60 && percent<=69){
            System.out.println("The Student has obtained Grade D and GPA = 1.0 ");
        }
        else if(percent>=70 && percent<=79){
            System.out.println("The Student has obtained Grade C and GPA = 2.0 ");
        }
        else if(percent>=80 && percent<=89){
            System.out.println("The Student has obtained Grade B and GPA = 3.0 ");
        }
        else if(percent>=90 && percent<=100){
            System.out.println("The Student has obtained Grade A and GPA = 4.0 ");
        }
        else{
            System.out.println("The Student has failed miserably and is good for nothing.");
        }
        
    }
    
}
