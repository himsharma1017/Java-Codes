import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class fileOperations {
    public static void main(String[] args) {
         
        // Write TRY and CATCH statements after reading the concept.

        System.out.println("Choose respective Number among the following options, which you want to perform!\n");
        System.out.println("Create a new folder : 1");
        System.out.println("Create a new text file : 2");
        System.out.println("Write into a text file : 3");
        System.out.println("Append data to a text file : 4");
        System.out.println("Rename a file : 5");
        System.out.println("Delete a File : 6");

        Scanner demand = new Scanner(System.in);
        int demand11 = demand.nextInt();

        char continue11;
        do{
            Case 1: try 
            {
                    System.out.println("Enter the path where you want to create a New Folder.");
                    Scanner objt = new Scanner(System.in);
                    int objtc = objt.next();

                    System.out.println("Enter the name of the desired Folder");
                    path = path+sc.next();  
                    //Instantiate the File class   
                    File f1 = new File(path);  
                    boolean bool = f1.mkdir(); 
                    System.out.println("Folder is created successfully"); 
                    f1.close(); 
            }    
            catch(Exception e1){
                     System.out.println("An exception has occured" + e1.getMessage());    
                
                    }  
 

            Case 2: try
                    {
                        Scanner input = new Scanner(System.in);
                        System.out.print("Enter the desired name of your file: ");
                        String fileName = input.nextLine();
                        fileName = fileName + ".txt";
                    
                        File file1 = new File(fileName);
                        boolean isFileCreated = file1.createNewFile();
                        file1.close();
                    }
                    catch(Exception e2){
                        System.out.println("An exception has occured" + e2.getMessage());    
                   
                       } 

            Case 3: 
                    try{
                        System.out.print("Enter the desired name of your file: ");
                        String fileName = input.nextLine();
                        fileName = fileName + ".txt";
                    
                        File file1 = new File(fileName);
                        boolean isFileCreated = file1.createNewFile();
                        PrintWriter out = new PrintWriter(file1);

                        Scanner input21 = new Scanner(System.in);
                        System.out.println("Enter the data to be entered into the file.");
                        String vlue = input21.nextLine();
                        file1.close();
                    }
                    catch(Exception e3){
                        System.out.println("An exception has occured" + e3.getMessage());    
                   
                       } 
                    
            Case 4: try
            {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the desired name of your file: ");
                String fileName = input.nextLine();
                fileName = fileName + ".txt";
                    
                File file1 = new File(fileName);
                boolean isFileCreated = file1.createNewFile();

                FileWriter fw = new FileWriterl(file1, true);
                System.out.println("Enter the data to be appended");
                Scanner input21 = new Scanner(System.in);
                String vlue = input21.nextLine();

                file1.close();
            }
            catch(Exception e4){
                System.out.println("An exception has occured" + e4.getMessage());    
            }

            Case 5: try
            {
                System.out.println("Enter the name of the File you want to rename");
                Scanner input21 = new Scanner(System.in);
                String oldname = input21.nextLine();

                if(oldName.renameTo(newName)) {
                System.out.println("renamed");
            }      
            else   {
                        System.out.println("Error");
                    }
            }
            catch(Exception e5){
                System.out.println("An exception has occured" + e5.getMessage());    
           
               }

            Case 6:  try
            {
                System.out.println("Enter the name of the File you want to delete");
                Scanner input21 = new Scanner(System.in);
                String file = input21.nextLine();

                if(file.delete())
                {
                    System.out.println(file + " is succesfully deleted");
                }
                else
                {
                    System.out.println("Process failed !");
                }
            }
            
            catch(Exception e6){
                System.out.println("An exception has occured" + e6.getMessage());    
           
               }

        }while(continue11=='Y' || continue11=='y')
    }
}
