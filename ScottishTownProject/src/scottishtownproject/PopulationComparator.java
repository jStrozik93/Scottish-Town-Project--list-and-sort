
package scottishtownproject;

import java.util.Comparator;


public class PopulationComparator implements Comparator<Scotdata>
{

  public PopulationComparator() {}
    
    @Override
  public int compare(Scotdata sd1, Scotdata sd2)
   {
     return (int)(sd1.getPopulation()*100-sd2.getPopulation()*100);
   } 
}
