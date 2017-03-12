package pl.lodz.uni.math;

import java.util.ArrayList; //do listy
import java.util.List; //do listy
import java.util.Scanner; //do klasy skaner

//Ctrl + Shift + O dodaje wymagane biblioteki
public class Bank {
   private static Bank bank = null;
   private static String name;
   private static String city;
   private static String street;
   private static String id;
   private List<Client> clients = new ArrayList<Client>();

   static Scanner input = new Scanner(System.in); // zmnienna do pobrania danych
                                                  // wejsciowych

   static String getName() {
      return name;
   }

   private Bank(String bankName, String bankCity, String bankStreet, String bankId) {
      name = bankName;
      city = bankCity;
      street = bankStreet;
      id = bankId;
   }

   public static Bank getInstance() {
      if (bank == null) {
         System.out.println("Brak banku, wprowadz dane:");
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
      System.out.println("Klienci banku " + getName() + ":");
      for (Client client : clients) {
         System.out.println(client.getClientId() + ". " + client.getFullName());
      }
      System.out.print("\n\n");
   }

   static String setBankName() {
      System.out.println("Nazwa banku :");
      name = input.nextLine();
      return name;
   }

   static String setBankCity() {
      System.out.println("Miasto :");
      city = input.nextLine();
      return city;
   }

   static String setBankStreet() {
      System.out.println("Ulica:");
      street = input.nextLine();
      return street;
   }

   static String setBankId() {
      System.out.println("Numer:");
      id = input.nextLine();
      return id;
   }

}
