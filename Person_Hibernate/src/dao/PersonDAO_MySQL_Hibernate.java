package dao;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;

import javassist.CodeConverter.ArrayAccessReplacementMethodNames;
import logik.Person;

public class PersonDAO_MySQL_Hibernate implements PersonDAO
{

	@Override
	public void creat(Person p) 
	{

		Session session=HibernetUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();  


	}

	
	@Override
	public ArrayList<Person> read() {
		
		Session session=HibernetUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query<Person> query = session.createQuery("From Person"); //HQL
		ArrayList<Person> pp = (ArrayList<Person>)query.getResultList();
		session.getTransaction().commit();
		session.close();  
		return pp;
	}

	@Override
	public void update(Person p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delet(Person p) {
		// TODO Auto-generated method stub

	}

}
