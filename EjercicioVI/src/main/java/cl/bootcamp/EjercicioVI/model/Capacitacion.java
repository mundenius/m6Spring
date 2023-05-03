package cl.bootcamp.EjercicioVI.model;



public class Capacitacion {

	private int idCapacitacion;
	private String capFecha;
	private String capHora;
	private String capLugar;
	private int capDuracion;
	private String idUsuario_Run;
	
	public Capacitacion() {
		
	}
	
	public Capacitacion(int idCapacitacion, String capFecha, String capHora, String capLugar, int capDuracion, String idUsuario_Run) {
		this.idCapacitacion = idCapacitacion;
		this.capFecha = capFecha;
		this.capHora = capHora;
		this.capLugar = capLugar;
		this.capDuracion = capDuracion;
		this.idUsuario_Run = idUsuario_Run;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getCapFecha() {
		return capFecha;
	}

	public void setCapFecha(String capFecha) {
		this.capFecha = capFecha;
	}

	public String getCapHora() {
		return capHora;
	}

	public void setCapHora(String capHora) {
		this.capHora = capHora;
	}

	public String getCapLugar() {
		return capLugar;
	}

	public void setCapLugar(String capLugar) {
		this.capLugar = capLugar;
	}

	public int getCapDuracion() {
		return capDuracion;
	}

	public void setCapDuracion(int capDuracion) {
		this.capDuracion = capDuracion;
	}

	public String getIdUsuario_Run() {
		return idUsuario_Run;
	}

	public void setIdUsuario_Run(String idUsuario_Run) {
		this.idUsuario_Run = idUsuario_Run;
	}

	@Override
	public String toString() {
		return "Capacitacion: " + idCapacitacion + "\nFecha: " + capFecha + "\nHora: " + capHora
				+ "\nLugar: " + capLugar + "\nDuracion: " + capDuracion + "\nRun: " + idUsuario_Run;
	}
	
	
}
