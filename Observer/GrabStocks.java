package Observer;

public class GrabStocks {

	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.60);
		stockGrabber.setGoogPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.60);
		stockGrabber.setGoogPrice(676.40);
		
		Runnable getIBM = new GetStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetStock(stockGrabber, 2, "AAPL", 677.60);
		Runnable getGOOG = new GetStock(stockGrabber, 2, "goog", 676.40);
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
	}

}
