package pl.lodz.uni.math.factory;
import java.util.List;

import pl.lodz.uni.math.domain.Person;

public interface Interfacefactory {

  public List<Person> getAllPersons();
  public Person getPersonById();
}
