import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class projectCode {  
    public static void main(String[] args) {  
        String line = "";  
        String splitBy = ",";  
        try{  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("Patient.csv"));  
            while ((line = br.readLine()) != null) {   //returns a Boolean value   
                String[] patient = line.split(splitBy);    // use comma as separator 
                //The lines below convert the string to interger to compare to see if a lower rating was given
                int a = Integer.parseInt(patient[1]);
                int b = Integer.parseInt(patient[2]);
                int c = Integer.parseInt(patient[3]);
                if((a<=3)||(b<=3)||(c<=3)){
                    System.out.println("Patient Number: " + patient[0] + ", WaitTime: " + patient[1] + ", Cleaness: " + patient[2] + ", Behavbiour: " + patient[3] + ", comments: " + patient[4]);  
                } 

            }  
        }   
        
        catch (IOException e) {  
            e.printStackTrace();  
        }     
    }  
}  