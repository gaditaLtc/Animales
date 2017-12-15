package animales;

public class Mamifero extends Animal{
		/*desde esta clase puedo acceder directamente a los atributos o métodos protected 
			de animal pero no a los private*/
			int mesesGestacion;

			public Mamifero() {
				super();
				this.mesesGestacion=100;
			}

			public Mamifero(String nombre, int codigo) {
				super(nombre, codigo);
				this.mesesGestacion=100;
			}
			
			public Mamifero(String nombre, int codigo, int mesesGestacion) {
				super(nombre, codigo);
				this.mesesGestacion = mesesGestacion;
			}

			public int getMesesGestacion() {
				return mesesGestacion;
			}

			public void setMesesGestacion(int mesesGestacion) {
				this.mesesGestacion = mesesGestacion;
			}

			@Override
			public String toString() {
				return "* mesesGestacion=" + mesesGestacion +"*";
			}
			
			public void escribirAnimal(){
				
				super.escribirAnimal();
				System.out.println(this.toString());
				
			}
			public void escribirMamifero(){
				
				super.escribirAnimal();
				System.out.println(this.toString());
			}

}
