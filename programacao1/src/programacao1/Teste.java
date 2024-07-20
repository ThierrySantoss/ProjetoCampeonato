package programacao1;

public class Teste {

	public static void main(String[] args) {

		Campeonato camp = new Campeonato(10);

		Atleta atleta1 = new Atleta("Maria", 7, "Feminino").definirPorIdade();
		Atleta atleta2 = new Atleta("Joao", 10, "Masculino").definirPorSexo();
		Atleta atleta3 = new Atleta("Pedro", 15, "Masculino").definirPorIdade();
		Atleta atleta4 = new Atleta("Ana", 20, "Feminino").definirPorSexo();
		Atleta atleta5 = new Atleta("Gui", 14, "Masculino").definirPorIdade();
		Atleta atleta6 = new Atleta("Rosa", 30, "Feminino").definirPorSexo();
		Atleta atleta7 = new Atleta("Miranda", 60, "Feminino").definirPorIdade();
		Atleta atleta8 = new Atleta("Tales", 17, "Masculino").definirPorSexo();
		Atleta atleta9 = new Atleta("Bispo", 18, "Masculino").definirPorIdade();
		Atleta atleta10 = new Atleta("Andre", 21, "Masculino").definirPorSexo();

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

		System.out.println(camp.toString());

	}

}
