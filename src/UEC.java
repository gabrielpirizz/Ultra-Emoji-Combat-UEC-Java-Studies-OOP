
public class UEC implements Lutador {
	//atributos
		private String nome;
		private String nacionalidade;
		private int idade;
		private double altura;
		private double peso;
		private int vitorias;
		private int derrotas;
		private int empates;
		private String categoria;
		//Método Especial Construtor
		public UEC(String no, String na, int id, double al, double pe, int vi, int de, int em ) {
			nome = no;
			nacionalidade = na;
			idade = id;
			altura = al;
			setPeso(pe);
			vitorias = vi;
			derrotas = de;
			empates = em;
		}
		
		
		
		
		
		
		//métodos abstratos
		@Override
		public void apresentar() {
			System.out.println("------------------------------------------");
			System.out.println("CHEGOU A HORA! VAMOS APRESENTAR O LUTADOR");
			System.out.println("-=* Lutador " + this.getNome()+" *=-");
			System.out.println("Nacionalidade --> " + this.getNacionalidade());
			System.out.println("Idade --> " + this.getIdade());
			System.out.println("Altura --> " + this.getAltura()+ " Metros de altura");
			System.out.println("Peso --> " + this.getPeso());
			//System.out.println("Categoria --> " + this.getCategoria());
			System.out.println("_______HISTORICO_______" );
			System.out.println("Numero de Vitorias: " + this.getVitorias());
			System.out.println("Numero de Derrotas: " + this.getDerrotas());
			System.out.println("Numero de Empates: " + this.getEmpates());
			}







		@Override
		public void status() {
		System.out.println("" + this.getNome());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Numero de Vitorias ==> " + this.getVitorias());
		System.out.println("Numero de Derrotas ==> " + this.getDerrotas());
		System.out.println("Numero de Empates ==> " + this.getEmpates());
			
		}







		@Override
		public void ganharLuta() {
			this.setVitorias(getVitorias()+ 1);
		}







		@Override
		public void perderLuta() {
			this.setDerrotas(getDerrotas()+ 1);
			
		}







		@Override
		public void empatarLuta() {
			this.setEmpates(getEmpates()+ 1);
			
		}







		//métodos getters e setter
		public String getNome() {
			return nome;
		}

		public void setNome(String no) {
			this.nome = no;
		}

		public String getNacionalidade() {
			return nacionalidade;
		}

		public void setNacionalidade(String na) {
			this.nacionalidade = na;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int id) {
			this.idade = id;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double al) {
			this.altura = al;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double pe) {
			this.peso = pe;
			setCategoria();
			//getCategoria();
		}
		
		
		public int getVitorias() {
			return vitorias;
		}

		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}

		public int getDerrotas() {
			return derrotas;
		}

		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}

		public int getEmpates() {
			return empates;
		}

		public void setEmpates(int empates) {
			this.empates = empates;
		}
		






		public String getCategoria() {
			return categoria;
		}

		






		private void setCategoria() {
			//this.categoria = categoria;
			
			if (this.peso<52.2) {
			this.categoria = "Invalido";
			}
			else if (peso >= 60 && peso <= 70.3) {
				this.categoria="Leve";}
				
			else if (peso >= 70.31 && peso <= 83.9) {
				this.categoria="Medio";	
			}else if (peso >= 83.91 && peso <= 120.2) {
				this.categoria="Pesado";	
			}else if (peso > 96) {
					this.categoria="Invalido";
				}
		}
		
		

}


