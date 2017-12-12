package fechas;

public class Test {

	public static void main(String[] args) {
		int equis=0;
		String diaSemana;
		Fecha ff=new Fecha (1,12,1958);
		Fecha fg=new Fecha (01,01,1902);
		equis=ff.diasPasados (fg);
		System.out.println("Número de días:"+ equis);
		diaSemana=ff.diaFecha();
		System.out.println(diaSemana);
		diaSemana=fg.diaFecha();
		System.out.println(diaSemana);

	}

}
