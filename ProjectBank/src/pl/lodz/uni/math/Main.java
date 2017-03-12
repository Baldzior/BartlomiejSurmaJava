package pl.lodz.uni.math;

public class Main {

   public static void main(String[] args) {
      Bank bank1 = Bank.getInstance();
      Bank bank2 = Bank.getInstance();

      Client client1 = bank1.createClient("Kowalski", "Jan", "Lodz", "Pomorska 21", "1");

      Account account1 = client1.createAccount("12-1212-1212");
      Account account2 = client1.createAccount("13-1313-1313");
      account1.makeTransaction(TransactionType.DEPOSIT, 3000);
      account1.makeTransaction(account2, 150);

      bank2.listClients();
      System.out.println("\n");
      client1.listAccounts();
      System.out.println("\n");

   }

}
