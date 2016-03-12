/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.HashSet;
import java.util.Set;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import static passwordholder2.PasswordHolder2.beans;

/**
 *
 * @author Toshiba
 */
public class MyTableModel implements TableModel{

    @Override
    public int getRowCount() {
        return beans.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int i) {
        switch(i){
            case 0:
                return "Имя сервиса";
            case 1:
                   return "Логин";
            case 2:
                    return "Пароль";
            case 3: 
                    return "Дополнительно";
        }
        return "";
                           
        
    }

    @Override
    public Class<?> getColumnClass(int i) {
         return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        if(i==0){
            return false;
        }
        else
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      MyBean bean = beans.get(rowIndex);
        switch(columnIndex){
           case 0:
            return bean.getWhereFrom();
        case 1:
            return bean.getLogin();
        case 2:
            return bean.getPassword();
       case 3: 
            return bean.getOptions();
        }
 
    return "";
        
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
           MyBean bean = beans.get(rowIndex);
        switch(columnIndex){
            case 0:{ bean.setWhereFrom((String)o);
            break;}
            case 1:{ bean.setLogin((String)o);   
            break;}
            
            case 2:{ bean.setPassword((String)o);   
            break;}
            
            
            case 3: {bean.setOptions((String)o);   
            break;}
            }
    }

    
private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
    @Override
    public void addTableModelListener(TableModelListener tl) {
      listeners.add(tl);
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        listeners.remove(tl);
    }
    
    
}
