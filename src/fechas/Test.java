package fechas;

public class Test {

	public static void main(String[] args) {
		int equis=0;
		Fecha ff=new Fecha (23,11,34);
		Fecha fg=new Fecha (21,10,54);
		equis=ff.diasPasados (fg);
		System.out.println("Número de días:"+ equis);

	}

}
