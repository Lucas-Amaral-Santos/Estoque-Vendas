 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class ModelVendasCliente {
    
    private ModelVendas modelVendas;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendasCliente> listaModelVendasCliente;

    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    public ArrayList<ModelVendasCliente> getListaModelVendasCliente() {
        return listaModelVendasCliente;
    }

    public void setListaModelVendasCliente(ArrayList<ModelVendasCliente> listaModelVendasCliente) {
        this.listaModelVendasCliente = listaModelVendasCliente;
    }
    
    
    
}
