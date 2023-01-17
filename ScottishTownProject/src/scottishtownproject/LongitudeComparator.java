/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scottishtownproject;

import java.util.Comparator;

/**
 *
 * @author asias
 */
public class LongitudeComparator implements Comparator<Scotdata>{

    @Override
public int compare(Scotdata sd1 , Scotdata sd2)  
  {
    return (int)(sd1.getLongitude()*1000 - sd2.getLongitude()*1000);
  }    
    
}
