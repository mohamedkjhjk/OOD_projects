package odd;
	import java.util.*;
	import javax.persistence.*;
	@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerID ;
	private String CustomerName;
	private String CustomerEmail;
	private String CustomerPassword;
	private String CustomerPhone;
	private String CustomerAddress;
//	Methods
	void Login() {};
	




	@OneToMany(mappedBy="customer" , cascade = CascadeType.ALL , orphanRemoval = true )
	private List<Order> order   ;
	
	@OneToOne
	private Cart cart ;

	
	public Customer(int customerID, String customerName, String customerEmail, String customerPassword,
			String customerPhone, String customerAddress) {
		this.customerID = customerID;
		CustomerName = customerName;
		CustomerEmail = customerEmail;
		CustomerPassword = customerPassword;
		CustomerPhone = customerPhone;
		CustomerAddress = customerAddress;
	}
	

	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}


	public String getCustomerEmail() {
		return CustomerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}


	public String getCustomerPassword() {
		return CustomerPassword;
	}


	public void setCustomerPassword(String customerPassword) {
		CustomerPassword = customerPassword;
	}

	public String getCustomerPhone() {
		return CustomerPhone;
	}


	public void setCustomerPhone(String customerPhone) {
		CustomerPhone = customerPhone;
	}


	public String getCustomerAddress() {
		return CustomerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
			
	
	
	

}
