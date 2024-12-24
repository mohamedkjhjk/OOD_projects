package odd;



import java.util.*;

import javax.persistence.*;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/odbtest.odb");
		EntityManager em =emf.createEntityManager();
		
		Customer c1 = new Customer (1,"n1","e1","p1","pnum1","add1");
		Customer c2 = new Customer (2,"n2","e2","p2","pnum2","add2");
		Customer c3 = new Customer (3,"n3","e3","p3","pnum3","add3");
		Cart cart1 = new Cart(1, 10);
		Cart cart2 = new Cart(2, 8);
		Cart cart3 = new Cart(3, 5);
		Product p1 = new Product(1, "name1", "des1", 20, 10);
		Product p2 = new Product(2, "name2", "des2", 10, 5);
		Product p3 = new Product(3, "name3", "des3", 30, 20);
		Order o1 = new Order(1, new Date(16,12,2024), "deliverd", 20) ;
		Order o2 = new Order(2, new Date(20,12,2024), "processing", 30) ;
		Order o3 = new Order(3, new Date(28,12,2024), "confirmed", 40) ;
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(cart1);
		em.persist(cart2);
		em.persist(cart3);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(o1);
		em.persist(o2);
		em.persist(o3);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
