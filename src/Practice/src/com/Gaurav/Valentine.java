package com.Gaurav;

import java.awt.HeadlessException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Valentine extends JFrame {

	static JFrame frame;
	JLabel label;
	ImageIcon image;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hii Gaurav.. How may i help you ??");
       Scanner s = new Scanner(System.in);
		String st = s.next();
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   System.out.println("Yess Sure... Hold on ");
	   System.out.println();
	   System.out.println();
	
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	System.out.println("Searching..... :-)");
	System.out.println();
	System.out.println();
	
	try {
		Thread.sleep(1100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	System.out.println("Still Searching.............");
	System.out.println();
	System.out.println();
	
	try {
		Thread.sleep(2500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	System.out.println("Don't lose Hope Buddy.. ");
	
	System.out.println();
	
	System.out.println();
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	System.out.println("::::: Finally I found your Love:::::");
	System.out.println();
	System.out.println();
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	System.out.println("Here She is ...... <3");
	System.out.println();
	System.out.println();
	
	Valentine v = new Valentine();
	}
	public Valentine() throws HeadlessException {
		super();
		frame = new JFrame("Image text to display");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			image = new ImageIcon(getClass().getResource("IMG-0899.png"));
			label=new JLabel(image);
			frame.add(label); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	frame.setSize(350,350);
	frame.setVisible(true);
	}

}
