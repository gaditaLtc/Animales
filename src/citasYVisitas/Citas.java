package citasYVisitas;

import animales.Animal;

import fechas.Fecha;
import horas.Horas;


	public class Citas {
		private Fecha fecha;
		private Horas hora;
		private Animal animal;
		
		
		public Citas(Fecha fecha, Horas hora, Animal animal) {
			
			this.fecha = fecha;
			this.hora = hora;
			this.animal = animal;
			
		}
		
		public Animal getAnimal() {
			return animal;
		}

		public void setAnimal(Animal animal) {
			this.animal = animal;
		}

		
		//public void cobrar visitas del mes
		//informar sobre las visitas recibidas
		//añadir diagnósticos 
		@Override
		public String toString() {
			return "Cita: fecha=" + fecha.escribirFecha() + "; hora=" + hora.visualizarHora() + "; animal=" + animal.toString()
					+ "";
		}
		public void escribirCita(){
			System.out.println(this.toString());
			//this.animal.escribirAnimal2();
		
		}
	}


