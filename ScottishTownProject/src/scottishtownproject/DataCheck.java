package scottishtownproject;

/**
 *
 * @author duncanwalker
 */

public class DataCheck 
{

  public DataCheck() { }
    
 public void checkSort(Comparable[]array)
   {
    boolean sorted = true;
    
    for(int k=0; k<array.length-1; k++)
     {
      if(array[k].compareTo(array[k+1])>0)
      {
        sorted = false;  
      }
     }
    
    System.out.println("\n===============================================\n");
    if(sorted)
     {
        System.out.println("Array is sorted ");  
     }
    else
     {
       System.out.println("Array is NOT sorted ");  
     }   
     System.out.println("\n===============================================\n");  
   }   
  
 
 public void displayData(Comparable[] values,String message)
  {
    System.out.println("\n========== " + message + " ============\n");
    for(int k=0; k<values.length; k++)
     {
      System.out.println(values[k]+", "); 
     }
    System.out.println("\n===================================\n");
 }
  
}
