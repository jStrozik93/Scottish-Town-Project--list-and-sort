
package scottishtownproject;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.Comparator;
import java.util.Objects;


public class Scotdata implements Comparable<Scotdata>, Comparator<Scotdata>
{
  private String location; 
  private int population;
  private String status;
  private String council;
  private double popvalue;
  private double longitude;
  private double latitude;
 
  public Scotdata() {}



    public Scotdata(String location, int population, 
                    String status, String council, 
                    double popvalue, double 
                    longitude, double latitude) 
    {
        this.location = location;
        this.population = population;
        this.status = status;
        this.council = council;
        this.popvalue = popvalue;
        this.longitude = longitude;
        this.latitude = latitude;
    }

  


    @Override
    public String toString() 
    {
        String f1 ;
        String f2 ;
        String f3 ;
        String f4 ;
        String f5 ;
        String f6 ;
        String f7 ;
        NumberFormat nf = new DecimalFormat("#0.00");
  
        
        f1 = String.format("%-16s",this.getLocation());
        f2 = String.format("%-7s",this.getPopulation());
        f3 = String.format("%-5s",this.getStatus());
        f4 = String.format("%-22s",this.getCouncil());
        f5 = String.format("%-6s",nf.format(this.getPopvalue()));
        f6 = String.format("%-6s",nf.format(this.getLongitude()));
        f7 = String.format("%-6s",nf.format(this.getLatitude()));
            
        String result = "location "+f1+" population "+f2+" status "+f3
                         +" council " + f4 + " popvalue "+f5
                         +" longitude "+f6 +" latitude "+f7; 

        return result;
     
    }


    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public int getPopulation() {return population; }

    public void setPopulation(int population) {this.population = population;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public String getCouncil() {return council;}

    public void setCouncil(String council) {this.council = council;}

    public double getPopvalue() {return popvalue;}

    public void setPopvalue(double popvalue) {this.popvalue = popvalue;}

    public double getLatitude() {return latitude;}

    public void setLatitude(double latitude) {this.latitude = latitude;}

    public double getLongitude() {return longitude;}

    public void setLongitude(double longitude) {this.longitude = longitude;}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.location);
        hash = 53 * hash + this.population;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scotdata other = (Scotdata) obj;
        if (this.population != other.population) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }
  @Override
  public int compare(Scotdata sd1, Scotdata sd2)
    {
      return sd1.getLocation().compareTo(sd2.getLocation());
    }
    

   @Override
    public int compareTo(Scotdata sd) {
        String str5;
        String str6;
     String str1 = this.getCouncil();
     String str2 = sd.getCouncil();
      int num1 = this.getPopulation();
      int num2 = sd.getPopulation();
      
      String str3 = String.format("%07d", num1);
      String str4 = String.format("%07d", num2);
    
     str5= str1.concat(str3);
     str6= str2.concat(str4);
     return str5.compareTo(str6);

     
    }}

//    @Override
//    public int compare(Scotdata sd1, Scotdata sd2) {
//    return (int)(sd1.getLatitude()*1000 - sd2.getLatitude()*1000);    }
//       
//}