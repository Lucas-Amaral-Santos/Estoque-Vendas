/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOProdutosVendasProdutos;
import Model.ModelProdutosVendasProdutos;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class ControllerProdutosVendasProdutos {
    private DAOProdutosVendasProdutos dAOProdutosVendasProdutos = new DAOProdutosVendasProdutos();
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController(int pCodigoVenda){
        return this.dAOProdutosVendasProdutos.getListaProdutosVendasProdutosDAO(pCodigoVenda);
    }

    
}
