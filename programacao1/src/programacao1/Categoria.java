package programacao1;

public enum Categoria {
	
	INFANTIU("Atleta pertence ao grupo: Infantiu", 1, 5, 10),
	JUVENIL("Atleta pertence ao grupo: Juvenil", 2, 11, 15),
	AMADOR("Atleta pertence ao grupo: Amador", 3, 16, 18),
	PROFISSIONAL("Atleta pertence ao grupo: Profissional", 4, 18, 50),
	APOSENTADO("Atleta pertence ao grupo: Aposentado" , 5, 50, 120);
	
	private String descricao;
	private int id;
	private int idadeMinima;
	private int idadeMaxima;
	
	private Categoria(String descricao, int id, int idadeMinima, int idadeMaxima) {
		this.descricao = descricao;
		this.id = id;
		this.idadeMinima = idadeMinima;
		this.idadeMaxima = idadeMaxima;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getId() {
		return id;
	}

	public int getIdadeMinima() {
		return idadeMinima;
	}

	public int getIdadeMaxima() {
		return idadeMaxima;
	}	
	
	static Categoria definirCategoria(int idade) {
		if(idade < 5) {
			return null;
		} else if(idade >= 5 && idade < 10) {
			return INFANTIU;
		}else if(idade >= 10 && idade < 15) {
			return JUVENIL;
		}else if(idade >= 15 && idade < 18) {
			return AMADOR;
		}else if(idade >= 18 && idade < 50) {
			return PROFISSIONAL;
		}else {
			return APOSENTADO;
		}

	}

	
}
