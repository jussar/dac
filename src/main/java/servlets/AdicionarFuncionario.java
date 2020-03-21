package servlets;

import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Funcionario;
import modelo.GeradorSenha;
import percistencia.DAOfuncionario;

@WebServlet("/AdicionarFuncionario")
public class AdicionarFuncionario extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Funcionario _funcionario = new Funcionario();
		_funcionario.setNome("kjkj");
		_funcionario.setCpf("kjk");
		GeradorSenha codigo = new GeradorSenha();
		_funcionario.setCodigo(",m,m,m,");
		 Date now = new Date(System.currentTimeMillis());
		_funcionario.setEntrada(new Date(06/05/2005));
		DAOfuncionario dao = new DAOfuncionario();
		dao.salvar(_funcionario);
	}
	
}
