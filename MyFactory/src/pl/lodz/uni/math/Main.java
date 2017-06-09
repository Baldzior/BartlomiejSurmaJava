package pl.lodz.uni.math;

import pl.lodz.uni.math.factory.Factory;
import pl.lodz.uni.math.factory.Source;

public class Main {

   public static void main(String[] args) {
    
      Factory factory=new Factory();
      
      factory.setSource(Source.DB);
      System.out.println(factory.getPersonById(10).getName()); 
      System.out.println(factory.getAllPersons().get(2).getName());
      
      factory.setSource(Source.XML);
      System.out.println(factory.getPersonById(10).getName());
      System.out.println(factory.getAllPersons().get(2).getName());

      factory.setSource(Source.WS);
      System.out.println(factory.getPersonById(10).getName());
      System.out.println(factory.getAllPersons().get(2).getName());
   }

}
