package odd;
import java.util.*;
import javax.persistence.*;
@Entity
public class Product {
	@Id 
	@GeneratedValue
	private int productID;
	private String productName;
	private String Description;
	private float price;
	private int stock;
	
	@ManyToOne
	private Cart cart;

	public Product(int productID, String productName, String description, float price, int stock) {
		this.productID = productID;
		this.productName = productName;
		Description = description;
		this.price = price;
		this.stock = stock;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	

}
