package cl.bootcamp.EjercicioIV.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/capacitaciones")
public class CapacitacionController {

//	private ImplCapacitacionDAO capacitacion;
//	
	@RequestMapping(value="/crearCapacitacion", method= RequestMethod.GET)
	public ModelAndView mostrarFormulario(){
		return new ModelAndView("crearCapacitacion");
	}
	
//	@PostMapping("/crearCapacitacion")
//	public String procesarFormulario(@ModelAttribute("capcitaciones")Capacitacion capacitacion) {
//		ImplCapacitacionDAO.crear(capacitacion);
//		return "redirect:/capacitaciones/listar";
//	}
//	
//	@GetMapping("/listar")
//	public ModelAndView listarCapacitacion() {
//		List<Capacitacion> capacitaciones = ImplCapacitacionDAO.listarTodos();
//		ModelAndView mav = new ModelAndView("listarCapacitaciones");
//		mav.addObject("listacap", capacitaciones);
//		return mav;
//	}
}
