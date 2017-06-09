package pl.lodz.uni.math;

import java.util.ArrayList;
import java.util.List;

public class Client {
   private String firstName;
   private String lastName;
   private String city;
   private String street;
   private String cellPhone;
   private List<Account> accounts = new ArrayList<Account>();

   public Client(String clientfirstName, String clientLastName, String clientCity, String clientStreet, String clientCellPhone) {
      firstName = clientfirstName;
      lastName = clientLastName;
      city = clientCity;
      street = clientStreet;
      cellPhone = clientCellPhone;
   }

   public Account createAccount(String accountId) {
      Account account = new Account(this, accountId);
      accounts.add(account);

      return account;
   }

   public String getFullName() {
      return firstName + " " + lastName;
   }

   public void listAccounts() {
      System.out.println(getFullName() + " accounts:");
      for (Account account : accounts) {
         System.out.println(accounts.indexOf(account) + 1 + ". " + account.getAccountId());
      }
      System.out.println("\n\n");
   }

   public void getBilling(){
      System.out.print("-----------------------------------------------\n");
      System.out.println(this.getFullName()); 
      for(Account account : accounts){
         System.out.print("Account : " + account.getAccountId());
         System.out.println(" |  Balance: " + account.getBalance());
         account.historyShow();
         System.out.print("\n\n");
      }
      System.out.print("-----------------------------------------------\n");
   }
   
}