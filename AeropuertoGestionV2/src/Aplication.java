

import ar.edu.ub.p3.aeropuerto.gestion.view.abm.aerolinea.ActionVentanaABMAerolinea;
import ar.edu.ub.p3.aeropuerto.gestion.view.abm.aeropuerto.ActionVentanaABMAeropuerto;
import ar.edu.ub.p3.aeropuerto.modelo.EstadoAerolinea;
import ar.edu.ub.p3.aeropuerto.modelo.EstadoAeropuerto;

public class Aplication {

	public static void main(String[] args) {
		
		ActionVentanaABMAeropuerto.generarVentana( new EstadoAeropuerto() );
		ActionVentanaABMAerolinea.generarVentana( new EstadoAerolinea() );
		//ActionVentanaABMAvion.generarVentana( new EstadoAeropuerto() );
		//ActionVentanaABMVuelo.generarVentana( new EstadoAeropuerto() );
	}

}
