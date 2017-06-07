package pl.lodz.uni.math.sources;

import java.util.ArrayList;
import java.util.List;

import pl.lodz.uni.math.domain.Person;
import pl.lodz.uni.math.factory.InterfaceFactory;

public class XmlSource implements InterfaceFactory
{
   private static InterfaceFactory instance = new XmlSource();
   
   List<Person> persons = new ArrayList<Person>();
   Person p1 = new Person("Kacper0", 22, "30295019281");
   Person p2 = new Person("Kacper1", 22, "30295019281");
   Person p3 = new Person("Kacper2", 22, "30295019281");
   
   private XmlSource()
   {
      System.out.println("*** XMLdata ***");
      persons.add(p1);
      persons.add(p2);
      persons.add(p3);
   }
   
   public static InterfaceFactory getInstance()
   {
      return instance;
   }

   @Override
   public void selectAllPersons()
   {
      for (Person person : persons)
      {
         System.out.println(person.getName());
      }
      System.out.print("\n");
   }
      

   @Override
   public void selectUserById(int id)
   {
      System.out.println(persons.get(id).getName());
   }  
}
