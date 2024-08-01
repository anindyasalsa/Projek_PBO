/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class TableModelSignUp {

public class TabelModelSignUp extends AbstractTableModel{
         
    List<SignUp> lstSignUp;
    
    public TabelModelSignUp(List<SignUp> lstSignUp)
    {
        this.lstSignUp = lstSignUp;
    }
    
    @Override
    public int getRowCount() {
        return this.lstSignUp.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column)
    {
        switch (column){
            case 0:
                return "Username";
            case 1:
                return "Email";
            case 2:
                return "Password";
            case 3:
                return "Confirm_Password";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch (columnIndex){
            case 0:
                return lstSignUp.get(rowIndex).getUsername();
            case 1:
                return lstSignUp.get(rowIndex).getEmail();
            case 2:
                return lstSignUp.get(rowIndex).getPassword();
            case 3:
                return lstSignUp.get(rowIndex).getConfirm_Password();   
            default:
                return null;
        }
    }
}
}


