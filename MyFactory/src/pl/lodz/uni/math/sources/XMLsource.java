package pl.lodz.uni.math.sources;

import pl.lodz.uni.math.domain.Person;
import pl.lodz.uni.math.factory.Interfacefactory;

public class XMLsource implements Interfacefactory{
   
   private static XMLsource instance = new XMLsource();
   
   private XMLsource(){
      System.out.println("XMLdata");
   }
   
   public static XMLsource getInstance()  //singleton
   {
      return instance;
   }

   @Override
   public Person getAllPersons() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public Person getPersonById() {
      // TODO Auto-generated method stub
      
   }
   
   
   
   
}
