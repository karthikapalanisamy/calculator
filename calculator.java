# calculator
package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ImageCapabilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

@SuppressWarnings("unused")
public class Calculator implements ActionListener {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JTextArea textarea=new JTextArea(2,12);
JButton button1=new JButton();
JButton button2=new JButton();
JButton button3=new JButton();
JButton button4=new JButton();
JButton button5=new JButton();
JButton button6=new JButton();
JButton button7=new JButton();
JButton button8=new JButton();
JButton button9=new JButton();
JButton button0=new JButton();
JButton buttonadd=new JButton();
JButton buttonsub=new JButton();
JButton buttonmul=new JButton();
JButton buttondiv=new JButton();
JButton buttonclear=new JButton();
JButton buttondot=new JButton();
JButton buttonequals=new JButton();

public Calculator(){
	frame.setSize(380,380);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setTitle("CALC");
	frame.add(panel);
	panel.setBackground(Color.lightGray);
	Border border=BorderFactory.createLineBorder(Color.black,5);
	panel.setBorder(border);
	panel.add(textarea);
	textarea.setBackground(Color.black);
	Border tborder=BorderFactory.createLineBorder(Color.blue,3);
	textarea.setBorder(tborder);
	Font font=new Font("arial",Font.BOLD,33);
	textarea.setFont(font);
	textarea.setForeground(Color.white);
	textarea.setPreferredSize(new Dimension(2,12));
	textarea.setLineWrap(true);
	button1.setPreferredSize(new Dimension(80,42));
	button1.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\11.png"));
	button2.setPreferredSize(new Dimension(80,42));
	button2.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\22.png"));
	button3.setPreferredSize(new Dimension(80,42));
	button3.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\sample.png"));
	button4.setPreferredSize(new Dimension(80,42));
	button4.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\4.png"));
	button5.setPreferredSize(new Dimension(80,42));
	button5.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\5.png"));
	button6.setPreferredSize(new Dimension(80,42));
	button6.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\6.png"));
	button7.setPreferredSize(new Dimension(80,42));
	button7.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\7.png"));
	button8.setPreferredSize(new Dimension(80,42));
	button8.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\8.png"));
	button9.setPreferredSize(new Dimension(80,42));
	button9.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\9.png"));
	button0.setPreferredSize(new Dimension(80,42));
	button0.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\0.png"));
	buttonadd.setPreferredSize(new Dimension(80,42));
	buttonadd.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\+.png"));
	buttonsub.setPreferredSize(new Dimension(80,42));
	buttonsub.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\-.png"));
	buttonmul.setPreferredSize(new Dimension(80,42));
	buttonmul.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\new.dib"));
	buttondiv.setPreferredSize(new Dimension(80,42));
	buttondiv.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\div.png"));
	buttonclear.setPreferredSize(new Dimension(100,42));
	buttonclear.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\clear.png"));
	buttondot.setPreferredSize(new Dimension(80,42));
	buttondot.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\dot.png"));
	buttonequals.setPreferredSize(new Dimension(80,42));
	buttonequals.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\=.png"));
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
	button0.addActionListener(this);
	buttonadd.addActionListener(this);
	buttonsub.addActionListener(this);
	buttonmul.addActionListener(this);
	buttondiv.addActionListener(this);
	buttonclear.addActionListener(this);
	buttondot.addActionListener(this);
	buttonequals.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	panel.add(button6);
	panel.add(button7);
	panel.add(button8);
	panel.add(button9);
	panel.add(button0);
	panel.add(buttonadd);
	panel.add(buttonsub);
	panel.add(buttonmul);
	panel.add(buttondiv);
	panel.add(buttondot);
	panel.add(buttonequals);
	panel.add(buttonclear);
	
}
double number1,number2,result;
int add=0,sub=0,div=0,mul=0;
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		Object source=e.getSource();
	
	if(source==button1){
		textarea.append("1");
	}
	if(source==button2){
		textarea.append("2");
	}
	if(source==button3){
		textarea.append("3");
	}
	if(source==button4){
		textarea.append("4");
	}
	if(source==button5){
		textarea.append("5");
	}
	if(source==button6){
		textarea.append("6");
	}
	if(source==button7){
		textarea.append("7");
	}
	if(source==button8){
		textarea.append("8");
	}
	if(source==button9){
		textarea.append("9");
	}
	if(source==button0){
		textarea.append("0");
	}
	if(source==buttondot){
		textarea.append(".");
	}
	if(source==buttonclear){
		number1=0.0;
		number2=0.0;
		textarea.setText("");
	}
	if(source==buttonadd){
		number1=number_reader();
		textarea.setText("");
		add=1;
		sub=0;
		mul=0;
		div=0;
	}
	if(source==buttonsub){
		number1=number_reader();
		textarea.setText("");
		add=0;
		sub=1;
		mul=0;
		div=0;
	}
	if(source==buttonmul){
		number1=number_reader();
		textarea.setText("");
		add=0;
		sub=0;
		mul=1;
		div=0;
	}
	if(source==buttondiv){
		number1=number_reader();
		textarea.setText("");
		add=0;
		sub=0;
		mul=0;
		div=1;
	}
	if(source==buttonequals){
		number2=number_reader();	
		if(add>0){
			result=number1+number2;
		textarea.setText(Double.toString(result));
		}
		if(sub>0){
			result=number1-number2;
		textarea.setText(Double.toString(result));
		}
		if(mul>0){
			result=number1*number2;
		textarea.setText(Double.toString(result));
		}
		if(div>0){
			result=number1/number2;
		textarea.setText(Double.toString(result));
		}	
	}	
}
public double number_reader(){
	double num;
	String s;
	s=textarea.getText();
	num=Integer.parseInt(s);
	return num;
}
}
