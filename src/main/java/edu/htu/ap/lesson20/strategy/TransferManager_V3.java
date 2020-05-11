package edu.htu.ap.lesson20.strategy;

public class TransferManager_V3 {
	String fromAccount;
	String toAccount;
	int amount;
	TransactionProcessHandler handler = new DefaultTransactionProcessHandler();

	public void processTransfer() {
		handler.handleProcess(this);
//		checkFromAccountBalance();
//		checkBlackListed();
//		deductFromSourceAccount();
//		depositeIntoTargetAccount();		
	}

	protected void depositeIntoTargetAccount() {
		System.out.println("Depsoiting " + amount + " into the target account : " + toAccount);
	}

	protected void deductFromSourceAccount() {
		System.out.println("decucting amount " + amount + " from source account :" + fromAccount);
	}

	protected void checkBlackListed() {
		System.out.println("Account is not balcklisted");
	}

	protected void checkFromAccountBalance() {
		System.out.println("Balance is okay");
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public TransactionProcessHandler getHandler() {
		return handler;
	}

	public void setHandler(TransactionProcessHandler handler) {
		this.handler = handler;
	}

}
