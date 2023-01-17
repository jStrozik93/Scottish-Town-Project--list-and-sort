
package scottishtownproject;


/**
 *
 * @author duncan
 */
public class BubbleSortComparable 
{

 public BubbleSortComparable() {}
  
  public void bubbleSort(Comparable[] array)  
  {
    int last;
    int index;
    Comparable temp;
    
    for(last=array.length-1; last >=0; last--)
     {
      for(index =0; index < last; index++)
       {
          if( array[index].compareTo(array[index+1])>0 )
           {
             temp           = array[index];
             array[index]   = array[index+1];
             array[index+1] = temp;
           }   
       }    
     }    
  }
    
  public void displayArray(Comparable[] array, String message) 
   {
    System.out.println("\n =========== "+message+ "==============\n");
    for(int k=0; k<array.length; k++)   
     {
       System.out.println(array[k]); 
     }
       
   }


    
    
}

