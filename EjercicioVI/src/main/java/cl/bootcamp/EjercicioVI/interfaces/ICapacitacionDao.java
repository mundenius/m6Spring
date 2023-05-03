package cl.bootcamp.EjercicioVI.interfaces;

import java.util.List;

import cl.bootcamp.EjercicioVI.model.Capacitacion;

public interface ICapacitacionDao {

	public List<Capacitacion> obtenerCapacitacion();
	
	public boolean crearCapacitacion(Capacitacion cap);
}
