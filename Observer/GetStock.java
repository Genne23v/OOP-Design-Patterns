package Observer;

import java.text.DecimalFormat;

public class GetStock implements Runnable {

	private String stock;
	private double price;
	private Subject stockGrabber;
	
	public GetStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
		this.stockGrabber = stockGrabber;
		stock = newStock;
		price = newPrice;
	}
	
	@Override
	public void run() {
		for (int i=1; i<=20; i++) {
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
			
			double randNum = (Math.random() * (.06)) - .03;
			
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format((price + randNum)));
			
			if(stock == "IBM") ((StockGrabber) stockGrabber).setIbmPrice(price);
            if(stock == "AAPL") ((StockGrabber) stockGrabber).setAaplPrice(price);
            if(stock == "GOOG") ((StockGrabber) stockGrabber).setGoogPrice(price);
             
            System.out.println(stock + ": " + df.format((price + randNum)) +
                    " " + df.format(randNum));
            System.out.println();
		}
	}
}
