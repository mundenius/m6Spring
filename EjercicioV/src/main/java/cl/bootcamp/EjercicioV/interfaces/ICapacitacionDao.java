package cl.bootcamp.EjercicioV.interfaces;

import java.util.List;

import cl.bootcamp.EjercicioV.model.Capacitacion;

public interface ICapacitacionDao {

	public List<Capacitacion> obtenerCapacitacion();
	
	public boolean crearCapacitacion(Capacitacion cap);
}
