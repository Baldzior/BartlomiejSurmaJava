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
