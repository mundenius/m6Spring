package cl.bootcamp.EjercicioV.dao;

import java.util.ArrayList;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;


import cl.bootcamp.EjercicioV.interfaces.ICapacitacionDao;
import cl.bootcamp.EjercicioV.model.Capacitacion;


public class ImplCapacitacionDAO implements ICapacitacionDao{

	@Override
	public List<Capacitacion> obtenerCapacitacion() {
		// TODO Auto-generated method stub
		Capacitacion c1 = new Capacitacion(1,"24/04/2023", "10:00", "Valparaiso", 50, "1234567-9");
		Capacitacion c2 = new Capacitacion(2,"10/03/2023", "11:00", "Quilpue", 60, "22331465-k");
		Capacitacion c3 = new Capacitacion(3, "27/04/2023", "12:00", "Concon", 45, "98765432-1");
		
		List<Capacitacion> lista = new ArrayList<Capacitacion>();
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		return lista;
	}

	@Override
	public boolean crearCapacitacion(Capacitacion cap) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
