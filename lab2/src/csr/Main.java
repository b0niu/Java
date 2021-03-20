//package com.company;
package csr;

import ui.MainUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

	CarShowroomContainer mat_kontener = new CarShowroomContainer();

	//CarShowroom salon_1 = new CarShowroom("salon_1",10);

	//CarShowroom salon_2 = new CarShowroom("salon_2",5);
	CarShowroom salon_1 =mat_kontener.addCenter("salon_1",10);
	CarShowroom salon_2 =mat_kontener.addCenter("salon_2",5);
	CarShowroom salon_3 =mat_kontener.addCenter("salon_3",4);
	CarShowroom salon_4 =mat_kontener.addCenter("salon_4",100);

	Vehicle poj = new Vehicle("Opel","Astra", ItemCondition.USED,8000, 2002, 150000, 2.0);
	Vehicle poj1 = new Vehicle("BMW","X1", ItemCondition.NEW,80000, 2010, 100000, 3.0);
	Vehicle poj2 = new Vehicle("Audi","A4", ItemCondition.USED,30000, 2008, 250000, 2.5);
	Vehicle poj3 = new Vehicle("Opel","Astra H", ItemCondition.USED,8000, 2002, 200000, 1.9);
	Vehicle poj4 = new Vehicle("Fiat","Stilo", ItemCondition.DAMAGED,5000, 2002, 180000, 1.6);
	Vehicle poj5 = new Vehicle("Fiat","Stilo", ItemCondition.USED,4500, 2004, 240000, 1.9);
	Vehicle poj6 = new Vehicle("Audi","A3", ItemCondition.DAMAGED,10000, 2010, 180000, 2.0);
	Vehicle poj7 = new Vehicle("Volkswagen","Golf", ItemCondition.USED,4500, 2004, 240000, 1.9);
	Vehicle poj8 = new Vehicle("Rand Rover","Evoque", ItemCondition.NEW,200000, 2015, 1000, 4.0);

	salon_1.addProduct(poj);
	salon_1.addProduct(poj3);
	salon_1.addProduct(poj1);
	salon_1.addProduct(poj2);
	salon_1.addProduct(poj4);
	salon_1.addProduct(poj6);
	salon_1.addProduct(poj8);
	salon_1.addProduct(poj7);

	salon_2.addProduct(poj1);
	salon_2.addProduct(poj3);
	salon_2.addProduct(poj4);
	salon_2.addProduct(poj6);
	salon_2.addProduct(poj8);

	salon_3.addProduct(poj5);
	salon_3.addProduct(poj5);
	salon_3.addProduct(poj5);

	salon_4.addProduct(poj6);
	salon_4.addProduct(poj8);
	salon_4.addProduct(poj7);
	salon_4.addProduct(poj1);

		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createGUI(mat_kontener);

			}
		});

	}
	private static void createGUI(CarShowroomContainer cont){

    	MainUI ui = new MainUI(cont);
    	JPanel root = ui.getRootPanel();
    	JFrame frame = new JFrame();

    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setContentPane(root);
		frame.setSize(500, 300);
    	//frame.pack();
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);

	}
}
