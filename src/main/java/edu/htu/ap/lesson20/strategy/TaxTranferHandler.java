package edu.htu.ap.lesson20.strategy;

public class TaxTranferHandler implements TransactionProcessHandler{

	@Override
	public void handleProcess(TransferManager_V3 tm) {
		checkTaxPaid(tm.fromAccount);
		tm.checkFromAccountBalance();
		tm.checkBlackListed();
		tm.deductFromSourceAccount();
		tm.depositeIntoTargetAccount();
	}

	private void checkTaxPaid(String fromAccount) {
		System.out.println("Tax for account is okay");
	}

}
