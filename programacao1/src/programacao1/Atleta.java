package programacao1;

public class Atleta implements MinhaCategoria {

	private String nome;
	private int idade;
	private Categoria categoria;
	private int id;
	private String sexo;

	public Atleta(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + id;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		if (categoria != other.categoria)
			return false;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Atleta: " + nome + ", Idade: " + idade + " anos, Categoria: " + categoria + ", Id: " + id;
	}

	@Override
	public Atleta definirPorIdade() {
		if (this.idade < 5) {
			this.categoria = null;
		} else if (this.idade >= 5 && this.idade < 10) {
			this.categoria = Categoria.INFANTIU;
		} else if (this.idade >= 10 && this.idade < 15) {
			this.categoria = Categoria.JUVENIL;
		} else if (this.idade >= 15 && this.idade < 18) {
			this.categoria = Categoria.AMADOR;
		} else if (this.idade >= 18 && this.idade < 50) {
			this.categoria = Categoria.PROFISSIONAL;
		} else {
			this.categoria = Categoria.APOSENTADO;
		}
		return this;

	}

	@Override
	public Atleta definirPorSexo() {
		if (this.sexo.equalsIgnoreCase(Categoria.FEMININO.name())) {
			this.categoria = Categoria.FEMININO;
		} else if (this.sexo.equalsIgnoreCase(Categoria.MASCULINO.name())) {
			this.categoria = Categoria.MASCULINO;
		}
		return this;
	}

}
