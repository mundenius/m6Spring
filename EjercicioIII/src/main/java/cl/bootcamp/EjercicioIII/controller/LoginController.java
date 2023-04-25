package cl.bootcamp.EjercicioIII.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.bootcamp.EjercicioIII.model.ValidacionService;

@Controller
//@RequestMapping("/EjercicioIII")
public class LoginController {

    @Autowired
    private ValidacionService validacionService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/index";
    }

    @RequestMapping("/validacionLogin")
    public String validar(@RequestParam("usuario") String nombre, @RequestParam("pass") String password, Model modelo) {
        if(validacionService.validacionDatos(nombre, password)) {
            modelo.addAttribute("nombre", nombre);
            return "inicio";
        } else {
            modelo.addAttribute("mensaje", "Nombre de usuario o contraseña incorrectos");
            return "index";
        }
    }
}
