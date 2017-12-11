package fechas;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		if (validarFecha(dia,mes,anio)){		
			this.dia = dia;
			this.mes = mes;
			this.anio = anio;
	}
		else System.out.println ("La fecha no es válida");
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public static boolean esBisiesto(int aa){
		boolean bisiesto=false;
		if (((aa%4)==0)||(((aa%100)==0)&&((aa%400)!=0))) bisiesto=true;
		return bisiesto;
	}
	public static int numDiasMes (int mm, int aa){
		int dd=0;
		switch (mm){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: dd=31; break;
			case 4:
			case 6:
			case 9:
			case 11: dd=30; break;
			case 2:if (esBisiesto (aa)) dd=29;
				else dd=28;
				break;				
		}
		return dd;
		
	}	
	public  boolean validarFecha (int d, int m, int a){
		boolean valFecha=false;
		if ((d<=numDiasMes(m,a))&& (m<=12)) valFecha=true;
		return valFecha;
	}
	public String escribirFecha(String literal){
		String cad="";
		cad=this.dia+ " de "+ literal+" de "+this.anio;
		return cad;
		
	}
	public String escribirFecha (){
		String cad="";
		cad=this.dia+":"+this.mes+":"+this.anio;
		return cad;
		
	}
	public int esMayor(Fecha f){
		int fch=0;
		if (f.anio>this.anio)fch=1;
		else if (f.anio<this.anio) fch=-1;
		else if (f.mes>this.anio)fch=1;
		else if (f.mes<this.anio)fch=-1;
		else if (f.dia>this.dia)fch=-1;
		else if (f.dia<this.dia)fch=1;
		else fch=0;
		return fch;
	}
	public int diasPasados (Fecha f){
		int dd=0;
		if (esMayor (f)==1){
			for (int i=this.anio+1; i<f.anio;i++){
				if (esBisiesto(i)) dd=dd+366;
				else dd=dd+365;}
			for (int m=1; m<f.mes;m++)dd=dd+numDiasMes(m,f.anio);
			dd=dd+f.dia;
			
			for (int m=this.mes+1;m<=12;m++)dd=dd+numDiasMes(m, f.anio);
			dd=dd+(numDiasMes(this.mes, this.anio)-this.dia);		
			}
			else if (esMayor(f)==-1){
				for (int i=f.anio; i<this.anio;i++){
					if (esBisiesto(i)) dd=dd+366;
					else dd=dd+365;
				}
				for (int m=1; m<this.mes;m++)dd=dd+numDiasMes(m,this.anio);
				dd=dd+f.dia;
				for (int m=f.mes+1;m<=12;m++)dd=dd+numDiasMes(m, this.anio);
				dd=dd+(numDiasMes(f.mes, f.anio)-f.dia);		
				}
		return dd;
			}
				
	public String diaSemana (int i)	{
		String dia="";
		switch (i){
		case 1:dia="lunes";break;
		case 2:dia="martes";break;
		case 3:dia="miercoles";break;
		case 4:dia="jueves";break;
		case 5:dia="viernes";break;
		case 6:dia="sabado";break;
		case 7:dia="domingo";break;
		}
		return dia;
	}
	public static String mesNombre (int i)	{
		String mm="";
		switch (i){
		case 1:mm="enero";break;
		case 2:mm="febrero";break;
		case 3:mm="marzo";break;
		case 4:mm="abril";break;
		case 5:mm="mayo";break;
		case 6:mm="junio";break;
		case 7:mm="julio";break;
		case 8:mm="agosto";break;
		case 9:mm="septiembre";break;
		case 10:mm="octubre";break;
		case 11:mm="noviembre";break;
		case 12:mm="diciembre";break;
		}
		return mm;
	}

	public String diaFecha(){
		String dF="";
		Fecha tempFecha=new Fecha(7,1,1901);
		int ddd=this.diasPasados(tempFecha);
		System.out.println(ddd);
		dF=diaSemana(ddd%7);
		return dF;
		
	}
	

	

}


