package PProdutos;
import java.util.ArrayList;
import java.util.List;
import PProdutos.Produto;



public class GerenciadorProdutos {
	
	private static List<Produto> Produtos = new ArrayList<Produto>() ;
		
		public void salvar(Produto Produto){
			Produtos.add(Produto);
		}
		
		public List<Produto> getProduto(){
			return Produtos;			
			
		}
		
		
		
		
		
		
	

	
	
	

}
