package cl.bootcamp.EjercicioV.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.EjercicioV.interfaces.ICapacitacionDao;
import cl.bootcamp.EjercicioV.dao.ImplCapacitacionDAO;
import cl.bootcamp.EjercicioV.model.Capacitacion;


@Controller
@RequestMapping("/capacitaciones")
public class CapacitacionController {

//	private ImplCapacitacionDAO capacitacion;
//	
	@RequestMapping(value="/crearCapacitacion", method= RequestMethod.GET)
	public ModelAndView mostrarFormulario(){
				return new ModelAndView("crearCapacitacion");
	}
	
	@Autowired
	private ICapacitacionDao icapdao;
	@RequestMapping(value="/listarCapacitaciones", method = RequestMethod.GET)
	public ModelAndView listarCapacitaciones(HttpServletResponse response) throws IOException{
		List<Capacitacion> capacitaciones = icapdao.obtenerCapacitacion();
//		System.out.println(capdao.obtenerCapacitacion());
		System.out.println(capacitaciones);
//		for(int i = 0 ; i < capacitaciones.size() ; i++) {
//			System.out.println(capacitaciones.toString());
//	}
		ModelAndView mav = new ModelAndView("listarCapacitaciones");
		mav.addObject("listaCapacitacion", capacitaciones);
		return mav;
//			// Creamos una lista de capacitaciones
//			List<Map<String, String>> capacitaciones = new ArrayList<Map<String, String>>();
//			
//			// Creamos una capacitación
//			Map<String, String> capacitacion1 = new HashMap<String, String>();
//			capacitacion1.put("idcapacitacion", "1");
//			capacitacion1.put("capfecha", "2023-05-15");
//			capacitacion1.put("caphora", "10:00");
//			capacitacion1.put("caplugar", "Santiago");
//			capacitacion1.put("capduracion", "2 horas");
//			capacitacion1.put("cliente_rut_cliente", "76.543.210-K");
//			capacitacion1.put("capnombre", "Introducción a Spring Boot");
//			capacitacion1.put("capasistentes", "20");
//			
//			// Agregamos la capacitación a la lista
//			capacitaciones.add(capacitacion1);
//			
//			// Creamos otra capacitación
//			Map<String, String> capacitacion2 = new HashMap<String, String>();
//			capacitacion2.put("idcapacitacion", "2");
//			capacitacion2.put("capfecha", "2023-05-20");
//			capacitacion2.put("caphora", "14:00");
//			capacitacion2.put("caplugar", "Viña del Mar");
//			capacitacion2.put("capduracion", "3 horas");
//			capacitacion2.put("cliente_rut_cliente", "99.876.543-2");
//			capacitacion2.put("capnombre", "Introducción a HTML y CSS");
//			capacitacion2.put("capasistentes", "15");
//			
//			// Agregamos la capacitación a la lista
//			capacitaciones.add(capacitacion2);
//			
//			// Creamos el ModelAndView y le pasamos las capacitaciones como atributo
//			ModelAndView modelAndView = new ModelAndView("listarCapacitaciones");
//			modelAndView.addObject("capacitaciones", capacitaciones);
			
		}
	
	private ImplCapacitacionDAO capdao;
	
	public CapacitacionController(ImplCapacitacionDAO capdao) {
		this.capdao = capdao;
	}
	
	@PostMapping("/crearCapacitacion")
	public String procesarFormulario(@ModelAttribute("capacitaciones")Capacitacion capacitacion) {
		capdao.crearCapacitacion(capacitacion);
		return "redirect:/capacitaciones/listar";
	}
}
//	
//	@GetMapping("/listar")
//	public ModelAndView listarCapacitacion() {
//		List<Capacitacion> capacitaciones = ImplCapacitacionDAO.listarTodos();
//		ModelAndView mav = new ModelAndView("listarCapacitaciones");
//		mav.addObject("listacap", capacitaciones);
//		return mav;
//	}

