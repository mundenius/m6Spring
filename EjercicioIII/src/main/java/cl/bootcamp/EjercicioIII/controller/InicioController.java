package cl.bootcamp.EjercicioIII.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {

	@RequestMapping("/inicio")
	public String inicio() {
		return "inicio.jsp";
	}
}
