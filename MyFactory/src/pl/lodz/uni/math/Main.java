package pl.lodz.uni.math;

import pl.lodz.uni.math.factory.Factory;
import pl.lodz.uni.math.factory.Source;

public class Main {

   public static void main(String[] args) {
    
      Factory factory=new Factory();
      
      factory.setSource(Source.DB);
      factory.getPersonByID(10);
      
      factory.setSource(Source.XML);
      factory.getPersonByID(10);

   }

}
