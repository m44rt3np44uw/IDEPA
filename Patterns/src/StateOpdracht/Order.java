package StateOpdracht;

public class Order {
	
	private int state = IN_PROGRESS;
	
	public final static int IN_PROGRESS = 0;
	public final static int DELIVERED = 1;
	public final static int CANCELED = 2;
	
	
	private OrderStrategy orderStrategy;
	
	public Order(OrderStrategy orderStrategy) {
		this.orderStrategy = orderStrategy;
	}
	
	public void deliverOrder() {
		this.orderStrategy.deliver();
	}
	
	public void deliver() throws Exception {
		switch(state) {
			case IN_PROGRESS:
				this.state = Order.DELIVERED;
				return;
			case DELIVERED:
				throw new Exception();
			case CANCELED:
				throw new Exception();
		}
	}
	
	public void cancel() throws Exception {
		switch(state) {
			case IN_PROGRESS:
				this.state = Order.CANCELED;
				return;
			case DELIVERED:
				throw new Exception();
			case CANCELED:
				throw new Exception();
		}
	}
}