package pl.lodz.uni.math;

public class Account {
   private Client owner;
   private String accountId;
   private Double balance;
   private Transaction[] transactions = new Transaction[10];
}

public void makeTransaction(TransactionType type, double value){}