package animales;


	class CodigosAnimales{
		 boolean hasCodigo(int cod){
			boolean hc=true;
			if (cod==0) hc=false; 
			return hc;
		}
	}

	public class Animal {
		protected String nombre;
		private int codigo;
		
		public Animal(String nombre, int codigo) {
			
			this.nombre = nombre;
			this.codigo = codigo;
		}
		public Animal() {
			this.nombre = "";
			this.codigo = 0;
			
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public  int getCodigo() {
			CodigosAnimales n=new CodigosAnimales();
			int cod=0;
			if (!n.hasCodigo(this.codigo)) 
				cod=100;
			else cod=this.codigo;
			return cod;
			 
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		
		@Override
		public String toString() {
			return " nombre=" + nombre + "- codigo=" + codigo + "";
		}
		protected void escribirAnimal(){
			System.out.println(" nombre=" + nombre + "- codigo=" + codigo + "");
		}
		public void escribirAnimal2(){
			System.out.println(" nombre=" + nombre + "- codigo=" + codigo + "");
		}
		
		
		

}
