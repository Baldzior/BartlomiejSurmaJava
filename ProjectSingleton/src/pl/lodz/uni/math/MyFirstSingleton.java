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

/*
1. Blok static wywoluje sie tylko raz (na rzecz klasy).
2. Przed dzialaniem konstruktora zawsze wywola sie blok inicjalizacji.
3. Bezwzgledne pierwszenstwo ma blok static -> metoda static chyba, ze w konstruktorze klasy jest juz tworzenie obiektu tej klasy (kazdy kontakt z klasa
powoduje jego utworzenie)
*/