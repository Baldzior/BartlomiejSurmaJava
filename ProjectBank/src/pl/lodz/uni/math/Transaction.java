package pl.lodz.uni.math;

public class Transaction {
   private Account sender;
   private Account receiver;
   private double value;
   private TransactionType type;
   private TransactionStatus status;

   public Transaction(Account accountSender, Account accountReciver, double accountValue, TransactionType accountType) {
      sender = accountSender;
      receiver = accountReciver;
      value = accountValue;
      type = accountType;
      makeTransaction();
   }

   private void makeTransaction() {
      this.status = TransactionStatus.SUCCESS;
      switch (this.type) {
      case DEPOSIT:
         makeDeposit();
         break;
      case WITHDRAW:
         makeWithdraw();
         break;
      case TRANSFER:
         makeTransfer();
         break;
      default:
         status = TransactionStatus.FAIL;
         sender.historyAdd(this);
      }
   }

   private void makeDeposit() {
      if (sender.getAccountId() == receiver.getAccountId()) {
         receiver.setBalance(receiver.getBalance() + this.value);
      } else {
         this.status = TransactionStatus.ABORTED;
      }
      receiver.historyAdd(this);
   }

   private void makeWithdraw() {
      if (sender.getAccountId() == receiver.getAccountId()) {
         if (receiver.getBalance() >= this.value) {
            receiver.setBalance(receiver.getBalance() - this.value);
         } else {
            this.status = TransactionStatus.FAIL;
         }
      } else {
         this.status = TransactionStatus.ABORTED;
      }
      receiver.historyAdd(this);
   }
   
   private void makeTransfer() {
      if (sender.getAccountId() != receiver.getAccountId()) {
         if (sender.getBalance() >= this.value) {
            sender.setBalance(sender.getBalance() - this.value);
            receiver.setBalance(receiver.getBalance() + this.value);
            receiver.historyAdd(this);
         } else {
            this.status = TransactionStatus.FAIL;
         }
      } else {
         this.status = TransactionStatus.ABORTED;
      }
      sender.historyAdd(this);
   }

   public TransactionType getType() {
      return type;
   }
   
   public TransactionStatus getStatus() {
      return status;
   }
   
   public double getValue() {
      return value;
   }
   
   public Account getReceiver() {
      return receiver;
   }
   
   public Account getSender() {
      return sender;
   }
   
}
