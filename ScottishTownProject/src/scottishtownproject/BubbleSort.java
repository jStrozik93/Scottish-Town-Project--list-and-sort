package scottishtownproject;

import java.util.Comparator;

/**
 *
 * @author duncanwalker
 */
public class BubbleSort 
{
  
  public BubbleSort() {}
  
  public void bubbleSort(Comparator[]array, Comparator comp1)
  {
    int last;
    int index;
    Comparator temp;
    long swap = 0;
    long comparison = 0;
    
    for(last=array.length-1; last >=0; last--)
    {
      for(index=0;index<last;index++)
      {
        comparison++;
        if(comp1.compare(array[index],array[index+1])>0)
        {
         swap++;
         temp           = array[index];
         array[index]   = array[index+1];
         array[index+1] = temp ; 
        }   
      }
    }
    
      System.out.println("number of comparisons "+comparison);
      System.out.println("number of swaps       "+swap);}
        public void displayArray(Comparator[]array, String message) 
   {
    System.out.println("\n =========== "+message+ "==============\n");
    for(int k=0; k<array.length; k++)   
     {
       System.out.println(array[k]); 
     }
    
  }
 
}
