package odd;
import java.util.*;

import javax.persistence.*;


public class DB {
	
	//create 
	
	public static void addcustomer(Customer c) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public static void addcart(Cart c) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	public static void addorder(Order o) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	public static void addproduct(Product p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	//retrieve
	
	public static Customer getCustomerById(int customerID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Customer cu =em.find(Customer.class,customerID);
		
		em.close();
		emf.close();
		return cu;
	}
	
	public static Order getOrderById(int orderID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Order or =em.find(Order.class,orderID);
		
		em.close();
		emf.close();
		return or;
	}
	public static Cart getCartById(int cartID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Cart ca =em.find(Cart.class,cartID);
		
		em.close();
		emf.close();
		return ca;
	}
	public static Product getProductById(int productID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Product pr =em.find(Product.class,productID);
		
		em.close();
		emf.close();
		return pr;
	}
	
	
	//Update
	
	public static void updateCustomer (int customerID,String customerName, String customerEmail, String customerPassword,
			String customerPhone, String customerAddress) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Customer c =em.find(Customer.class,customerID);
		
		try {
			
			if(c !=null) {
				if(customerName != null) {
					em.getTransaction().begin();
					c.setCustomerName(customerName);
					em.getTransaction().commit();
				}
				if(customerEmail != null) {
					em.getTransaction().begin();
					c.setCustomerEmail(customerEmail);
					em.getTransaction().commit();				
				}
				if(customerPassword != null) {
					em.getTransaction().begin();
					c.setCustomerPassword(customerPassword);
					em.getTransaction().commit();				
				}
				if(customerPhone != null) {
					em.getTransaction().begin();
					c.setCustomerPhone(customerPhone);
					em.getTransaction().commit();				
				}
				if(customerAddress != null) {
					em.getTransaction().begin();
					c.setCustomerAddress(customerAddress);
					em.getTransaction().commit();				
				}
				
						} 
		}	catch(Exception e) {
				if(em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}
	

	public static void updateCart (int cartID, int quantity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Cart c =em.find(Cart.class,cartID);
		
		try {
			
			if(c !=null) {
				if(quantity !=0) {
					em.getTransaction().begin();
					c.setQuantity(quantity);
					em.getTransaction().commit();
				}

				
						} 
			}	catch(Exception e) {
				if(em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}
	
	

	public static void updateProduct (int productID, String productName, String description, float price,int stock) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Product p =em.find(Product.class,productID);
		
		try {
			
			if(p !=null) {
				if(productName != null) {
					em.getTransaction().begin();
					p.setProductName(productName);
					em.getTransaction().commit();
				}
				if(description != null) {
					em.getTransaction().begin();
					p.setDescription(description);
					em.getTransaction().commit();
				}
				
				if(price!=0) {
					em.getTransaction().begin();
					p.setPrice(price);
					em.getTransaction().commit();
				}
				
				if(stock!=0) {
					em.getTransaction().begin();
					p.setStock(stock);
					em.getTransaction().commit();
				}

				
						} 
			}	catch(Exception e) {
				if(em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}
	
	

	public static void updateOrder (int orderID, Date orderDate, String orderStatus, float ordertotalPrice) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Order o =em.find(Order.class,orderID);
		
		try {
			
			if(o !=null) {
				if(orderDate != null) {
					em.getTransaction().begin();
					o.setOrderDate(orderDate);
					em.getTransaction().commit();
				}
				if(orderStatus != null) {
					em.getTransaction().begin();
					o.setOrderStatus(orderStatus);
					em.getTransaction().commit();
				}
				
				if(ordertotalPrice!=0) {
					em.getTransaction().begin();
					o.setOrdertotalPrice(ordertotalPrice);
					em.getTransaction().commit();
				}
						} 
			}	catch(Exception e) {
				if(em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}
	
	//delete
	
	public static void deleteCustomer(int customerID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Customer c= em.find(Customer.class, customerID );
		if(c !=null) {
			em.getTransaction().begin();
			em.remove(c);
			
			System.out.printf("cusomer deleted ", customerID);
			em.getTransaction().commit();
			
		}else {
			System.out.printf("There is no customer with this id",customerID);
		}
		em.close();
		emf.close();
	}
	
	public static void deleteCart(int cartID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Cart c= em.find(Cart.class, cartID );
		if(c !=null) {
			em.getTransaction().begin();
			em.remove(c);
			
			System.out.printf("cart deleted ", cartID);
			em.getTransaction().commit();
			
		}else {
			System.out.printf("There is no cart with this id",cartID);
		}
		em.close();
		emf.close();
	}
	
	public static void deleteProduct(int productID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Product c= em.find(Product.class, productID );
		if(c !=null) {
			em.getTransaction().begin();
			em.remove(c);
			
			System.out.printf("product deleted ", productID);
			em.getTransaction().commit();
			
		}else {
			System.out.printf("There is no product with this id",productID);
		}
		em.close();
		emf.close();
	}
	
	public static void deleteOrder(int orderID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Order c= em.find(Order.class, orderID );
		if(c !=null) {
			em.getTransaction().begin();
			em.remove(c);
			
			System.out.printf("order deleted ", orderID);
			em.getTransaction().commit();
			
		}else {
			System.out.printf("There is no order with this id",orderID);
		}
		em.close();
		emf.close();
	}


}
