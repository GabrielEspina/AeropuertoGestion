package ar.edu.ub.p3.aeropuerto.gestion.view.abm.aeropuerto;

import ar.edu.ub.p3.aeropuerto.gestion.view.PanelLista;
import ar.edu.ub.p3.aeropuerto.modelo.Aeropuerto;
import ar.edu.ub.p3.aeropuerto.modelo.EstadoAeropuerto;

public class ActionVentanaABMAeropuerto {
		
		public static void generarVentana( EstadoAeropuerto estadoAeropuerto ) {
	
			PanelFichaAeropuerto ficha = new PanelFichaAeropuerto( estadoAeropuerto );
			
			PanelLista<Aeropuerto> 	lista = new PanelLista<Aeropuerto>( estadoAeropuerto );
			
			lista.setTableModel( new TableModelAeropuerto( estadoAeropuerto ) );				
			
			lista.setPanelFicha(ficha);
			ficha.setPanelLista(lista);
			
			new VentanaGestionABMAeropuerto(ficha,lista);

		}
	
		
			
	
}
