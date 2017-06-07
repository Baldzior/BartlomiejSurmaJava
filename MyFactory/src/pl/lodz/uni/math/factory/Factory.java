package pl.lodz.uni.math.factory;

import java.util.HashMap;
import java.util.List;

import pl.lodz.uni.math.domain.Person;
import pl.lodz.uni.math.sources.DbSource;
import pl.lodz.uni.math.sources.WsSource;
import pl.lodz.uni.math.sources.XmlSource;

public class Factory implements InterfaceFactory
{
   HashMap<Source, InterfaceFactory> hm = new HashMap<>();
   {
      hm.put(Source.DB, DbSource.getInstance());
      hm.put(Source.XML, XmlSource.getInstance());
      hm.put(Source.WS, WsSource.getInstance());
   }
   
   InterfaceFactory factory = null;
   
   public void setSourceOfData(Source name)
   {
      factory = hm.get(name);
   }

   @Override
   public void selectAllPersons()
   {
      factory.selectAllPersons();
   }

   @Override
   public void selectUserById(int id)
   {
      factory.selectUserById(id);
   }

}
