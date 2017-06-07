package pl.lodz.uni.math.sources;

import java.util.ArrayList;
import java.util.List;

import pl.lodz.uni.math.domain.Person;
import pl.lodz.uni.math.factory.InterfaceFactory;

public class WsSource implements InterfaceFactory{

   private static InterfaceFactory instance = new WsSource();
   
   private WsSource(){
      System.out.println("WSdata");      //moze tak chyba zostac
   }
   
   public static InterfaceFactory getInstance() //singleton
   {
      return instance;
   }
   
   @Override
   public List<Person> getAllPersons() {
      List<Person> persons = new ArrayList<Person>();
      Person p1 = new Person("Dominik", 22, "92863209876");
      for (int i=0;i<5;i++)
      {
         persons.add(p1);
      }
      return persons;
   }

   @Override
   public Person getPersonById(int id) {
      Person p1 = new Person("Sebastian", 19, "12340987560");
      return p1;
      
   }
}
