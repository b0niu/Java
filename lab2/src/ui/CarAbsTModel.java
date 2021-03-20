package ui;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class CarAbsTModel extends AbstractTableModel {

    List<String> nazwy = new ArrayList<>();
    String[] nazywKol;
    public CarAbsTModel(List<String> n, String[] nc){
        nazwy=n;
        nazywKol=nc;
    }


    @Override
    public String getColumnName(int column){
        return nazywKol[column];
    }

    @Override
    public int getRowCount() {
        return nazwy.size();
    }

    @Override
    public int getColumnCount() {
        return nazywKol.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return nazwy.get(rowIndex);
    }
}
