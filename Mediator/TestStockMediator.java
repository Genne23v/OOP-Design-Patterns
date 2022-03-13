package Mediator;

public class TestStockMediator {

	public static void main(String[] args) {
		StockMediator nyse = new StockMediator();
		
		GormanSlacks broker1 = new GormanSlacks(nyse);
		JTPoorman broker2 = new JTPoorman(nyse);
		
		broker1.saleOffer("MSFT", 100);
		broker1.saleOffer("GOOG", 50);
		
		broker2.buyOffer("MSFT", 100);
		broker2.saleOffer("NRG", 10);
		
		broker1.buyOffer("NRG", 10);
		
		nyse.getStockOffering();
	}

}
