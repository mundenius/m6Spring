package cl.bootcamp.EjercicioIII.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contacto
 */
@WebServlet(name = "Contacto", urlPatterns = {"/Contacto"})
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("view/contacto.jsp").forward(request, response);
//		response.getWriter().append("/EjercicioI/src/main/java/Contacto.java").append(request.getContextPath());
//        //CAPTURAR LOS DATOS QUE VIENEN DEL REQUEST
//        String email = request.getParameter("email");
//        String nombre = request.getParameter("name");
//        String comentarios = request.getParameter("comentarios");
//
//        //ENVIAR LOS DATOS CAPTURADOS A LA TERMINAL
//        System.out.println("Hola, Soy " + nombre + ", mi correo es: " + email + ", y quiero comentar lo siguiente: " + comentarios + ".");
//
//        //ENVIAR MENSAJE SATISFACTORIO A LA VISTA
//        request.setAttribute("mensajeExito", "Mensaje enviado satisfactoriamente. ¡Muchas Gracias!");
//
//        //VOLVER A RECARGAR LA MISMA PÁGINA
//        doGet(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
