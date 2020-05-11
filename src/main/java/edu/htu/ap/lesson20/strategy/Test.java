package edu.htu.ap.lesson20.strategy;

/**
 * Strategy design pattern: encapsulation process into a seprate class
 * @author Jalal Kiswani
 *
 */
public class Test {
	public static void main(String[] args) {
		TransferManager_V1 tm=new TransferManager_V1();
		tm.setFromAccount("123456789");
		tm.setToAccount("987654321");
		tm.setAmount(1000);
		
		tm.processTransfer();
		System.out.println("=======");
		TransferManager_V3 tm3=new TransferManager_V3();
		
		tm3.setFromAccount("12345789");
		tm3.setToAccount("987654321");
		tm3.setAmount(500);
		tm3.processTransfer();
		System.out.println("=======");
		tm3.setHandler(new TaxTranferHandler());
		tm3.processTransfer();
		
	}
}
