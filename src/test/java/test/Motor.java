package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro=registro;
		
	}
    
	void asignarTipo(String tipo) {
		if ((tipo=="gasolina")||(tipo=="electrico")){ //si el tipo es uno de estos dos entonces cambia
				this.tipo=tipo;
		}
	}
}
