package dao;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernetUtil 
{
	 private static final SessionFactory sessionFactory;    
	   static 
	   {
	        try {
	        	sessionFactory = new Configuration().configure().addAnnotatedClass(logik.Person.class).buildSessionFactory();
	        }
	        catch (Throwable ex) {                
	            System.err.println(" ошибка sessionFactory" + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }   
	    
	    public static void shutdown() {
	        // Close caches and connection pools
	        getSessionFactory().close();
	    }
}
