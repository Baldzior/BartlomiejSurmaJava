package pl.lodz.uni.math.factory;

import java.util.HashMap;
import java.util.List;

import pl.lodz.uni.math.domain.Person;
import pl.lodz.uni.math.sources.DbSource;
import pl.lodz.uni.math.sources.XmlSource;

public class Factory implements InterfaceFactory {

   HashMap<Source, InterfaceFactory > hm = new HashMap<>();
   {
      hm.put(Source.DB, DbSource.getInstance());
      hm.put(Source.XML, XmlSource.getInstance());
   }
   
   InterfaceFactory factory = null;
   
   public void setSource(Source name)
   {
      factory = hm.get(name);
   }

   @Override
   public List<Person> getAllPersons() {
      // TODO Auto-generated method stub
      return factory.getAllPersons();
   }

   @Override
   public Person getPersonById(int id) {
      // TODO Auto-generated method stub
      return factory.getPersonById(id);
   }

}
