package Controller;

import DAO.DaoProdutos;
import Model.ModelProdutos;
import java.util.ArrayList;
/**
 *
 * @author lucas
 */
public class ControllerProdutos {
    private DaoProdutos daoProdutos = new DaoProdutos();
    
    
    public int salvarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    public ModelProdutos retornarProdutoControllerDAO(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    public ModelProdutos retornarProdutoControllerDAO(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListasProdutosDAO();
    }
    /**
     * 
     * Alterar Lista de Produtos no banco
     * @param pListaModelProdutos
     * @return 
     */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutoDAO(pListaModelProdutos);
    }
    
}
