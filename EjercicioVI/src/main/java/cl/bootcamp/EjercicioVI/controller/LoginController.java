package cl.bootcamp.EjercicioVI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.bootcamp.EjercicioVI.model.ValidacionService;



/**Se utiliza la anotacion CONTROLLER para definir esta clase como el controlador de algo */
@Controller
public class LoginController {

	/**La anotacion autowired sirve para traer de forma automatica otras clases o servicios */
    @Autowired
    private ValidacionService validacionService;

    /**Esta anotacion es la mas importante, aqui estipulo "/" sera parte de la direccion del index, de esta forma lo puede encontrar
     * para iniciar la aplicacion web*/
    @RequestMapping("/")
    public String index() {
        return "redirect:/index";
    }
    
    /**Aqui usamos el RequestMapping para identificar la direccion "/index" como el url que debe retornar el jsp index
     * No se le agrega el .jsp ya que viene configurado por defecto en el archivo MvcConfiguration */
    @RequestMapping("/index")
    public String login(){
    	return "index";
    }

    /**Aqui defino en especifico que metodo estoy usando para consumir el servicio de validacion de login 
     * Al ser datos sensibles, se usa el metodo POST.
     * Si no se definiera el metodo, se usara el por default que es el GET */
    @RequestMapping(value="/validacionLogin", method=RequestMethod.POST)
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