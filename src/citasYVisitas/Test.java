package citasYVisitas;

import animales.Animal;
import animales.Mamifero;
import fechas.Fecha;
import horas.Horas;
	public  class Test {

public static void main(String[] args) {
			Animal ani1=new Animal("camaleonTrasto",1); 
			Animal ani2=new Mamifero ("gatoBrujo",2,2);
			Mamifero ani3=new Mamifero ("perroAsia",3,3);
			Fecha f1=new Fecha(8,1,2018);
			Horas h1=new Horas(12,30,0);
			
			Citas citaAnimal1=new Citas (f1,h1,ani1);
			Citas citaAnimal2=new Citas (f1,h1,ani2);
			Citas citaAnimal3=new Citas (f1, h1, ani3);
			System.out.println("Animal 1: escribo a través de Animal public y luego la cita entera:");
			ani1.escribirAnimal();
			ani1.escribirAnimal2();
			citaAnimal1.escribirCita();
			System.out.println("Animal 2: con toString sobreescrito para Mamifero, con animal publico y con escribirAnimal de mamifero ");
			ani2.escribirAnimal(); 
			citaAnimal2.escribirCita();
			ani2.escribirAnimal2();
			//ani2.escribirMamifero no puede porque está declarado como Animal, aunque lo construya bien como Mamifero
			//ani2.escribirAnimal();no puede por protected, se va a buscar el de animal
			System.out.println("Animal 3: escribo primero el animal a través de escribirMamifero:");
			ani3.escribirAnimal();//se va a buscar el de mamifero
			citaAnimal3.escribirCita();
			
			Visitas v1=new Visitas(citaAnimal1,"catarro");
			Visitas v3=new Visitas (citaAnimal3, "gastroenteritis");
			v1.cobrar();
			v3.cobrar();
			v1.resultadoVisita();
			v3.resultadoVisita();
			
		}

	}


