package pl.lodz.uni.math;

import pl.lodz.uni.math.factory.Factory;
import pl.lodz.uni.math.factory.Source;

public class Main
{

   public static void main(String[] args)
   {
    
      Factory factory=new Factory();
      
      factory.setSourceOfData(Source.DB);
      factory.selectUserById(1);
      factory.selectAllPersons();
      
      factory.setSourceOfData(Source.XML);
      factory.selectUserById(1);
      factory.selectAllPersons();

      factory.setSourceOfData(Source.WS);
      factory.selectUserById(1);
      factory.selectAllPersons();
   }

}
