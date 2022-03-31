package com.tns.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
				//create one employee
		
		/*Employee employee = new Employee();
				employee.setName("John");
				employee.setSalary(5000);
				em.persist(employee);*/
				
				
				//create one manager
				Manager manager1 = new Manager();
				manager1.setName("Abhishek");
				manager1.setSalary(9000);
				manager1.setDepartmentName("Dev");
				em.persist(manager1);
				
				
				em.getTransaction().commit();
				
				System.out.println("Added one employee and manager to database.");
				//em.close();
				//factory.close();

	}

}
