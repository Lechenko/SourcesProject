package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import logik.PersonDM;

import java.awt.event.ActionEvent;

public class VPanel extends JPanel 
{
	PersonDM    dm      =  null;
	JTable      tbl     =  null;
	JScrollPane scr     =  null;
	JButton     creat   =  null;
	JButton     read    =  null;
	JButton     update  =  null;
	JButton     delete  =  null;
	JButton     save    =  null;
	JButton     open    =  null;
	public String setID = "";
	public int realRow;

	public VPanel()
	{
		

		setLayout(null);
		setBackground(Color.CYAN);

		dm  = new PersonDM();
		tbl = new JTable(dm);
		scr = new JScrollPane(tbl);
		scr.setBounds(10, 10, 400, 400);



		creat  =  new JButton("Create");
		read   =  new JButton("Read");
		update =  new JButton("Update");
		delete =  new JButton("Delete");
		save   =  new JButton("Save");
		open   =  new JButton("Open");

		creat.setBounds(600, 100, 100, 40);
		creat.setBackground(Color.WHITE);

		read.setBounds(600, 150, 100, 40);
		read.setBackground(Color.WHITE);

		update.setBounds(600, 200, 100, 40);
		update.setBackground(Color.WHITE);

		delete.setBounds(600, 250, 100, 40);
		delete.setBackground(Color.WHITE);
		
		save.setBounds(10, 410, 100, 40);
		save.setBackground(Color.ORANGE);

		open.setBounds(310, 410, 100, 40);
		open.setBackground(Color.ORANGE);


		add(scr);
		add(creat);
		add(read);
		add(update);
		add(delete);
		add(save);
		add(open);


		creat.addActionListener(dm.aCreat);
		read.addActionListener(dm.aRead);
		update.addActionListener(dm.aUpdate);
		delete.addActionListener(dm.aDelete);

		tbl.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (e.getClickCount() == 1)
				{
					int row = tbl.rowAtPoint(e.getPoint());
		            if (row > -1)
		            {
		                realRow = tbl.convertRowIndexToModel(row);
		                dm.row = realRow;
		                setID = ""+tbl.getValueAt(realRow, 0);;
		                System.out.println("строка = " + realRow + " ID = " + setID);		                
		            }
				}
			}
		});


	}
}
