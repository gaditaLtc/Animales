package horas;

public class Horas {

	private int horas;
	private int minutos;
	private int segundos;
	
	public Horas(int horas, int minutos, int segundos) {
		if (validarHora(horas,minutos,segundos)){
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		}
		else System.out.println("Hay un error en la hora - " + horas + ":" + minutos +":"+segundos);
	}
	public Horas() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	private boolean validarHora(int horas, int minutos, int segundos){
		boolean valida=true;
		if ((horas>24) || (minutos>60)||(segundos>60))
			
			valida=false;
			
	return valida;	
			}
	
	public Horas sumaHora (Horas h){
		Horas hn=new Horas();
		int tempSegundos=0;
		int tempMinutos=0;
		int tempHoras=0;
		tempSegundos=this.segundos+h.getSegundos();
		
		if (tempSegundos<60) hn.setSegundos(tempSegundos);
		else {hn.setSegundos((tempSegundos)%60);
				hn.setMinutos(1);
		}
		tempMinutos=this.minutos + h.getMinutos() + hn.getMinutos();
		if (tempMinutos<60) hn.setMinutos(tempMinutos);
		else {hn.setMinutos(tempMinutos%60);
				hn.setHoras(1);
		}
		tempHoras=this.horas+ h.getHoras() + hn.getHoras();
		if (tempHoras<24) hn.setHoras(tempHoras);
		else {hn.setHoras(tempHoras%24);
		System.out.print ("La suma obtiene un día además de: ");
}
		
		
		return hn;
	}
	
	
	public  String  visualizarHora() {
		String cadenaHora;
		if (this.horas>=10) cadenaHora=this.horas + ":";
		else cadenaHora="0"+ this.horas + ":";
		if (this.minutos>=10) cadenaHora=cadenaHora+ this.minutos + ":";
		else cadenaHora=cadenaHora+"0"+ this.minutos + ":";
		if (this.segundos>=10) cadenaHora=cadenaHora+this.segundos ;
		else cadenaHora=cadenaHora+"0"+ this.segundos;
		return cadenaHora;
	}
	
	public void visualizarHoraBis() {
		String fechaFormato=String.format("%02d:%02d:%02d", this.horas,this.minutos,this.segundos);
		System.out.println(fechaFormato );
	}
	
	public int tiempoMedianoche () {
		return (((this.horas*60)+this.minutos*60)+this.segundos);
	}
	}
