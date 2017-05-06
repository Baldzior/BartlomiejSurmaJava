package pl.lodz.uni.math.sources;

import java.util.List;

import pl.lodz.uni.math.domain.Person;
import pl.lodz.uni.math.factory.Interfacefactory;

public class DBsource implements Interfacefactory{
   
   private static DBsource instance = new DBsource();
   
   private DBsource(){
      System.out.println("DBdata");
   }
   
   public static DBsource getInstance()  //singleton
   {
      return instance;
   }

   @Override
   public List<Person> getAllPersons() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public Person getPersonById() {
      // TODO Auto-generated method stub
      
   }
   
   
   
}
