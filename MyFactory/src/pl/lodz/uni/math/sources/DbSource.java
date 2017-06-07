package pl.lodz.uni.math.sources;

import java.util.ArrayList;
import java.util.List;

import pl.lodz.uni.math.domain.Person;
import pl.lodz.uni.math.factory.InterfaceFactory;

public class DbSource implements InterfaceFactory{
   
   private static InterfaceFactory instance = new DbSource();
   
   private DbSource() { System.out.println("DBdata");}
   
   public static InterfaceFactory getInstance() //singleton
   {
      return instance;
   }

   @Override
   public List<Person> getAllPersons() {
      List<Person> persons = new ArrayList<Person>();
      Person p1 = new Person("Bartek", 22, "30295019281");
      for (int i=0;i<5;i++)
      {
         persons.add(p1);
      }
      return persons;
   }

   @Override
   public Person getPersonById(int id) {
      Person p1 = new Person("Beta", 19, "49198294501");
      return p1;
      
   }
   
   
   
}
