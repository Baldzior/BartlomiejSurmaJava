package pl.lodz.uni.math.domain;

public class Person
{
   public String name;
   public int age;
   public String pesel; 
   
   public Person(String name, int age, String pesel)
   {
      this.pesel = pesel;
      this.age = age;
      this.name = name;
   }
   
   public String getName()
   {
      return name;
   }
}


