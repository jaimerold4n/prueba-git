import java.time.LocalDate;

public class Medalla {

	private LocalDate fecha;
	private Atleta atleta;
	private String disciplina;
	private Medalla.Metal metal;	
	
	public Medalla(Metal metal,LocalDate fecha,Atleta atleta,String disciplina) {
		this.metal=metal;
		this.fecha=fecha;
		this.atleta=atleta;
		this.disciplina=disciplina;
				
	}
	
	public Metal getMetal() {
		return metal;
	}
	public void setMetal(Metal metal) {
		this.metal=metal;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void getFecha(LocalDate fecha) {
		this.fecha=fecha;
	}
	public Atleta getAtleta() {
		return atleta;
	}
	public void setAtleta(Atleta atleta) {
		this.atleta=atleta;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina=disciplina;
	}
	

	public enum Metal{
		ORO,PLATA,BRONCE
		}
	
	public String toString() {
			return "Medalla:" + metal+ "fecha:"+fecha+"atleta:"+atleta+"disciplina: "+disciplina;
	}
}
