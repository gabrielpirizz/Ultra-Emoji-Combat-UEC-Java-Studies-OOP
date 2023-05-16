import java.util.Random;

public class Luta {
	//atributos
	private UEC desafiado;
	private UEC desafiante;
	private boolean aprovada;
	
	//métodos
	public void marcarLuta(UEC l1, UEC l2) {
		if (l1.getCategoria().equals(l2.getCategoria())&& (l1!= l2)) {
			this.aprovada = true;
			this.desafiante = l2;
			this.desafiado = l1;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada){
			System.out.println(">->-> DESAFIADO <-<-<");
			this.desafiado.apresentar();
			System.out.println(">->-> DESAFIANTE <-<-<");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			
			case 0:
				System.out.println("O RESULTADO DA LUTA FOI EMPATE!!!");
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				break;
				
			case 1:
				System.out.println("O VENCEDOR FOI O LUTADOR: "+desafiado.getNome());
				desafiado.ganharLuta();
				desafiante.perderLuta();
				break;
			case 2:
				System.out.println("O VENCEDOR FOI O LUTADOR: "+desafiante.getNome());
				desafiado.perderLuta();
				desafiante.ganharLuta();
				break;
			}
			}
			else{
			System.out.println("Luta nao pode acontecer.");
			}
		
		
	}
	//métodos especiais
	public UEC getDesafiado() {
		return desafiado;
		
	}

	public void setDesafiado(UEC desafiado) {
		this.desafiado = desafiado;
	}
	
}
