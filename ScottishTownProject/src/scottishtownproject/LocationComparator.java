package scottishtownproject;

import java.util.Comparator;



public class LocationComparator implements Comparator<Scotdata>
{

  public LocationComparator() {}
  
  @Override
  public int compare(Scotdata sd1, Scotdata sd2)
   {
     return sd1.getLocation().compareTo(sd2.getLocation());
   }
}
