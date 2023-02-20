package test;

public class Auto {
	String modelo;
	int precio;
	String marca;
	Asiento[] asientos;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	int cantidadAsientos() {
		int puesto=0;
		for (int i=0; i<asientos.length; i++) {//por cada asiento que no esté vacio se suma 1 a la cantidad de puestos
			if(asientos[i]!=null)
				puesto++;
		}
		
		return puesto;
	
	}
	
	
	String verificarIntegridad() {
		boolean result=true; //inicia el valor como verdadero
		if(this.registro==motor.registro){ //todos tienen que ser iguales, entonces cojo los valores fijos y si estos de entrada son iguales ya continuo con el ciclo para ver si los asientos también son iguales
			for (Asiento asiento: this.asientos) { //por asiento en el array de asientos(ciclo donde se coje cada elemento de asientos)
				if (asiento!=null){ //omitir los que están vacíos ya que no se pueden comparar con nada
					if (asiento.registro!=this.registro) {
						result=false;
						break;
					}
				}
			}
		}
		return result? "Auto original":"Las piezas no son originales"; //string resultado=result? valorVerdader:valorFalso
	}
	
	

}
