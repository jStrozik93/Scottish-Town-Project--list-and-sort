package scottishtownproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author duncan
 */

public class WriteToTextFile 
 {

    public WriteToTextFile() {}
   
    public void  WriteData(Scotdata[] cd , String filename)
    
    {
      File myFile = new File(filename);
      
      try
      {
        FileWriter fw = new FileWriter(myFile);
        BufferedWriter buffer = new BufferedWriter(fw);

        if(cd.length==0)
         {
          buffer.write("No Data available");
         }
        else
         {
          for(Scotdata sd :cd )
           { 
            // System.out.println("Data "+chess.toString());  
             buffer.write(sd.toString()); 
           }
         }
        buffer.flush();
        buffer.close();
        System.out.println("Data written to disc ");
       
       }
      catch(IOException e)
       {
        System.out.println("An Error has occurred");
       }
     }
    
 }
