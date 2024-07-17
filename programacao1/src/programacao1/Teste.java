package programacao1;

public class Teste {

	public static void main(String[] args) {
		
		Campeonato camp = new Campeonato(10);
		
		Atleta atleta1 = new Atleta("Maria", 7);
		Atleta atleta2 = new Atleta("Joao", 10);
		Atleta atleta3 = new Atleta("Pedro", 15);
		Atleta atleta4 = new Atleta("Ana", 20);
		Atleta atleta5 = new Atleta("Gui", 14);
		Atleta atleta6 = new Atleta("Rosa", 30);
		Atleta atleta7 = new Atleta("Miranda", 60);
		Atleta atleta8 = new Atleta("Tales", 17);
		Atleta atleta9 = new Atleta("Bispo", 18);
		Atleta atleta10 = new Atleta("Andre", 21);
		
		
		
		
		camp.adicionarAtleta(atleta1);
		camp.adicionarAtleta(atleta2);
		camp.adicionarAtleta(atleta3);
		camp.adicionarAtleta(atleta4);
		camp.adicionarAtleta(atleta5);
		camp.adicionarAtleta(atleta6);
		camp.adicionarAtleta(atleta7);
		camp.adicionarAtleta(atleta8);
		camp.adicionarAtleta(atleta9);
		camp.adicionarAtleta(atleta10);
		
		camp.excluirAtleta(0);
		
		camp.listar(Categoria.INFANTIU);
		
		System.out.println(camp.getQtdCompetidores());
		
		Atleta atleta11 = new Atleta("MariaJ", 7);
		System.out.println(camp.adicionarAtleta(atleta11));
		
		camp.listar(Categoria.INFANTIU);
		
		camp.alterarCategoria(4, Categoria.AMADOR);
		System.out.println(atleta5.getCategoria());
		camp.listar(Categoria.AMADOR);
		
		camp.alterarIdade(4, 20);
		camp.listar(Categoria.AMADOR);
		
		camp.alterarNome(4, "Thierry");
		
		camp.listar(Categoria.AMADOR);
		
		System.out.println(camp.toString());
		
		
		
		
		
	
	
	
	
		
		
	

	}

}
