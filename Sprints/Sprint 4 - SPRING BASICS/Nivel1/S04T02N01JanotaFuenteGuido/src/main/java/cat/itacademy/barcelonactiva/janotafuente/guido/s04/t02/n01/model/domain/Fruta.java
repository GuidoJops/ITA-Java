package cat.itacademy.barcelonactiva.janotafuente.guido.s04.t02.n01.model.domain;
import jakarta.persistence.*;



@Entity
@Table(name = "frutas")
public class Fruta {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String nombre;
	@Column
	private int cantidadQuilos;
	
	
	public Fruta () {
		
	}
	
	public Fruta( String nombre, int cantidadQuilos) {
		this.nombre = nombre;
		this.cantidadQuilos = cantidadQuilos;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadQuilos() {
		return cantidadQuilos;
	}
	public void setCantidadQuilos(int cantidadQuilos) {
		this.cantidadQuilos = cantidadQuilos;
	}

	@Override
	public String toString() {
		return "Fruta [id=" + id + ", nombre=" + nombre + ", cantidadQuilos=" + cantidadQuilos + "]";
	}
}
