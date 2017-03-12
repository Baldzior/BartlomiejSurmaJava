package pl.lodz.uni.math;

public class Bank {
   private static Bank bank = null;
   private String name;
   private String city;
   private String street;
   private String id;
   private Client[] clients = new Client[5];

   private Bank(String bankName, String bankCity, String bankStreet, String bankId) {
      name = bankName;
      city = bankCity;
      street = bankStreet;
      id = bankId;
   }
   
   public static Bank getInstance(String bankName, String bankCity, String bankStreet, String bankId)
   {
      if(bank == null)
         bank = new Bank(bankName,bankCity,bankStreet,bankId);
      return bank;
   }
}


/*
 package pl.lodz.uni.math;

public class Bank {
   private String name;
   private String city;
   private String street;
   private String bankId;
   private Client[] clients = new Client[5];

   public Bank(String bankName, String bankCity, String bankStreet, String id) {
      name = bankName;
      city = bankCity;
      street = bankStreet;
      bankId = id;
   }
}
*/
