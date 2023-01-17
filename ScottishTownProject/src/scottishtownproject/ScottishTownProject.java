
package scottishtownproject;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class ScottishTownProject 
{
 
    public static void main(String[] args) 
    {
       ECTownFile ecf = new ECTownFile();
       System.out.println("=================== Scottish Town Data ================\n");
       
       Scotdata[] sd = ecf.getArray("ScottishTownData2021.txt"); 
       DataCheck dc     = new DataCheck();
       WriteToTextFile w = new WriteToTextFile();
       System.out.println("=============== End of Scottish Town Data =============\n");
       BubbleSortComparable bsc = new BubbleSortComparable();
       MergeSort mSort = new MergeSort();
       BubbleSort bs = new BubbleSort();
       CouncilComparator cc = new CouncilComparator();
       LongitudeComparator lc = new LongitudeComparator();
       SequentialSearcher seq = new SequentialSearcher();
       SequentialSearchString city = new SequentialSearchString();
        
       bsc.bubbleSort(sd);
       bsc.displayArray(sd, "==========This data is sorted by Council and Population.========");
       w.WriteData(sd, "Council Population.");
      dc.checkSort(sd);
     
      
     

     bs.bubbleSort(sd,lc);
     bs.displayArray(sd, "=============This data is sorted by Latitude and Longitude.==============");
     w.WriteData(sd, "LatitudeLongitude.");
     dc.checkSort(sd);
        System.out.println("Marge Sorting Council and then Population.");
       mSort.mergeSort(sd,cc);
      
     
    for( Scotdata data : sd)
       {
       
        System.out.print(data + " \n");
       }
      System.out.println();
      
    
    
    System.out.println("Marge Sorting Latitude and then Longitude.");
     
        mSort.mergeSort(sd,lc);
      
     
    for( Scotdata data : sd)
       {
       
        System.out.print(data + " \n");
       }
      System.out.println();
        System.out.println("Sorted by Location");
        
       bsc.bubbleSort(sd);
        bsc.displayArray(sd, "==========This data is sorted by Council and Population.========");
     Scanner sc = new Scanner(System.in);
           int data;
      System.out.println("Enter population number ");
      data = sc.nextInt();
       
      System.out.println("Data is : "+data);
      
      int position = seq.search(sd, data);
      
      if(position >=0)
      { 
          System.out.println(data + " Found at position "+position);
          System.out.println(sd[position]);
      }
      else
      {
       System.out.println("No value found matching "+data);
      }
      
     System.out.println("\n=================================\n\n");

  
       
//      System.out.println("Data is : "+data1);
//      
//      int position = city.search(sd,"Edinburgh");
//      
//      if(position >=0)
//      { 
//          System.out.println(data1 + " Found at position "+position);
//          System.out.println(sd[position]);
//      }
//      else
//      {
//       System.out.println("No value found matching "+data1);
//      }
//      
    System.out.println("\n=================================\n\n");
     LocationComparator cityCom = new LocationComparator();
 bs.bubbleSort(sd,cityCom);
        bsc.displayArray(sd, "==========This data is sorted by Location.========");
      w.WriteData(sd, "Location.");
 Scanner sc1 = new Scanner(System.in);
         String data1;
         System.out.println("Insert Location to use binary search: ");
      System.out.println("Enter name of location ");
      data1 = sc1.nextLine();       
     BinarySearch bSearch = new BinarySearch();

       
 int position1 = bSearch.search(sd,data1);
       
       if(position1 >=0)
        {
          System.out.println(sd[position1].getLocation()+" found at position "+position1);  
       }
       else
          {
          System.out.println(" Not found !!");  
       }  
//     
//       PopulationComparator popCom = new PopulationComparator();
//        bs.bubbleSort(sd,cityCom);
//       bsc.displayArray(sd, "==========This data is sorted by Population.========");
//       int position = bSearch.search(sd,data);
//       
//       if(position >=0)
//        {
//           System.out.println(sd[position].getLocation()+" found at position "+position);  
//        }
//       else
//          {
//           System.out.println(" Not found !!");  
//        }  
       
    }
      
  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

