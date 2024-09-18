import java.time.LocalDate;


public class Atleta {

	
	private int codigo;
	private String nombre;
	private  Genero genero;
	private String pais;
	private LocalDate fechaNacimiento;	
	private float altura;
	private float peso;
	
	
	public Atleta(int codigo,String nombre,Genero genero,String pais,LocalDate fechaNacimiento,float altura,float peso) {
	
	this.codigo= codigo;
	this.nombre=nombre;
	this.genero=genero;
	this.pais= pais;
	this.fechaNacimiento= fechaNacimiento;
	this.altura=altura;
	this.peso=peso;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero){
		this.genero=genero;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais=pais;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura=altura;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso (float peso) {
		this.peso=peso;
	}
	
	public String toString() {
		return "Atleta, "+"codigo: " + codigo +" nombre: "+ nombre + "genero: "+ genero+ "pais: "+ pais+ "fecha nacimiento: "+ fechaNacimiento+ "altura: "+altura+ "peso: "+peso;
	}

	public enum Genero {

	HOMBRE,MUJER
}
	}
	



