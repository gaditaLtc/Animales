package citasYVisitas;


import animales.Mamifero;

public class Visitas {
	private Citas cita;
	private String diagnostico;
	private float cobro;
	
	
	public Visitas(Citas cita, String diagnostico) {
		super();
		this.cita = cita;
		this.diagnostico = diagnostico;
		this.cobro=0;
		
	}
	public Citas getCita() {
		return cita;
	}
	public void setCita(Citas cita) {
		this.cita = cita;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	@Override
	public String toString() {
		return "Visitas [cita=" + cita.toString() + ", diagnostico=" + diagnostico + ", cobro=" + cobro + "]";
	}
	public void resultadoVisita(){
		System.out.println("La visita del animal ha sido:\n" + this.toString());
	}
	
	public void cobrar(){
		if (this.cita.getAnimal() instanceof Mamifero ) this.cobro=50.3F;
		else this.cobro=30.5F;
	}

}
