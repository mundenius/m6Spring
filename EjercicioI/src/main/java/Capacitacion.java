

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Index
 */
public class Capacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Capacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Cliente> clients = mostrarClientes();
		request.setAttribute("clientes", clients);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Capacitacion.jsp");
		rd.forward(request, response);
	}
	
	private List<Cliente> mostrarClientes() {
		ClienteDAO cdao = new UsuarioDaoImpl();
		List<Cliente> clients = cdao.getAllClientes();

		return clients;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
