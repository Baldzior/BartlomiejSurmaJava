package pl.lodz.uni.math;

public class Main {

   public static void main(String[] args) {
      Bank bank1 = Bank.getInstance();
      Bank bank2 = Bank.getInstance();

      Client client1 = bank1.createClient("Kowalski", "Jan", "Lodz", "Pomorska 21", "111222333");
      Client client2 = bank2.createClient("Nowak", "El¿bieta", "Skierniewice", "Sosnowa 105", "333222111");
      
      System.out.println("\n");
      bank2.listClients();

      Account account1 = client1.createAccount("12-1212-1212");
      Account account2 = client1.createAccount("13-1313-1313");
      Account account3 = client2.createAccount("14-1414-1414");
      
      client1.listAccounts();
      client2.listAccounts();
      
      account1.makeTransaction(TransactionType.DEPOSIT, 3000);
      account1.makeTransaction(TransactionType.WITHDRAW, 5000);
      account1.makeTransaction(TransactionType.TEST, 200);
      account1.makeTransaction(account1, 100);
      account1.makeTransaction(account3, 100);
      account1.makeTransaction(account2, 1000);
      account1.makeTransaction(account2, 10000);
      
      client1.getBilling();
      
      client2.getBilling();

   }

}
