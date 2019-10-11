/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOVendasCliente;
import java.util.ArrayList;
import Model.ModelVendasCliente;
/**
 *
 * @author lucas
 */
public class ControllerVendasCliente {
    private DAOVendasCliente daoVendasCliente = new DAOVendasCliente();
    
    public ArrayList<ModelVendasCliente> getListaVendasCliente(){
        return this.daoVendasCliente.getListaVendasClienteDAO();
        
    }
    
}
