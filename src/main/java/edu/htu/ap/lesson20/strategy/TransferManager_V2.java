package edu.htu.ap.lesson20.strategy;

public class TransferManager_V2 extends TransferManager_V1{
	
	@Override
	public void processTransfer() {
		checkBlackListed();
		checkFromAccountBalance();
		deductFromSourceAccount();
		depositeIntoTargetAccount();	
	}
}
