package pl.lodz.uni.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //do klasy skaner

//Ctrl + Shift + O dodaje wymagane biblioteki
public class Bank {
   private static Bank bank = null;
   private static String name;
   private static String city;
   private static String street;
   private static String id;
   private List<Client> clients = new ArrayList<Client>();

   static Scanner input = new Scanner(System.in);

   private Bank(String bankName, String bankCity, String bankStreet, String bankId) {
      name = bankName;
      city = bankCity;
      street = bankStreet;
      id = bankId;
   }
   
   public static Bank getInstance() {
      if (bank == null) {
         System.out.println("No bank, enter data:");
         bank = new Bank(setBankName(), setBankCity(), setBankStreet(), setBankId());
      }
      return bank;
   }

   public Client createClient(String firstName, String lastName, String city, String street, String clientId) {
      Client client = new Client(firstName, lastName, city, street, clientId);
      clients.add(client);

      return client;
   }

   public void listClients() {
      System.out.println("Bank customers " + getName() + ":");
      for (Client client : clients) {
         System.out.println(clients.indexOf(client) + 1 + ". " + client.getFullName());
      }
      System.out.print("\n\n");
   }

   static String setBankName() {
      System.out.println("Bank name :");
      name = input.nextLine();
      return name;
   }
   
   static String getName() {
      return name;
   }

   static String setBankCity() {
      System.out.println("City :");
      city = input.nextLine();
      return city;
   }

   static String setBankStreet() {
      System.out.println("Street:");
      street = input.nextLine();
      return street;
   }

   static String setBankId() {
      System.out.println("Number:");
      id = input.nextLine();
      return id;
   }

}
