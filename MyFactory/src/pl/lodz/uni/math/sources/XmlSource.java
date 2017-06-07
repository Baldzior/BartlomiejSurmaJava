package pl.lodz.uni.math.sources;

import java.util.ArrayList;
import java.util.List;

import pl.lodz.uni.math.domain.Person;
import pl.lodz.uni.math.factory.InterfaceFactory;

public class XmlSource implements InterfaceFactory{
   
   private static InterfaceFactory instance = new XmlSource();
   
   private XmlSource(){
      System.out.println("XMLdata");      //moze tak chyba zostac
   }
   
   public static InterfaceFactory getInstance()   //singleton
   {
      return instance;
   }

   @Override
   public List<Person> getAllPersons() {
      List<Person> persons = new ArrayList<Person>();
      Person p1 = new Person("Ania", 55, "12345678901");
      for (int i=0;i<5;i++)
      {
         persons.add(p1);
      }
      return persons;
   }
      

   @Override
   public Person getPersonById(int id) {
      Person p1 = new Person("Krzysztof", 25, "09876543210");
      return p1;
   }
   
   
   
   
}
