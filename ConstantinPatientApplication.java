
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class ConstantinPatientApplication
{
   public static void main(String [] args) throws Exception
   {
      ConstantinPatientCollectionList Constantincollection = new ConstantinPatientCollectionList();
      ConstantinPatientQueue Constantinqueue = new ConstantinPatientQueue();
      ConstantinBST tree = new ConstantinBST();
      BufferedReader reader;
     
     try{
      reader = new BufferedReader(new FileReader("database.txt"));
      
      String line = reader.readLine();
      while(line != null)
      {
        String [] a = line.split(",");
        for(int i =0; i< a.length; i++)
         
        line = reader.readLine();
        Scanner kb = new Scanner(System.in);
      
      //Construction of objects is made in this way just to show the functionality of the application
      
         ConstantinPatient patient1 = new ConstantinPatient(a[0],a[1],a[2],a[3],a[4],a[5]);
         ConstantinPatient patient2 = new ConstantinPatient(a[6],a[7],a[8],a[9],a[10],a[11]);
         ConstantinPatient patient3 = new ConstantinPatient(a[12],a[13],a[14],a[15],a[16],a[17]);
         ConstantinPatient patient4 = new ConstantinPatient(a[18],a[19],a[20],a[21],a[22],a[23]);
         ConstantinPatient patient5 = new ConstantinPatient(a[24],a[25],a[26],a[27],a[28],a[29]);
        
         int k = Integer.parseInt(a[30]);
         int j = Integer.parseInt(a[31]);
         int m = Integer.parseInt(a[32]);
        
         ConstantinPatient patient6 = new ConstantinPatient(k);
         ConstantinPatient patient7 = new ConstantinPatient(j);
         ConstantinPatient patient8 = new ConstantinPatient(m);
         Constantincollection.add(patient1);
         Constantincollection.add(patient2);
         Constantincollection.add(patient3);
         Constantincollection.add(patient4);
         Constantincollection.add(patient5);
            
         Constantinqueue.enqueue(patient1);
         Constantinqueue.enqueue(patient2);
         Constantinqueue.enqueue(patient3);
         Constantinqueue.enqueue(patient4);
         Constantinqueue.enqueue(patient5);
         
         tree.insert(patient6);
         tree.insert(patient7);
         tree.insert(patient8);
         
         
                     
            String first = "";
            
            System.out.println("Good afternoon! Let`s see how we can help you."); 
            System.out.println();
            System.out.println("Type P if you are using our application as a patient, or type D if you are a Medical Professional");
            System.out.println();

            first = kb.nextLine();
            
            if(first.equals("P")){
            
            
                  String inputName = "";
                  String inputYear = "";
                  System.out.println("Enter your name: ");
                  inputName = kb.nextLine();
                  
                  
                  if(inputName.equals( a[0])){
                     System.out.println("Hello Mr. "+ patient1.toString());
                     System.out.println("Please confirm your year of birth by entering and you are all set.");
                     inputYear = kb.nextLine();
                        if(inputYear.equals(a[5]))
                           System.out.println("You are all set. See you soon");
                        else
                           System.out.println("It looks like there has been a mistake. Please contact us at 773-243-8888 to verify your date of birth, please");
                  } 
                  if(inputName.equals( a[6])){
                     System.out.println("Hello Ms. "+ patient2.toString());
                     System.out.println("Please confirm your year of birth by entering and you are all set.");
                     inputYear = kb.nextLine();
                        if(inputYear.equals(a[11]))
                           System.out.println("You are all set. See you soon");
                        else
                            System.out.println("It looks like there its been a mistake. Please contact us at 773-243-8888 to verify your date of birth, please");
                  }  
                  else if(inputName.equals( a[12])){
                     System.out.println("Hello Mr. "+patient3.toString());
                     System.out.println("Please confirm your year of birth by entering and you are all set.");
                     inputYear = kb.nextLine();
                        if(inputYear.equals(a[17]))
                           System.out.println("You are all set. See you soon");
                        else
                           System.out.println("It looks like there its been a mistake. Please contact us at 773-243-8888 to verify your date of birth, please");
                  }  
      
                  else if(inputName.equals( a[18])){
                                 System.out.println("Hello Mr. "+ patient4.toString());
                                 System.out.println("Please confirm your year of birth by entering and you are all set.");
                                 inputYear = kb.nextLine();
                                    if(inputYear.equals(a[23]))
                                       System.out.println("You are all set. See you soon");
                                    else
                                       System.out.println("It looks like there its been a mistake. Please contact us at 773-243-8888 to verify your date of birth, please");
                              }  
                  
                  else if(inputName.equals( a[24])){
                                 System.out.println("Hello Mr. "+ patient5.toString());
                                 System.out.println("Please confirm your year of birth by entering and you are all set.");
                                 inputYear = kb.nextLine();
                                    if(inputYear.equals(a[29]))
                                       System.out.println("You are all set. See you soon");
                                    else
                                       System.out.println("It looks like there its been a mistake. Please contact us at 773-243-8888 to verify your date of birth, please");
                              }  
                  else
                     System.out.println("We appologize, you do not have an appoinment today with any of our doctors. Please call 773-243-8888 to make an appoinment");  
                     
      }  
      if(first.equals("D"))
      { 
         System.out.println("Welcome back Doctor! Here is a list with possible opperations that you might be interested in: " );
         System.out.println("Type 1 for having a list with all the patiens that you have to see today: ");
         System.out.println("Type 2 for having the list sorted in alphabetical order: ");
         System.out.println("Type 3 to search for a specific patient and details about him: ");
         System.out.println("Type 4 to see the number of all patients you have schedueled: ");
         System.out.println("Type 5 to see the order the patients are schedueled and who is the first one and following it: ");
         System.out.println("Type 6 to see the if we have a patient by its insurance policy number: ");
         System.out.println("Type 7 to see which policy number of which patient covers the biggest amount of money: ");

         String inputOpe = ""; 
         inputOpe = kb.nextLine();  
                  
         
      
         if(inputOpe.equals("1"))
            Constantincollection.print();
         else if(inputOpe.equals("2")){
            Constantincollection.sort();
            Constantincollection.print();
         }
         else if(inputOpe.equals("3")){
            System.out.println("Is John registered at our clinic?");
            System.out.println(Constantincollection.contains(patient1));
         }
         else if(inputOpe.equals("4"))
            System.out.println(Constantincollection.size());
         else if(inputOpe.equals("5"))
            System.out.println(Constantinqueue.dequeue());
         else if(inputOpe.equals("6")){
            System.out.println("Is the patient whose policy no. is "+ a[30] +" registered at our clinic?");
            System.out.println(tree.search(patient6)); 
          }  
          else if(inputOpe.equals("7")){
            System.out.println("Which policy patient is the most valuable? Displayed are from the most to the least:");
            tree.preOrder(); 
          }  

          
      
        }
            
      }
     }
     catch(IOException e)
     {
        System.out.println("Data base inexistent or have not been found.");
        System.out.println("Here is a list with more details about this Exception:");
        System.out.println();
        System.out.println();
         e.printStackTrace();
     }
 
      
   }
}