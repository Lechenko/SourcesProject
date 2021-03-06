package personList;

public class Person implements Comparable<Person>
{
	public int id; 
	public String fname;   
	public String lname;   
	public int age; 

	public Person(){

	}
	
	public Person(int id,String fname,String lname,int age){
		this.init(id, fname, lname, age);
	}

	public void init (int id,String fname,String lname,int age){
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return("Person [id = " + id + ", fname = " + fname + ", lname = " + lname + ", age = " + age +  "] ");
	}

		@Override
		public int compareTo(Person o)
		{
			int ret = 0;
			if (this.age < o.age)
			{
				ret = -1;
			}
			else if(this.age > o.age)
			{
				ret = 1;
			}
			return ret;
		}
}
