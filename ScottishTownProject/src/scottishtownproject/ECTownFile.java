
package scottishtownproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.text.NumberFormat;
import java.text.DecimalFormat;


public class ECTownFile 

{

  public ECTownFile() 
   {
        
    
   }
     
    
   public Scotdata[] getArray(String filename)
    {
      File myFile = new File(filename) ; 
      NumberFormat nf = new DecimalFormat("#0.00");
      ArrayList<Scotdata> arrList = new ArrayList<>();
      
      
      try 
       {
         FileReader fr = new FileReader(myFile);  
         BufferedReader br = new BufferedReader(fr);
         
         String data="";
         int number;
         
         while((data = br.readLine())!= null)
          {
            StringTokenizer  st = new  StringTokenizer(data,",");
            
            while(st.hasMoreTokens())
             {

               Scotdata sd = new Scotdata();
                
                sd.setLocation(st.nextToken().trim());
                sd.setPopulation(Integer.parseInt(st.nextToken().trim()));
                sd.setStatus(st.nextToken().trim());
                sd.setCouncil(st.nextToken().trim());
                sd.setPopvalue(Double.parseDouble(st.nextToken().trim()));  
                sd.setLongitude(Double.parseDouble(st.nextToken().trim()));  
                sd.setLatitude(Double.parseDouble(st.nextToken().trim()));  
                arrList.add(sd);

             }
          }
         br.close();
         
         
       } 
      catch (IOException e) 
       {
         System.out.println("Error loading file"); 
       }
      
       // Use iterator to display contents of arrList
      System.out.print("Original contents of arrList: ");
      Iterator itr = arrList.iterator();
      
      System.out.println();
     
      while(itr.hasNext()) 
       {
        Object element = itr.next();
        System.out.print(element + " \n");
       }
      System.out.println();
      

      System.out.println("number on file is "+arrList.size());
      Scotdata myArray[] = new Scotdata[arrList.size()];
      myArray = arrList.toArray(myArray);
      
      Scotdata[] result = new Scotdata[myArray.length];
      for (int k = 0; k < myArray.length; k++) 
       {
	 result[k] = myArray[k];
       }

      return result;

    }

    public void displayArray(Scotdata[] array, String message) 
     {
      System.out.println(message);
      System.out.println("****************************************************");
     
      for(int k = 0; k<array.length; k++)
       {
         System.out.println(array[k]); 
       }
      System.out.println("\n\n");  
      System.out.println("*****************************************************\n\n");   
     }  

}
