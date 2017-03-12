package pl.lodz.uni.math;

public class Main {
//inna kolejnowsc wywolania bo nie wolam obieku przez new
   public static void main(String[] args) {
      //MyFirstSingleton test.getInstance();
      MyFirstSingleton a = MyFirstSingleton.getInstance();
      //a.setx(7);
      
      MyFirstSingleton a1 = MyFirstSingleton.getInstance();
    //  System.out.println(a1.getx());
   }

}
