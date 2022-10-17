package s3t3Floristeria;

import java.io.Serializable;

public abstract class Producto implements Serializable {
	protected String nombre;
	protected double precio;
	
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	public abstract String getInfo();
	
	public double getPrecio() {
		return precio;
	}


}
