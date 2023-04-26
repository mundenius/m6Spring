package cl.bootcamp.EjercicioIII.model;

import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class ValidacionService {

    private final HashMap<String, String> usuarios = new HashMap<>();

    public ValidacionService() {
        usuarios.put("admin", "1234");
        usuarios.put("vale", "007");
        usuarios.put("benja", "619");
        usuarios.put("fer", "379");
        usuarios.put("jorge", "456");
    }

    public boolean validacionDatos(String nombre, String password) {
        return usuarios.containsKey(nombre) && usuarios.get(nombre).equals(password);
    }
}