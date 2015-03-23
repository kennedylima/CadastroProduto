package PProdutos;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/ProdutoController"})
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GerenciadorProdutos GP = new GerenciadorProdutos ();
		List<Produto> Produto = GP.getProduto();
		
		request.setAttribute("Produto", Produto);
		
		RequestDispatcher tela = request.getRequestDispatcher("Produto.jsp");
		tela.forward(request, response);

		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String descricao = request.getParameter("descricao");
		double valor = Double.parseDouble(request.getParameter("valor"));
		
		
		Produto listProduto = new Produto();
		listProduto.setId(id);
		listProduto.setDescricao(descricao);
		listProduto.setValor(valor);
		
		
		GerenciadorProdutos GP = new GerenciadorProdutos();
		GP.salvar(listProduto);
		doGet(request, response);
		
		
		
		
	}

}
