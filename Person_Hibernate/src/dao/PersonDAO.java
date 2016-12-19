package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import logik.Person;

public interface PersonDAO {

	void creat(Person p);
	ArrayList<Person> read();
	void update(Person p);
	void delet(Person p);
}
