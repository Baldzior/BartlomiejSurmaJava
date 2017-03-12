package pl.lodz.uni.math;

public class MyFirstSingleton {
   private static MyFirstSingleton instance = new MyFirstSingleton();

   private MyFirstSingleton(){
      System.out.println("YES");
   }
   
   public static MyFirstSingleton getInstance()
   {
      System.out.println("getInstance");
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