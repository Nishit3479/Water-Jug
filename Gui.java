package ai.lab.project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui implements ActionListener 
{
	static JFrame f;
	static JPanel p;
	static JLabel l, l1, l2, l3, l4, l5, l6, l7, l81, l82, l9, l0, l10, l11;
	static JButton b1, b2, b3, t1, t2, t3, t4, t5, t6, t7, t8, n;
	
	Gui()
	{
		f = new JFrame("Water Jug");
		f.setBounds(650,200,500,500);
		f.setLayout(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		l = new JLabel("Water Jug - 3 x 5");
		l.setBounds(75,50,350,50);
		l.setFont(new Font("Arial", Font.PLAIN, 40));
		l.setForeground(Color.black);
		f.add(l);
		
		l1 = new JLabel("Jug-1 5L");
		l1.setBounds(80,150,110,50);
		l1.setFont(new Font("Arial", Font.PLAIN, 25));
		l1.setForeground(Color.black);
		f.add(l1);
		
		l2 = new JLabel("Jug-2 3L");
		l2.setBounds(270,150,110,50);
		l2.setFont(new Font("Arial", Font.PLAIN, 25));
		l2.setForeground(Color.black);
		f.add(l2);
		
		l3 = new JLabel("Filling up Jug-2");
		l3.setBounds(50,360,350,50);
		l3.setFont(new Font("Arial", Font.PLAIN, 20));
		l3.setForeground(Color.black);
		l3.setVisible(false);
		f.add(l3);
		
		l4 = new JLabel("Pouring 3L from Jug-2 to Jug-1");
		l4.setBounds(50,360,350,50);
		l4.setFont(new Font("Arial", Font.PLAIN, 20));
		l4.setForeground(Color.black);
		l4.setVisible(false);
		f.add(l4);
		
		l5 = new JLabel("Filling up Jug-2");
		l5.setBounds(50,360,350,50);
		l5.setFont(new Font("Arial", Font.PLAIN, 20));
		l5.setForeground(Color.black);
		l5.setVisible(false);
		f.add(l5);
		
		l6 = new JLabel("Pouring 2L from Jug-2 into Jug-1");
		l6.setBounds(50,360,350,50);
		l6.setFont(new Font("Arial", Font.PLAIN, 20));
		l6.setForeground(Color.black);
		l6.setVisible(false);
		f.add(l6);
		
		l7 = new JLabel("Emptying Jug-1");
		l7.setBounds(50,360,350,50);
		l7.setFont(new Font("Arial", Font.PLAIN, 20));
		l7.setForeground(Color.black);
		l7.setVisible(false);
		f.add(l7);
		
		l81 = new JLabel("Pouring the remaining 1L");
		l81.setBounds(50,360,350,50);
		l81.setFont(new Font("Arial", Font.PLAIN, 20));
		l81.setForeground(Color.black);
		l81.setVisible(false);
		f.add(l81);
		
		l82 = new JLabel("from Jug-2 to Jug-1");
		l82.setBounds(50,390,350,50);
		l82.setFont(new Font("Arial", Font.PLAIN, 20));
		l82.setForeground(Color.black);
		l82.setVisible(false);
		f.add(l82);
		
		l9 = new JLabel("Filling up Jug-2");
		l9.setBounds(50,360,350,50);
		l9.setFont(new Font("Arial", Font.PLAIN, 20));
		l9.setForeground(Color.black);
		l9.setVisible(false);
		f.add(l9);
		
		l0 = new JLabel("Goal State has been achieved");
		l0.setBounds(50,360,350,50);
		l0.setFont(new Font("Arial", Font.PLAIN, 20));
		l0.setForeground(Color.black);
		l0.setVisible(false);
		f.add(l0);
		
		l10 = new JLabel("Empty Jug");
		l10.setBounds(85,260,100,50);
		l10.setFont(new Font("Arial", Font.PLAIN, 20));
		l10.setForeground(Color.black);
		l10.setVisible(true);
		f.add(l10);
		
		l11 = new JLabel("Empty Jug");
		l11.setBounds(275,260,100,50);
		l11.setFont(new Font("Arial", Font.PLAIN, 20));
		l11.setForeground(Color.black);
		l11.setVisible(true);
		f.add(l11);
		
		t1 = new JButton("1");
		t1.setBounds(95,320,60,30);
		t1.setFont(new Font("Arial", Font.PLAIN, 20));
		t1.setVisible(false);
		f.add(t1);
		
		t2 = new JButton("1");
		t2.setBounds(95,290,60,30);
		t2.setFont(new Font("Arial", Font.PLAIN, 20));
		t2.setVisible(false);
		f.add(t2);
		
		t3 = new JButton("1");
		t3.setBounds(95,260,60,30);
		t3.setFont(new Font("Arial", Font.PLAIN, 20));
		t3.setVisible(false);
		f.add(t3);
		
		t4 = new JButton("1");
		t4.setBounds(95,230,60,30);
		t4.setFont(new Font("Arial", Font.PLAIN, 20));
		t4.setVisible(false);
		f.add(t4);
		
		t5 = new JButton("1");
		t5.setBounds(95,200,60,30);
		t5.setFont(new Font("Arial", Font.PLAIN, 20));
		t5.setVisible(false);
		f.add(t5);
		
		t6 = new JButton("1");
		t6.setBounds(285,320,60,30);
		t6.setFont(new Font("Arial", Font.PLAIN, 20));
		t6.setVisible(false);
		f.add(t6);
		
		t7 = new JButton("1");
		t7.setBounds(285,290,60,30);
		t7.setFont(new Font("Arial", Font.PLAIN, 20));
		t7.setVisible(false);
		f.add(t7);
		
		t8 = new JButton("1");
		t8.setBounds(285,260,60,30);
		t8.setFont(new Font("Arial", Font.PLAIN, 20));
		t8.setVisible(false);
		f.add(t8);
		
		n = new JButton("Next");
		n.setBounds(380,380,80,40);
		n.setFont(new Font("Arial", Font.PLAIN, 20));
		n.setVisible(true);
		f.add(n);
		n.addActionListener(this);
	}
	int i = 0;
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand()=="Next" && i<8)
		{
			if(i==0)
			{
				l3.setVisible(true);
			}
			if(i==1)
			{
				l3.setVisible(false);
				l4.setVisible(true);
			}
			if(i==2)
			{
				l4.setVisible(false);
				l5.setVisible(true);
			}
			if(i==3)
			{
				l5.setVisible(false);
				l6.setVisible(true);
			}
			if(i==4)
			{
				l6.setVisible(false);
				l7.setVisible(true);
			}
			if(i==5)
			{
				l7.setVisible(false);
				l81.setVisible(true);
				l82.setVisible(true);
			}
			if(i==6)
			{
				l81.setVisible(false);
				l82.setVisible(false);
				l9.setVisible(true);
			}
			if(A[i] == 0)
			{
				l10.setVisible(true);
				t1.setVisible(false);
				t2.setVisible(false);
				t3.setVisible(false);
				t4.setVisible(false);
				t5.setVisible(false);
			}
			if(A[i] == 1)
			{
				l10.setVisible(false);
				t1.setVisible(true);
				t2.setVisible(false);
				t3.setVisible(false);
				t4.setVisible(false);
				t5.setVisible(false);
			}
			if(A[i] == 2)
			{
				l10.setVisible(false);
				t1.setVisible(true);
				t2.setVisible(true);
				t3.setVisible(false);
				t4.setVisible(false);
				t5.setVisible(false);
			}
			if(A[i] == 3)
			{
				l10.setVisible(false);
				t1.setVisible(true);
				t2.setVisible(true);
				t3.setVisible(true);
				t4.setVisible(false);
				t5.setVisible(false);
			}
			if(A[i] == 4)
			{
				l10.setVisible(false);
				t1.setVisible(true);
				t2.setVisible(true);
				t3.setVisible(true);
				t4.setVisible(true);
				t5.setVisible(false);
			}
			if(A[i] == 5)
			{
				l10.setVisible(false);
				t1.setVisible(true);
				t2.setVisible(true);
				t3.setVisible(true);
				t4.setVisible(true);
				t5.setVisible(true);
			}
			if(B[i] == 0)
			{
				l11.setVisible(true);
				t6.setVisible(false);
				t7.setVisible(false);
				t8.setVisible(false);
			}
			if(B[i] == 1)
			{
				l11.setVisible(false);
				t6.setVisible(true);
				t7.setVisible(false);
				t8.setVisible(false);
			}
			if(B[i] == 2)
			{
				l11.setVisible(false);
				t6.setVisible(true);
				t7.setVisible(true);
				t8.setVisible(false);
			}
			if(B[i] == 3)
			{
				l11.setVisible(false);
				t6.setVisible(true);
				t7.setVisible(true);
				t8.setVisible(true);
			}
			i++;
		}
		if(e.getActionCommand()=="Next" && i>=8)
		{
			l9.setVisible(false);
			l0.setVisible(true);
		}
	}
	int []A = new int[8];
	int []B = new int[8];
	
	void jug(int []M, int []N)
	{
		for(int i=0; i<8; i++)
		{
			A[i] = M[i];
		}
		for(int i=0; i<8; i++)
		{
			B[i] = N[i];
		}
	}
}
