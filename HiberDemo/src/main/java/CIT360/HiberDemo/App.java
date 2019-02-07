package CIT360.HiberDemo;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args ) throws Exception 
    {
    	customer chris = new customer();
        chris.setCustomer_id(1005);
        chris.setCustomer_Fname("Chris");
        chris.setCustomer_lname("Hemsworth");
        
   
   // Founder of Hibernate is Gavin King.
   // SessionFactory is an Interface. That means we can't create object of SessionFactory.
   // Configuration is a class and we need to create an object of configuration.
        //***********************************************************************************************************
        // set to configure() to get it to use the hibernate.cfg.xml file
        // set the class you are going to use to tell Hibernate which objects you are using to do things to DB.
        
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(customer.class);
        //***********************************************************************************************************
        
       
      //*********************************************************************************************
      // This was done because without it buildSessionFactory turns into a deprecated method.
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
      //*********************************************************************************************
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        // Transaction is needed for the ACID (SQL concept).  All the changes you made are part of a transaction.
        //  Atomicity, Consistency, Isolation, Durability are concepts used to keep your database changes in-check.
        Transaction tx = session.beginTransaction();
        
        //Saves the data
        session.save(chris);
        
        tx.commit();
        
        
        //***********************************************************************
        // Retrieve a record from the Customer database.
        //***********************************************************************
        
        System.out.println("\n Retrieving record from database with Elvis in it....");
        
        customer getElvis = null;
        
        getElvis = (customer) session.get(customer.class, 1004);
        
        System.out.println("Showing retrieved record: " + getElvis);
        
        
        //***************************************************************************************
        // HQL - Hibernate Query Language. Very similar to SQL but using class names not tables
        //     Query the database with HQL.  
        //***************************************************************************************
        //
        //createQuery from customer which is Entity name inside that class.
        //
        System.out.println("\n HQL - Query all the records in the customer table and print them out....");
        Query q = session.createQuery("from customer");
        
        List<customer> myCustomers = q.list();
        
        for(customer c : myCustomers) {
        	
        	System.out.println(c);
        	
        }
        
        //***************************************************************************************
        // HQL - Hibernate Query Language. Retrieve a single row.
        //      
        //***************************************************************************************
        //  
        System.out.println("\n HQL - Query row where customer_id = 1000....");
        
        Query q2 = session.createQuery("from customer where customer_id = 1000");
        
        customer custo = (customer) q2.uniqueResult();
        
        System.out.println(custo);
        
        
        //close session factory
        sf.close();
        
        
    }
    
 
}
