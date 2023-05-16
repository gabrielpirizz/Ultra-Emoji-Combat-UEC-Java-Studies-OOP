
public class ProgramaPrincipal {

	public static void main(String[] args) {
		UEC l[] = new UEC[6];
		l[0] = new UEC("Sorrisinho", "Brasileiro",
						18, 1.73, 60, 69, 27, 11);
		//l[0].apresentar();		
		//l[0].status();
		
		
		l[1]=new UEC("Tristezinho", "Argentino",
					39,1.85,85,345,55,70);
		//l[1].apresentar();		
		//l[1].status();
		
		l[2]=new UEC("Linguinha", "Estados Unidos",
				37,1.85,85,155,25,10);
		
		l[3]=new UEC("Coraçãozinho", "Brasil",
				38,1.91,110,100,50,40);
		l[4]=new UEC("Bravinho", "Uruguaio",
				32,1.81,120,30,20,10);
		
	//l[2].apresentar();		
	//l[2].status();
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[1], l[3]);
		UEC01.lutar();
	}

}
