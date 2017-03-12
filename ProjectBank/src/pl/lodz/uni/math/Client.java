package pl.lodz.uni.math;

import java.util.ArrayList;
import java.util.List;

public class Client {
   private String firstName;
   private String lastName;
   private String city;
   private String street;
   private String clientId;
   private List<Account> accounts = new ArrayList<Account>();

   public Client(String clientfirstName, String clientLastName, String clientCity, String clientStreet,
         String clientClientId) {
      firstName = clientfirstName;
      lastName = clientLastName;
      city = clientCity;
      street = clientStreet;
      clientId = clientClientId;
   }

   public Account createAccount(String accountId) {
      Account account = new Account(this, accountId);
      accounts.add(account);

      return account;
   }

   public String getFullName() {
      return firstName + " " + lastName;
   }

   public String getClientId() {
      return clientId;
   }

   public void listAccounts() {
      System.out.println("Konta klienta " + getFullName() + ":");
      for (Account account : accounts) {
         System.out.println(account.getAccountId());
      }
      System.out.print("\n\n");
   }

}