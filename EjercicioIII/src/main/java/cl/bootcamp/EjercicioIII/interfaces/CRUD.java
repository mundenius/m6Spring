package cl.bootcamp.EjercicioIII.interfaces;

import java.util.List;

public interface CRUD<D> {

	List<D>listarTodos();
	void registrar(D d);
	void actualizar(D d);
	void eliminar(D d);
}
