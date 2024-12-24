package odd;
import java.util.*;
import javax.persistence.*;
@Entity
public class Cart {
	@Id
	@GeneratedValue
	private int cartID;
	
	private int Quantity;
	
	@OneToOne
	private Order order;
	
	@OneToOne 
	private Customer customer;
	
	@OneToMany
	private List<Product> product ;
	
	

	public Cart(int cartID, int quantity) {
		this.cartID = cartID;
		Quantity = quantity;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
	
	

}
