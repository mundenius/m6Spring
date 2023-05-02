package cl.bootcamp.EjercicioIV.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;

import cl.bootcamp.EjercicioIV.interfaces.CRUD;
import cl.bootcamp.EjercicioIV.model.Capacitacion;


public class ImplCapacitacionDAO implements CRUD<Capacitacion>{
	
	@Override
	public List<Capacitacion> listarTodos() {
		// TODO Auto-generated method stub

//		List<Capacitacion> lista = new ArrayList<Capacitacion>();
//
//		Capacitacion cap1 = new Capacitacion("1", "24/06/2022", "12:00", "Quilpue", "60", 12345678);
//		Capacitacion cap2 = new Capacitacion("2", "03/04/2023", "10:00", "Valparaiso", "120", 12234566);
//		Capacitacion cap3 = new Capacitacion("3", "01/02/2023", "11:00", "Con-Con", "30", 11223345);
//		
//		lista.add(cap1);
//		lista.add(cap2);
//		lista.add(cap3);
//		return lista;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(Capacitacion d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Capacitacion d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Capacitacion d) {
		// TODO Auto-generated method stub
		
	}

}
