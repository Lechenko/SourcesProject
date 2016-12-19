package logiс;

import java.util.Comparator;

public class PersonLnameSort implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o1.getLname().compareToIgnoreCase(o2.getLname());
	}

}
