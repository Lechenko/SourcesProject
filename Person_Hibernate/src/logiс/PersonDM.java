package logiс;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import dao.PersonDAO;

import dao.PersonDAO_MySQL_Hibernate;

import view.VDialog;

public class PersonDM extends AbstractTableModel 
{
	PersonDAO person = null;
	ArrayList<Person> pers = null;
	public int row;


	public ActionCreate   aCreat  = new ActionCreate();
	public ActionRead     aRead   = new ActionRead();
	public ActionaUpdate  aUpdate = new ActionaUpdate();
	public ActionaDelete  aDelete = new ActionaDelete();

	public PersonDM() 
	{

		person = new PersonDAO_MySQL_Hibernate();
		pers = person.read();

	}


	@Override
	public int getColumnCount()
	{

		return 4;
	}

	@Override
	public int getRowCount()
	{

		return pers.size();
	}

	@Override
	public String getColumnName(int column)
	{

	//	String[] str = {"Id","FName","LName","Age","TelNumber"};
		String[] str = {"id","FName","LName","Age"};
		return str[column];
	}

	@Override
	public Object getValueAt(int row, int col) 
	{
		Person p   = pers.get(row);
		Object ret = null;
		switch (col)
		{
		case 0: ret = p.getId();    break;
		case 1: ret = p.getFname(); break;
		case 2: ret = p.getLname(); break;
		case 3: ret = p.getAge();   break;
	//	case 4 :ret = p.getNum();   break;
		}
		return ret;
	}


	class ActionCreate implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{			
			
			VDialog	dd = new VDialog();
			dd.setModal(true);
			dd.setVisible(true);
			if(dd.getdStr().equals("Ok"))
			{
				person.creat(dd.getPerson());
				pers = person.read();
				fireTableDataChanged();	
				System.out.println("start OK - Create");
			}
		}		
	}

	class ActionRead implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			pers = person.read();
			fireTableDataChanged();
			System.out.println("Read - Ok");
		}
	}

	class ActionaUpdate implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			VDialog dd = new VDialog();	
			dd.setModal(true);
			dd.setVisible(true);
			int i = row;
			Person p = null;
			System.out.println(i);
			if ( i >= 0)
			{
				p = pers.get(i);
				dd.setPerson(p);
				System.out.println("input "+ p.getId() +" "+ p.getFname() +" "+ p.getLname() +" "+ p.getAge());
			}
			dd.setVisible(true);
			if(dd.getdStr().equals("Ok"))
			{
				System.out.println("start OK - Update");
				person.update(dd.getPerson());
				System.out.println("output "+ p.getId() +" "+ p.getFname() +" "+ p.getLname() +" "+ p.getAge());
				
				pers = person.read();
				fireTableDataChanged();	
			}
	}			

	}
	class ActionaDelete implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{


		}
	}
	}

