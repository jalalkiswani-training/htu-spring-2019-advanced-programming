package edu.htu.ap.lesson20.strategy;

public class DefaultTransactionProcessHandler implements TransactionProcessHandler{

	@Override
	public void handleProcess(TransferManager_V3 tm) {
		tm.checkFromAccountBalance();
		tm.checkBlackListed();
		tm.deductFromSourceAccount();
		tm.depositeIntoTargetAccount();
	}

}
