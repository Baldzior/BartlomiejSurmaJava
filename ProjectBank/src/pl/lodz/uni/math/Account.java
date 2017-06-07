package pl.lodz.uni.math;

import java.util.ArrayList;
import java.util.List;

public class Account {
   private Client owner;
   private String accountId;
   private Double balance;
   private List<Transaction> transactions = new ArrayList<Transaction>();

   public Account(Client client, String id) {
      owner = client;
      accountId = id;
      setBalance(0.0);
   }

   public Client getOwner() {
      return owner;
   }

   public String getAccountId() {
      return accountId;
   }

   public Double getBalance() {
      return balance;
   }

   public void setBalance(Double balance) {
      this.balance = balance;
   }

   public void makeTransaction(TransactionType type, double value) {
      Transaction transaction = new Transaction(this, this, value, type);
   }

   public void makeTransaction(Account receiver, double value) {
      Transaction transaction = new Transaction(this, receiver, value, TransactionType.TRANSFER);
   }

   public void historyAdd(Transaction transaction) {
      transactions.add(transaction);
   }
   
   public void historyShow() {

      System.out.print(String.format("%-5s", "ID"));
      System.out.print(String.format("%-15s", "Type"));
      System.out.print(String.format("%-20s", "Sender"));
      System.out.print(String.format("%-20s", "Receiver"));
      System.out.print(String.format("%-15s", "Value"));
      System.out.println(String.format("%-10s", "Status"));
   
      for (Transaction t : transactions) {
         System.out.print(String.format("%-5s", transactions.indexOf(t)+1 + "."));
         System.out.print(String.format("%-15s", t.getType()));
         System.out.print(String.format("%-20s", t.getSender().getOwner().getFullName()));
         System.out.print(String.format("%-20s", t.getReceiver().getOwner().getFullName()));
         System.out.print(String.format("%-15s", t.getValue()));
         System.out.println(String.format("%-10s", t.getStatus()));
      }
   }

}