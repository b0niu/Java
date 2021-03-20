package ui;
import csr.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainUI {

    private JPanel rootPanel;
    private JPanel HeadPanel;
    private JPanel CarSRPanel;
    private JPanel CarPanel;
    private JPanel FootPanel;
    private JTable SalonTable;
    private JTable carsTable;
    private JTable specif;
    private JButton removeCrB;
    private JButton removeVehicleB;
    private JButton newCrB;
    private JButton newVehicleB;
    private JLabel tytul;
    private JButton sortButton;
    private JButton sort2Button;
    String[] nazkol=new String[1];
    public JPanel getRootPanel(){
        return rootPanel;
    }

    public MainUI(CarShowroomContainer csrc){
        nazkol[0]="CarShowRooms";
        CarAbsTModel tab1 = new CarAbsTModel(csrc.getNazwy(),nazkol);
        SalonTable.setModel(tab1);
        SalonTable.getSelectionModel().addListSelectionListener(e1 ->{
            if(SalonTable.getSelectedRow() > -1){
                nazkol[0]="Cars";
                CarAbsTModel tab2 = new CarAbsTModel(csrc.getCars(SalonTable.getValueAt(SalonTable.getSelectedRow(),0).toString()),nazkol);
                carsTable.setModel(tab2);
                carsTable.getSelectionModel().addListSelectionListener(e2 ->{
                    if(carsTable.getSelectedRow() > -1) {
                        nazkol[0] ="INFO";
                        CarAbsTModel tab3= new CarAbsTModel(csrc.getSalon(SalonTable.getValueAt(SalonTable.getSelectedRow(),0).toString()).search(carsTable.getValueAt(carsTable.getSelectedRow(),0).toString()).Info(),nazkol);
                        specif.setModel(tab3);
                    }
                });
            }
        });

        DefaultTableModel dModel = new DefaultTableModel();

        removeCrB.addActionListener(e3 ->{
            String w = SalonTable.getValueAt(SalonTable.getSelectedRow(),0).toString();
            csrc.removeCenter(w);
            nazkol[0]="CarShowRooms";
            CarAbsTModel tab_rCrSR = new CarAbsTModel(csrc.getNazwy(),nazkol);
            SalonTable.setModel(tab_rCrSR);
            carsTable.setModel(dModel);

        });

        removeVehicleB.addActionListener(e4 -> {
            String ktSalon = SalonTable.getValueAt(SalonTable.getSelectedRow(),0).toString();
            String ktProdukt = carsTable.getValueAt(carsTable.getSelectedRow(),0).toString();
            csrc.getSalon(ktSalon).getProduct(csrc.getSalon(ktSalon).search(ktProdukt));
            nazkol[0]="Cars";
            CarAbsTModel tab_rV = new CarAbsTModel(csrc.getCars(SalonTable.getValueAt(SalonTable.getSelectedRow(),0).toString()),nazkol);
            carsTable.setModel(tab_rV);
            specif.setModel(dModel);
        });

        newCrB.addActionListener(e5 ->{
            String nazwa=JOptionPane.showInputDialog("Podaj nazwe:");
            int pojemnosc=Integer.parseInt(JOptionPane.showInputDialog("Podaj pojemnosc: "));
            csrc.addCenter(nazwa,pojemnosc);
            nazkol[0]="CarShowRooms";
            CarAbsTModel tab_aC = new CarAbsTModel(csrc.getNazwy(),nazkol);
            SalonTable.setModel(tab_aC);
            carsTable.setModel(dModel);
            specif.setModel(dModel);
        });

        newVehicleB.addActionListener(e6 -> {
            String mar = JOptionPane.showInputDialog("Podaj marke:");
            String mod = JOptionPane.showInputDialog("Podaj model");
            String st = JOptionPane.showInputDialog("Podaj stan:");
            double c = Double.parseDouble(JOptionPane.showInputDialog("Podaj cene:"));
            int rok = Integer.parseInt(JOptionPane.showInputDialog("Podaj rok produkcji:"));
            int prze =Integer.parseInt(JOptionPane.showInputDialog("Podaj przebieg:"));
            double sil = Double.parseDouble(JOptionPane.showInputDialog("Podaj pojemnosc silnika"));
            ItemCondition stan;
            if(st.equals("NEW")) stan=ItemCondition.NEW;
            else if(st.equals("USED")) stan=ItemCondition.USED;
            else if(st.equals("DAMAGED")) stan=ItemCondition.DAMAGED;
            else stan=ItemCondition.USED;
            Vehicle auto = new Vehicle(mar,mod, stan,c,rok,prze,sil);
            String salon = SalonTable.getValueAt(SalonTable.getSelectedRow(),0).toString();
            csrc.getSalon(salon).addProduct(auto);
            nazkol[0]="Cars";
            CarAbsTModel tab_aV = new CarAbsTModel(csrc.getCars(SalonTable.getValueAt(SalonTable.getSelectedRow(),0).toString()),nazkol);
            carsTable.setModel(tab_aV);
            specif.setModel(dModel);
        });

        sortButton.addActionListener(e7 -> {
            nazkol[0] ="CarShowRooms";
            CarAbsTModel tab_s = new CarAbsTModel(csrc.sort(),nazkol);
            SalonTable.setModel(tab_s);
            carsTable.setModel(dModel);
            specif.setModel(dModel);
        });

        sort2Button.addActionListener(e7 -> {
            String w = SalonTable.getValueAt(SalonTable.getSelectedRow(),0).toString();
            CarShowroom salon = csrc.getSalon(w);
            int rodz = Integer.parseInt(JOptionPane.showInputDialog("Podaj rodzaj sortowanie 1->Nazwa ,2->Amount:"));
            nazkol[0] ="Cars";
            CarAbsTModel tab_s2;
            if(rodz==1){  tab_s2 = new CarAbsTModel(salon.sortByName(),nazkol);}
            else{ tab_s2 = new CarAbsTModel(salon.sortByAmount2(),nazkol);}
            carsTable.setModel(tab_s2);
            specif.setModel(dModel);
        });


    }
}
