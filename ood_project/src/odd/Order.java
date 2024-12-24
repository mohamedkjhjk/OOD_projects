package odd;
import java.util.*;
import javax.persistence.*;
@Entity
public class Order {
	@Id
	@GeneratedValue 
	private int orderID;
	private Date orderDate;
	private String orderStatus;
	private float ordertotalPrice;
	
//	Methods
	
	
//	relationships
	@ManyToOne
	private Customer customer;
	
	@OneToOne
	private Cart cart;
	
	
	
	public Order(int orderID, Date orderDate, String orderStatus, float ordertotalPrice) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.ordertotalPrice = ordertotalPrice;
	}

	
	public int getOrderID() {
		return orderID;
	}

	
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public float getOrdertotalPrice() {
		return ordertotalPrice;
	}

	public void setOrdertotalPrice(float ordertotalPrice) {
		this.ordertotalPrice = ordertotalPrice;
	}
	
	

}
