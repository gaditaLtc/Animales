package citas;

import animales.Animal;
import fechas.Fecha;
import horas.Horas;


	public class Citas {
		private Fecha fecha;
		private Horas hora;
		private Animal animal;
		private int numCitas;
		
		public Citas(Fecha fecha, Horas hora, Animal animal) {
			
			this.fecha = fecha;
			this.hora = hora;
			this.animal = animal;
			this.numCitas = 1;
		}
		public void nuevaVisita(){
			this.numCitas++;
		}
		//public void cobrar visitas del mes
		//informar sobre las visitas recibidas
		//añadir diagnósticos 
		@Override
		public String toString() {
			return "Cita: fecha=" + fecha.escribirFecha() + "; hora=" + hora.visualizarHora() + "; animal=" + animal.toString()
					+ "; numCitas=" + numCitas + "";
		}
		public void escribirCita(){
			System.out.println(this.toString());
			//this.animal.escribirAnimal2();
		}
	}


