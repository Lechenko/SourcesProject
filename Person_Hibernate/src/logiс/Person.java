package logiс;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Person /**implements Comparable<Person>*/
{
	
	@Id
	private int id; 
	
	private String fname;   
	private String lname;   
	private int age; 
	//private int number;

	public Person(){

	}

//	public Person(int id,String fname,String lname,int age, int number){
//		this.init(id, fname, lname, age, number);
//	}
	
	public Person(int id,String fname,String lname,int age){
		this.init(id, fname, lname, age);
	}

//	public void init (int id,String fname,String lname,int age, int number){
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.age = age;
//		this.number = number;
//	}
	
	public void init (int id,String fname,String lname,int age){
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	

	@Override
	public String toString()
	{
		//return("Person [id = " + getId() + ", fname = " + getFname() + ", lname = " + getLname() + ", age = " + getAge() + ", Telephone = " + getNum() + "] ");
		return("Person [id = " + getId() + ", fname = " + getFname() + ", lname = " + getLname() + ", age = " + getAge() +  "] ");
	
	}
	
	public int getId() {return id;}

	public void setId(int id) {this.id = id;}

	public String getFname() {return fname;}

	public void setFname(String fname) {this.fname = fname;}

	public String getLname() {return lname;}

	public void setLname(String lname) {this.lname = lname;}

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}
	
//	public int getNum() {return number;}
//
//	public void setNum(int number) {this.number = number;}

//		@Override
//		public int compareTo(Person o)
//		{
//			int ret = 0;
//			if (this.age < o.age)
//			{
//				ret = -1;
//			}
//			else if(this.age > o.age)
//			{
//				ret = 1;
//			}
//			return ret;
//		}
}
