package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.ClienteDAO;
import model.ListaDeUsuarios;
import model.UsuarioBeans;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listUser", ListaDeUsuarios.usuarios);
		request.getRequestDispatcher("usuarioscadastrados.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Capturar os Dados
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String sexo = request.getParameter("sexo");
		
		//Verificar os dados
		if(senha.length() < 8 ) {
			String erro = "Senha menor que oito digitos";
			request.setAttribute("msgErro", erro);
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
		}
		
		//salvamento dos dados
		UsuarioBeans usuario = new UsuarioBeans(nome, email, senha, sexo);
		ListaDeUsuarios.usuarios.add(usuario);
		
		//Salvamento no Banco
		ClienteDAO dao = new ClienteDAO();
		dao.CadastraCliente(usuario);
		
		//confirmar cadastro
		request.setAttribute("user", usuario);
		request.getRequestDispatcher("confirma.jsp").forward(request, response);
		
	}

}
