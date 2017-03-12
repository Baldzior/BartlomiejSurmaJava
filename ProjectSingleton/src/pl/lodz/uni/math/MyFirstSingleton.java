package pl.lodz.uni.math;

public class MyFirstSingleton {
   private static MyFirstSingleton instance = new MyFirstSingleton(); //#new tutaj sprawia ze jestem zabezp. przez wielowatkowoscia
                                                  //#ale nie kazdy kontakt z klasa musi zabierac pamiec na inicjalizacje tego obiektu
                                                   //#wiêc pisze = null;

   private MyFirstSingleton(){
      System.out.println("YES");
   }
   
   public static MyFirstSingleton getInstance()
   {
      System.out.println("getInstance");
      //#if(instance==null)
         //#instance = new MyFirstSingleton();
      return instance;
      //return new MyFirstSingleton(); - jako 1 sie wywola
   }
   
   static{
      System.out.println("YES!!!!");
   }
   
   {
      System.out.println("init");
   }
}

//SINGLETON WYMAGANIA
//1. prywatny konstruktor
//2.publiczna statyczna metoda zwracajaca obiekt mojego typu
//3.obiekt przechowuje wewnatrz prywatnej statycznej mojego typu ktory moge zainicjowac od razu lub przy pierwszym wywolaniu
//4. wewnatrz mojej klasy musze miec prywatna statyczna zmienna do przechowywania obiektu mojej klasy